import java.sql.*;

public class InsertStmt {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void CreateUser(String name, String address) {

        String sql = "INSERT INTO userdemo (name , address) VALUES (?,?)";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void ReadUsers() {
        String sql = "SELECT * FROM userdemo";
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                System.out.println("Id: " + id + "\tName: " + name + "\tAddress: " + address);
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static void UpdateUser(int id, String newName, String newAddress) {
        String sql = "UPDATE userdemo SET name = ? , address = ? WHERE id = ?";
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newName);
            pstmt.setString(2, newAddress);
            pstmt.setInt(3, id);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("User Updated Sucessfully");
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static void deleteUser(int id) {
        String sql = "DELETE FROM userdemo WHERE id = ? ";
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("User Deleted Successfully");
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        CreateUser("Ram", "ktm");
        CreateUser("Gari", "patan");
        CreateUser("Sita", "aga");
        // ReadUsers();
        // UpdateUser(9, "Sujal awale", "kathmandu");
        // deleteUser(10);
        // ReadUsers();

    }
}
