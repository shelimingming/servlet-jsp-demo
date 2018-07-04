package com.myway.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReadCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        StringBuilder sb = new StringBuilder("cookie:<br/>");

        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();


            sb.append(name + ":" + value + "<br/>");
        }
        resp.setContentType("text/html,charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().write(sb.toString());
    }
}
