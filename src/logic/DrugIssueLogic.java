package logic;

import db.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
}
