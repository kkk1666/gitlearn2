package cn.itcast.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//123ľͷ��123+456+234
//fixed
//dsgsjkfhfskdu
//fixed by dep
//fixeddev
//��git4�ĵĴ���
//��git3�ڿ�����
//dhfkahjsk
//fiosfldjglsahg
//git3ûaddstash

public class Helloservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入到HelloServlet");
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
