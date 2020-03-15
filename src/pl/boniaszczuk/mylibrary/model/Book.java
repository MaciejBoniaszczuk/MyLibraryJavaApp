package pl.boniaszczuk.mylibrary.model;

import java.sql.Timestamp;
import java.util.Objects;

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
        this.user = new User(book.user);
        this.note = book.note;
    }
    public Book(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                note == book.note &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                Objects.equals(description, book.description) &&
                url.equals(book.url) &&
                timestamp.equals(book.timestamp) &&
                user.equals(book.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, description, url, timestamp, user, note);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", timestamp=" + timestamp +
                ", user=" + user +
                ", note=" + note +
                '}';
    }
}
