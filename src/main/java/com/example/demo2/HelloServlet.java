package com.example.demo2;

import java.io.*;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


//@WebServlet(name = "helloServlet", value = "/hello-servlet")
@WebServlet("/s04")
public class HelloServlet extends HttpServlet {
    private String message;
    @Override
    public void init() {
        System.out.println("__init__");
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}