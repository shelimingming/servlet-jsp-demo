package com.myway.servlet.login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println();

        if (("admin".equals(username) || "sheliming".equals(username)) && "123456".equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("name", username);
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html,charset=UTF-8");
            resp.getWriter().write("欢迎" + username + "<br/>" + "<a href='index.html'>返回首页</a>");
        } else {
            resp.sendRedirect("page/login.html");
        }
    }
}
