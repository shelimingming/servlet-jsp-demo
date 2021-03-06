package com.myway.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("test1","cookie1");
        resp.addCookie(cookie1);

        Cookie cookie2 = new Cookie("test2","cookie2");
        cookie2.setPath("/");
        resp.addCookie(cookie2);

        Cookie cookie3 = new Cookie("test3","cookie3");
        cookie3.setPath("/temp/");
        resp.addCookie(cookie3);
    }
}
