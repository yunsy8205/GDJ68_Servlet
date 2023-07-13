package com.iu.main.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	
	public static Connection getConnection() throws Exception{
		String user="user01";
		String password="user01";
		String url="jdbc:oracle:thin:@54.180.86.129:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
	
	//1.드라이버를 메모리에 로딩
		Class.forName(driver);
		
	//2.DB 연결
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
}
