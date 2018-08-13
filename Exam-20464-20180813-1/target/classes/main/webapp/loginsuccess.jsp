<%@ page import="main.exam.entity.film" %><%--
  Created by IntelliJ IDEA.
  User: liangshuang
  Date: 2018/8/13
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>

<%@page import="main.exam.entity.film"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

</head>
<body>



    <table align="center" width="1000" border="1" height="180"
           bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
        <tr bgcolor="white">
            <td align="center" colspan="7">
                <h2>列举所有的电影的信息</h2>
            </td>
        </tr>
        <tr align="center" bgcolor="white">
            <td><b>film_id</b></td>
            <td><b>title</b></td>
            <td><b>description</b></td>
            <td><b>language_name</b></td>
            <td><b>修改</b></td>
            <td><b>删除</b></td>
        </tr>
        <%
            // 获取跑男信息集合

            List list = (List) request.getAttribute("list");
            // 判断集合是否有效
            if (list == null || list.size() < 1) {
                System.out.print("没有数据！");
            } else
            {
                // 遍历跑男集合中的数据
                for (int i=0;i<list.size();i++)
                {
                    film us= (film) list.get(i);
        %>
        <tr align="center"  bgcolor="white">
            <td><%=us.getFilm_id()%></td>
            <td><%=us.getTitle()%></td>
            <td><%=us.getDescription()%></td>
          <%--<td><%=us.getLanguage()%></td>--%>
             <td>English</td>

            <td >
                <a href="updateservelt?num=<%=us.getFilm_id()%>">修改</a>
            </td>
            <td><a href="deleteservelt?id=<%=us.getFilm_id()%>">删除</a> </td>
        </tr>
        <%
                }
            }
        %>
        <form name="insert" method="post" action="">
            <input type="submit" bgcolor="white" value="新增" align="bottom" colspan="7">
        </form>


    </table>

</body>
</html>
