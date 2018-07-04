package com.myway.servlet.login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AfterLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Object name = session.getAttribute("name");
        System.out.println("sessionId=" + session.getId());
        if (null != name) {
            resp.setCharacterEncoding("UTF-8");
            resp.setHeader("Content-Type", "text/html,charset=UTF-8");
            resp.getWriter().write(name + "登录成功");
        } else {
            resp.sendRedirect("page/login.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
