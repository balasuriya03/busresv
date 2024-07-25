package Busresv;

import java.sql.*;

public class DBconnection {

	private static String url="jdbc:mysql://localhost:3306/busresv";
	private static String username= "root";
	private static String password= "Suriya@123";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
	
}
