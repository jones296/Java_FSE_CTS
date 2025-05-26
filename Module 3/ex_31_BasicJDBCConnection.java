import java.sql.*;
public class ex_31_BasicJDBCConnection{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root", pass = "";
        
        try(Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users")) {
            
            while(rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
