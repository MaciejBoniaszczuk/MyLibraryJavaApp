package pl.boniaszczuk.mylibrary.dao;


import pl.boniaszczuk.mylibrary.model.UserBookshelf;

public interface BookshelfDAO extends GenericDAO<UserBookshelf, Long>{

    public UserBookshelf getUserBookshelfByUserIdBookId(long userId,long bookId);
}
