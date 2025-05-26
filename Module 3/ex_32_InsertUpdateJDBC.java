import java.sql.*;
public class ex_32_InsertUpdateJDBC {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root", pass = "";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)) {
            // Insert
            String insertSQL = "INSERT INTO users(name) VALUES(?)";
            try(PreparedStatement ps = con.prepareStatement(insertSQL)) {
                ps.setString(1, "Alice");
                ps.executeUpdate();
            }
            
            // Update
            String updateSQL = "UPDATE users SET name = ? WHERE id = ?";
            try(PreparedStatement ps = con.prepareStatement(updateSQL)) {
                ps.setString(1, "Bob");
                ps.setInt(2, 1);
                ps.executeUpdate();
            }
        }
    }
}
