package com.myway.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        Cookie cookie1 = new Cookie("test1", "cookie1");
        cookie1.setMaxAge(0);
        resp.addCookie(cookie1);
        resp.sendRedirect("index.html");
    }
}
