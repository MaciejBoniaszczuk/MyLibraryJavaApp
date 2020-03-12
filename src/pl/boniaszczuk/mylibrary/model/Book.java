package pl.boniaszczuk.mylibrary.model;

import java.sql.Timestamp;

public class Book {
    private long  id;
    private String title;
    private String author;
    private String description;
    private String url;
    private Timestamp timestamp;
    private User user;
    private int note;

    public Book(Book book){
        this.id = book.id;
        this.title = book.title;
        this.author = book.author;
        this.description = book.description;
        this.url = book.url;
        this.timestamp = new Timestamp(book.timestamp.getTime());
        this.user = book.user;
        this.note = book.note;
    }
    public Book(){}

}
