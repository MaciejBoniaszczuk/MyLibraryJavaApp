package pl.boniaszczuk.mylibrary.dao;

public class MysqlDAOFactory extends DAOFactory{
    @Override
    public BookDAO getBookDAO() {
        return new BookDAOImpl();
    }

    @Override
    public UserDAO getUserDAO() {
        return new UserDAOImpl();
    }

    @Override
    public BookshelfDAO getBookshelfDAO() {
        return new BookshelfDAOImpl();
    }
}
