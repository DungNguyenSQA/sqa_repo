package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQAConnection {
	
	private static Connection conn;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String USER = "root";
	static final String PASS = "testsqa";

	//singleton pattern
	public static Connection getConnection() throws Exception{
		if (conn == null){
			//Register the mysql driver
			Class.forName("com.mysql.jdbc.Driver");
			//Get a connection object from driver manager.
			//pass the db url , user name and password
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		}
		return conn;
	}
}
