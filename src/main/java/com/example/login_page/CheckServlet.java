package com.example.login_page;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/check")
public class CheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        int a = ConnectionToDB.Check(request.getParameter("username"),request.getParameter("password"));
        if (a>0)
            request.getRequestDispatcher("Hello.jsp").forward(request,response);
        else {
            a = 0;
            arr.add(a);
            request.setAttribute("val",arr);request.getRequestDispatcher("Index.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
