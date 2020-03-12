package pl.boniaszczuk.mylibrary.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getUserPrincipal() != null) {
            response.sendRedirect(request.getContextPath() + "/afterlogin.jsp");
        } else {
            response.sendError(403);
        }
    }
}
