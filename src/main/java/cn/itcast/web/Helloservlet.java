package cn.itcast.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//123木头人123+456+234
//fixed
//dsgsjkfhfskdu
//fixed by dep
//fixeddev
//我git4改的代码
//我git3在开发了
//dhfkahjsk
//fiosfldjglsahg
//git3没addstash

public class Helloservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("杩涘叆鍒癏elloServlet");
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
