package logic;

import db.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Drug;
import model.StockUpdate;

public class DrugLogic {

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
            Logger.getLogger(Drug.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String getDrugName(int id) {
        String name = "";

        try {
            DbConnection db = new DbConnection();
            String sql = "SELECT drugName FROM `druginfo` WHERE drugId=?";

            PreparedStatement p = db.getConnection().prepareStatement(sql);
            p.setInt(1, id);
            ResultSet r = p.executeQuery();

            if (r.next()) {
                name = r.getString("drugName");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DrugLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }

    public boolean updateDrugInformation(StockUpdate st) {

        try {
            DbConnection db = new DbConnection();
            String sql = "UPDATE druginfo SET numberOfItems =?, pricePerItems =? WHERE drugId = ?";

            PreparedStatement p = db.getConnection().prepareStatement(sql);
            p.setInt(1, st.getsNoOfItem());
            p.setDouble(2, st.getsPrice());
            p.setInt(3, st.getsDrugId());
            p.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(DrugLogic.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
//    git commit test

    public String getNumberOfItems(int id) {
        
        String numberOfItem = "";
        
        try {
            DbConnection db = new DbConnection();
            String sql = "SELECT numberOfItems FROM `druginfo` WHERE drugId=?";

            PreparedStatement p = db.getConnection().prepareStatement(sql);
            p.setInt(1, id);
            ResultSet r = p.executeQuery();

            if (r.next()) {
                numberOfItem = r.getString("numberOfItems");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DrugLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numberOfItem;
    }
    
    
    
    
    
}
