import java.sql.*;
public class ex_33_TransactionJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bank";
        String user = "root", pass = "";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)) {
            con.setAutoCommit(false);
            
            try {
                // Transfer $100 from account 1 to 2
                PreparedStatement withdraw = con.prepareStatement(
                    "UPDATE accounts SET balance = balance - 100 WHERE id = 1");
                withdraw.executeUpdate();
                
                PreparedStatement deposit = con.prepareStatement(
                    "UPDATE accounts SET balance = balance + 100 WHERE id = 2");
                deposit.executeUpdate();
                
                con.commit();
                System.out.println("Transaction successful");
            } catch(SQLException e) {
                con.rollback();
                System.out.println("Transaction failed");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
