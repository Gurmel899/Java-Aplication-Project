
package koneksi;

import UAS_NO2.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class koneksi {
    public static Connection koneksi;
    
    public static Connection koneksi()throws SQLException{
        try{
            String url ="jdbc:mysql://localhost:3306/uas";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            System.err.println("koneksi gagal" + e.getMessage());
    }
    return koneksi;
}
}