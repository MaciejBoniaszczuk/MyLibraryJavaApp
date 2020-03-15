package pl.boniaszczuk.mylibrary.controller;

import pl.boniaszczuk.mylibrary.model.Book;
import pl.boniaszczuk.mylibrary.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@WebServlet("/bookshelf")
public class HomeController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        saveBooksInRequest(request);
        request.getRequestDispatcher("bookshelf.jsp").forward(request, response);
    }

    private void saveBooksInRequest(HttpServletRequest request) {
        BookService bookService = new BookService();
        List<Book> allBooks = bookService.getAllBooks((d1, d2) -> d2.getTimestamp().compareTo(d1.getTimestamp()));
        System.out.println(allBooks);
        request.setAttribute("books", allBooks);
    }
}
