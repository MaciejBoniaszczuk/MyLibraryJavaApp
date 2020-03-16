package pl.boniaszczuk.mylibrary.controller;

import pl.boniaszczuk.mylibrary.model.User;
import pl.boniaszczuk.mylibrary.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class BookAddController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String title = request.getParameter("inputTitle");
        String author = request.getParameter("inputAuthor");
        String description = request.getParameter("inputDescription");
        String url = request.getParameter("inputUrl");
        int note = Integer.parseInt(request.getParameter("inputNote"));
        User authenticatedUser = (User) request.getSession().getAttribute("user");
        if(request.getUserPrincipal() != null) {
            BookService bookService = new BookService();
            bookService.addBook(title,author, description, url, authenticatedUser,note);
            response.sendRedirect(request.getContextPath() + "WEB-INF/afterlogin.jsp");
        } else {
            response.sendError(403);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getUserPrincipal() != null) {
            request.getRequestDispatcher("WEB-INF/new.jsp").forward(request, response);
        } else {
            response.sendError(403);
        }
    }
}
