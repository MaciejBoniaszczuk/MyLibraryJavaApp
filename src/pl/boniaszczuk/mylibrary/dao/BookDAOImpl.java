package pl.boniaszczuk.mylibrary.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.boniaszczuk.mylibrary.model.Book;
import pl.boniaszczuk.mylibrary.util.ConnectionProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDAOImpl implements BookDAO {

    private static final String CREATE_BOOK = "INSERT INTO book(title, author, description,url,user_id,date, note)" +
            "VALUES(:title,:author,:description,:url,:user_id,:date,:note);";

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
        return null;
    }
}
