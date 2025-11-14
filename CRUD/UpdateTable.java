package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "UPDATE users SET address = 'Lalitpur' WHERE id = 1";
            int rowsAffected = stmt.executeUpdate(sql);
            if (rowsAffected > 0) {
                System.out.println("Data updated successfully! " + rowsAffected + " row(s) affected.");
            } else {
                System.out.println("No rows were updated. Check if the user ID exists.");
            }

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
