package main.exam.servelt;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.exam.dao.filmdao;
import main.exam.entity.film;


public class filmservelt extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
            filmdao filmdao = new filmdao();
            List<film> list = filmdao.searchall();
            request.setAttribute("list", list);//request设置传输数据的tag（"list"）和对象(list);
        }
        catch(Exception  e)
        {
            e.printStackTrace();
        }

        //请求转发到指定URL,是服务器端跳转
        request.getRequestDispatcher("loginsuccess.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
}

