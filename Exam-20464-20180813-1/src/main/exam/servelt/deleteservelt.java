package main.exam.servelt;

import main.exam.dao.filmdao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by liangshuang on 2018/8/13.
 */
public class deleteservelt  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub

        String id = request.getParameter("id");
        filmdao de = new filmdao();
        de.deletenum(id);

        response.sendRedirect("/filmservelt");

//      super.doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
//      super.doPost(request, response);
        doGet(request, response);
    }

}
