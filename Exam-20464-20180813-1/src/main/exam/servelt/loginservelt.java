package main.exam.servelt;


import main.exam.util.database;


import java.io.IOException;

import java.sql.ResultSet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liangshuang on 2018/8/13.
 */
public class loginservelt extends HttpServlet implements Servlet {
    public void  loginservlet ()
    {
        // TODO Auto-generated constructor stub

    }

    @Override
    protected void doGet ( HttpServletRequest arg0, HttpServletResponse arg1 )
            throws ServletException, IOException
    {
    }

    @Override
    protected void doPost ( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        response.setContentType("text/html");
        String result = "";
        // 获取用户名

        String sUserName = request.getParameter("txtUserName");
        if (sUserName == "" || sUserName == null || sUserName.length() > 20) {
            try {
                result = "请输入用户名（不超过20字符）！";
                request.setAttribute("ErrorUserName", result);
                response.sendRedirect("login.jsp");
            } catch (Exception e) {
            }
        }

        // 登记JDBC驱动程序
        String sql = "select * from customer where first_name='" + sUserName + "'";

        database db = new database();
        ResultSet rs = db.query(sql);
        try {
            if (rs.next()) {
                request.getSession().setAttribute("UserName", sUserName);
                response.sendRedirect("/filmservelt");
            } else {
                response.sendRedirect("loginfail.jsp");
            }
        } catch (Exception e) {
            System.out.println(e.toString() + sql);
        }

    }

}
