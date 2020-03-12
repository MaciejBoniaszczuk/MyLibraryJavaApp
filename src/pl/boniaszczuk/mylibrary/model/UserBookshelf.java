package pl.boniaszczuk.mylibrary.model;

import java.sql.Timestamp;
import java.util.Objects;

public class UserBookshelf {
    private long id;
    private long userId;
    private long bookId;
    private Timestamp timestamp;

    public UserBookshelf(){}
    public UserBookshelf(UserBookshelf userBookshelf){
        this.id = userBookshelf.id;
        this.userId = userBookshelf.userId;
        this.bookId = userBookshelf.bookId;
        this.timestamp =  new Timestamp(userBookshelf.timestamp.getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "UserBookshelf{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBookshelf that = (UserBookshelf) o;
        return id == that.id &&
                userId == that.userId &&
                bookId == that.bookId &&
                timestamp.equals(that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, bookId, timestamp);
    }
}
