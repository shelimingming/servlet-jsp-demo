package com.myway.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getInitParameter("test"));
    }


    @Override
    public void init() throws ServletException {
        System.out.println("HelloServlet2.init");
        getInitParameter("test");

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2.service");
    }

    @Override
    public void destroy() {
        System.out.println("HelloServlet2.destroy");
    }
}
