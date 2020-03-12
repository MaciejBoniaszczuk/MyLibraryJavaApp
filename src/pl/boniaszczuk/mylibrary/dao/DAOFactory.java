package pl.boniaszczuk.mylibrary.dao;


public abstract class DAOFactory{

    public abstract BookDAO getBookDAO();

    public abstract UserDAO getUserDAO();

    public abstract BookshelfDAO getBookshelfDAO();
}
