package logic;

import db.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Drug;

public class DrugRegister {

    public boolean saveDrugInformation(Drug a) {

        try {
            DbConnection db = new DbConnection();
            String sql = "INSERT INTO `druginfo`(`drugId`, `drugName`, `comment`)VALUES (?, ?, ?)";

            PreparedStatement p = db.getConnection().prepareStatement(sql);
            p.setInt(1, a.getDrugId());
            p.setString(2, a.getDrugName());
            p.setString(3, a.getComment());
            p.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(DrugRegister.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
