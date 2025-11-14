package CRUD;
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";

        String sql = "CREATE TABLE userdemo (" + "id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, " + "name VARCHAR(30), "
                + "address VARCHAR(50)" + ")";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Connected to the Database");
            } else {
                System.out.println("Failed to make a connection");
            }

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Table User Created Successfully");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
