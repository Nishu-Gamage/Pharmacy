package model;

import java.util.Date;

public class StockUpdate {

    private int sDrugId;
    private int sCode;
    private int sLotNo;
    private int sNoOfItem;
    private double sPrice;
    private Date sDate;

    public int getsDrugId() {
        return sDrugId;
    }

    public void setsDrugId(int sDrugId) {
        this.sDrugId = sDrugId;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }

    public int getsLotNo() {
        return sLotNo;
    }

    public void setsLotNo(int sLotNo) {
        this.sLotNo = sLotNo;
    }

    public int getsNoOfItem() {
        return sNoOfItem;
    }

    public void setsNoOfItem(int sNoOfItem) {
        this.sNoOfItem = sNoOfItem;
    }

    public double getsPrice() {
        return sPrice;
    }

    public void setsPrice(double sPrice) {
        this.sPrice = sPrice;
    }

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    @Override
    public String toString() {
        return "StockUpdate{" + "sDrugId=" + sDrugId + ", sCode=" + sCode + ", sLotNo=" + sLotNo + ", sNoOfItem=" + sNoOfItem + ", sPrice=" + sPrice + ", sDate=" + sDate + '}';
    }

}
