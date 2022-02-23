
package model;

public class DrugIssue {
    
    private int drugId;
    private String drugName;
    private double pricePeritem;
    private int numberOfItem;
    private double total;
    private double balance;

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getPricePeritem() {
        return pricePeritem;
    }

    public void setPricePeritem(double pricePeritem) {
        this.pricePeritem = pricePeritem;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "DrugIssue{" + "drugId=" + drugId + ", drugName=" + drugName + ", pricePeritem=" + pricePeritem + ", numberOfItem=" + numberOfItem + ", total=" + total + ", balance=" + balance + '}';
    }

    
}
