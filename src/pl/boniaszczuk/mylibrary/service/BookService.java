package pl.boniaszczuk.mylibrary.service;

import pl.boniaszczuk.mylibrary.dao.BookDAO;
import pl.boniaszczuk.mylibrary.dao.DAOFactory;
import pl.boniaszczuk.mylibrary.model.Book;
import pl.boniaszczuk.mylibrary.model.User;

import java.util.Date;
import java.sql.Timestamp;

public class BookService {
    public void addBook(String title,String author, String desc, String url, User user, int note) {
       Book book = creteBookObject(author,title, desc, url, user,note);
        DAOFactory factory = DAOFactory.getDAOFactory();
        BookDAO bookDAO = factory.getBookDAO();
        bookDAO.create(book);
    }

    private Book creteBookObject(String author, String title, String desc, String url, User user, int note) {
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        book.setDescription(desc);
        book.setUrl(url);
        User userCopy = new User(user);
        book.setUser(userCopy);
        book.setTimestamp(new Timestamp(new Date().getTime()));
        book.setNote(note);
        return book;
    }
}
