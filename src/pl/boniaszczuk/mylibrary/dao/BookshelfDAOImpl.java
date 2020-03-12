package pl.boniaszczuk.mylibrary.dao;

import pl.boniaszczuk.mylibrary.model.UserBookshelf;

import java.util.List;

public class BookshelfDAOImpl implements BookshelfDAO {
    @Override
    public UserBookshelf getUserBookshelfByUserIdBookId(long userId, long bookId) {
        return null;
    }

    @Override
    public UserBookshelf create(UserBookshelf newObject) {
        return null;
    }

    @Override
    public UserBookshelf read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(UserBookshelf updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<UserBookshelf> getAll() {
        return null;
    }
}
