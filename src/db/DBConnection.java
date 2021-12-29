
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
    public static Connection getConnecion(){
        
        String url = "jdbc:mysql://localhost:3306/pharmacy" ;        
        String userName = "root";
        String password = "";
        
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url,userName, password);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cn;        
    }
    
    
}
