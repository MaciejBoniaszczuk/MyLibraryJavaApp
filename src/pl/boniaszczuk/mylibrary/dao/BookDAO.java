package pl.boniaszczuk.mylibrary.dao;

import pl.boniaszczuk.mylibrary.model.Book;

import java.util.List;

public interface BookDAO extends GenericDAO<Book, Long> {

    List<Book> getAll();
}
