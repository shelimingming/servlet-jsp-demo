package com.myway.servlet.form;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        //get请求这样设置没有用
        req.setCharacterEncoding("UTF-8");


        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("password:" + new String(username.getBytes("ISO8859-1"), "UTF-8") + ",password=" + password);

        //resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-Type", "text/html,charset=UTF-8");
        resp.getWriter().write("username:" + username + ",password=" + password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        doGet(req, resp);
    }
}
