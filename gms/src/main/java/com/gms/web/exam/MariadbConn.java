package com.gms.web.exam;

import java.sql.*;

public class MariadbConn {
	public String exam() {
		Connection conn;
		Statement stmt;
		String s = "";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/mariadb", 
					"mariadb", 
					"mariadb");
			stmt = conn.createStatement();
			String sql = String.format(
					"SELECT USERID FROM MEMBER "
					);
			ResultSet rs = stmt.executeQuery(sql);			
			if(rs.next()) {
				s = rs.getString("USERID");
			}else {
				s = "연결 실패";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;//리턴값이 무조건 있어야해 getter로 만들어야해
	}
}
