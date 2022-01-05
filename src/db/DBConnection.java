package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/pharmacy";
        String userName = "root";
        String pass = "";

        Connection cn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, userName, pass);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cn;
    }

}
