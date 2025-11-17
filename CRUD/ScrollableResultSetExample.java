import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;  
import java.sql.SQLException;

public class ScrollableResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * FROM userdemo";

            ResultSet rs = stmt.executeQuery(sql);
            // rs.beforeFirst(); // move cursor before first row
            rs.afterLast(); // movie cursor to last position

            // Process the result set

            while (rs.previous()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");

                System.out.println("Id: " + id + "\tName: " + name + "\tAddress: " + address);

            }

            rs.absolute(5); // move cursor to 5th record
            // System.out.println("ID : "+rs.getInt(1) + "Name: " + rs.getString(2) + "
            // Address: "+rs.getString(3));
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
