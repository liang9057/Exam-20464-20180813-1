package main.exam.dao;

/**
 * Created by liangshuang on 2018/8/13.
 */

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import main.exam.entity.film;
import main.exam.util.database;


public class filmdao {

        public static List searchall()
        {
                List<film> runman = new ArrayList<film>();
                String sql = "select film.film_id,title,description,language.name from film,language where film.language_id=language.language_id ";
                database db = new database();
                ResultSet rs = db.query(sql);
                try {
                    while (rs.next()) {
                        film u = new film();
                        //创建film对象，将返回结果添加到新建的runman的list中
                        u.setFilm_id(rs.getInt("film_id"));
                        u.setTitle(rs.getString("title"));
                        u.setDescription(rs.getString("description"));
                    //    u.setLanguage(rs.getString("language"));

                        runman.add(u);
                    }
                }
                     catch(Exception e){
                        e.printStackTrace();
                }
            return runman;
        }

    public static void deletenum(String i)
    {

      //  int re = -1;
        String sql="SET FOREIGN_KEY_CHECKS = 0";
        database db = new database();
        db.execute(sql);
        sql = "delete from film where film_id = " + i;
        db.execute(sql);
        sql="SET FOREIGN_KEY_CHECKS = 1";
        db.execute(sql);
    }
}

