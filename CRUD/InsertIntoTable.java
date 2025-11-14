
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";

        String sql = "INSERT INTO userdemo VALUES(1,'Sujal','Chyasal')";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Data inserted successfully!");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
