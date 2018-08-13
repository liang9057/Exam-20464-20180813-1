package main.exam.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class database {
	
	Connection conn = null;
	
	private void open(){	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
						"root", "root");
			} catch (Exception e) {
				System.out.println(e.toString());
			}		
	}
	

	private void close(){
		conn = null;	
	}
	
	public ResultSet query(String sql){
		ResultSet rs = null;
		open();
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			System.out.println(sql + e.toString());
		}
		return rs;
	}
	
	public int execute(String sql){
		int re = -1;
		open();
		try {
			Statement stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(sql + e.toString());
		}
		close();
		return re;
	}

}
