package logic;

import db.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Drug;
import model.DrugIssue;

public class DrugIssueLogic {

    public int getOrderID() {

        int orderId = 0;

        try {
            DbConnection db = new DbConnection();
            String sql = "SELECT orderId FROM `issue` ORDER BY orderId DESC LIMIT 1";

            PreparedStatement p = db.getConnection().prepareStatement(sql);

            ResultSet r = p.executeQuery();

            if (r.next()) {
                orderId = r.getInt("orderId");
            }
            orderId++;

        } catch (SQLException ex) {
            Logger.getLogger(DrugIssueLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderId;
    }

    public DrugIssue getUnitPriceAndNumberOfItems(int id) {

        double pricePerItems = 0;
        int numberOfItems = 0;
        DrugIssue dr = new DrugIssue();

        try {
            DbConnection db = new DbConnection();
            String sql = "SELECT  `numberOfItems`, `pricePerItems` FROM `druginfo` WHERE drugId=?";

            PreparedStatement p = db.getConnection().prepareStatement(sql);
            p.setInt(1, id);
            ResultSet r = p.executeQuery();

            if (r.next()) {
                numberOfItems = r.getInt("numberOfItems");
                pricePerItems = r.getDouble("pricePerItems");
                dr.setNumberOfItem(numberOfItems);
                dr.setPricePeritem(pricePerItems);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DrugIssueLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dr;
    }

    public boolean updateNumberOfItems(DrugIssue drugIssue) {

        boolean result = false;
        
        try {
            DbConnection db = new DbConnection();
            String sql = "UPDATE `druginfo` SET `numberOfItems`=? WHERE drugId=?";

            PreparedStatement p = db.getConnection().prepareStatement(sql);
            p.setInt(1, drugIssue.getNumberOfItem());
            p.setInt(2, drugIssue.getDrugId());
            p.execute();
            result = true;

        } catch (SQLException ex) {
            Logger.getLogger(DrugIssueLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
