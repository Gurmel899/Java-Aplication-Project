
package form_data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {

    Connection con;
    Statement stm;
    private static Connection mysqltojava;
    public static Connection mysqltojava()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/tbl_mhs"; 
            String user="root"; 
            String pass=""; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqltojava=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); 
        }
        return mysqltojava;
    }    
}




