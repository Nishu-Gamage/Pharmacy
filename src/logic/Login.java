package logic;

import db.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    public boolean checkUserCredentials(String userName, String pass) {
        String storedPassword = "";
        DbConnection db = new DbConnection();
        String sql = "SELECT PASSWORD FROM user WHERE userName=?";

        try {
            PreparedStatement p = db.getConnection().prepareStatement(sql);
            p.setString(1, userName);
            ResultSet r = p.executeQuery();

            if (r.next()) {
                storedPassword = r.getString("PASSWORD");
            }
            if (!storedPassword.equals("") && storedPassword.equals(pass)) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
