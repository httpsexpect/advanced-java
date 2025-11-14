package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DBConnection {
	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String user = "root";
		String password = "";
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("Connected to the Database");
			} else {
				System.out.println("Failed to make a connection");
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}