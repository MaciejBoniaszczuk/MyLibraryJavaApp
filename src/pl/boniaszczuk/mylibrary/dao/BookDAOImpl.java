package pl.boniaszczuk.mylibrary.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.boniaszczuk.mylibrary.model.Book;
import pl.boniaszczuk.mylibrary.model.User;
import pl.boniaszczuk.mylibrary.util.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDAOImpl implements BookDAO {

    private static final String CREATE_BOOK = "INSERT INTO book(title, author, description,url,user_id,date, note)" +
            "VALUES(:title,:author,:description,:url,:user_id,:date,:note);";


    private static final String READ_ALL_BOOKS = "SELECT user.user_id, username, email, is_active, password, book_id, author," +
           "title,description,url,note,date  FROM book  LEFT JOIN user ON book.user_id=user.user_id";

    private static final String READ_BOOKS_BY_USER = "SELECT * FROM book where user_id = :id";



    private NamedParameterJdbcTemplate template;

    public BookDAOImpl(){
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());

    }
    @Override
    public Book create(Book book) {
        Book resultBook = new Book(book);
        KeyHolder holder = new GeneratedKeyHolder();
        Map<String,Object> paramMap = new HashMap<String,Object>();
        paramMap.put("title",book.getTitle());
        paramMap.put("author",book.getAuthor());
        paramMap.put("description",book.getDescription());
        paramMap.put("url",book.getUrl());
        paramMap.put("user_id", book.getUser().getId());
        paramMap.put("date",book.getTimestamp());
        paramMap.put("note",book.getNote());
        SqlParameterSource paramSource = new MapSqlParameterSource(paramMap);
        int update = template.update(CREATE_BOOK, paramSource, holder);
        if(update > 0) {
            resultBook.setId(holder.getKey().longValue());
        }
        return resultBook;
    }

    @Override
    public Book read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(Book updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }


    @Override
    public List<Book> getAll() {

        List<Book> books = template.query(READ_ALL_BOOKS, new BooksRowMapper());
        return books;
    }


    private class BooksRowMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet resultSet, int row) throws SQLException {
            Book book = new Book();
            book.setId(resultSet.getLong("book_id"));
            book.setAuthor(resultSet.getString("author"));
            book.setTitle(resultSet.getString("title"));
            book.setDescription(resultSet.getString("description"));
            book.setUrl(resultSet.getString("url"));
            book.setTimestamp(resultSet.getTimestamp("date"));
            book.setNote(resultSet.getInt("note"));
            User user = new User();
            user.setId(resultSet.getLong("user_id"));
            user.setUsername(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));
            user.setPassword(resultSet.getString("password"));
            book.setUser(user);

            return book;

        }


    }

}
