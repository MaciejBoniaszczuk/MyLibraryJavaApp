package pl.boniaszczuk.mylibrary.model;

import java.util.Objects;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private boolean active;
    private int booksCounter;

    public User(){}

    public User(User user){
        this.id = user.id;
        this.username = user.username;
        this.email = user.email;
        this.password = user.password;
        this.booksCounter =user.booksCounter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getBooksCounter() {
        return booksCounter;
    }

    public void setBooksCounter(int booksCounter) {
        this.booksCounter = booksCounter;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", booksCounter=" + booksCounter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                active == user.active &&
                booksCounter == user.booksCounter &&
                username.equals(user.username) &&
                email.equals(user.email) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, password, active, booksCounter);
    }
}
