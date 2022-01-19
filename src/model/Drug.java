package model;

public class Drug {
    
    private int drugId;
    private String drugName;
    private String comment;
    private int numberOfItems;
    private boolean pricePerItems;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public boolean isPricePerItems() {
        return pricePerItems;
    }

    public void setPricePerItems(boolean pricePerItems) {
        this.pricePerItems = pricePerItems;
    }

    @Override
    public String toString() {
        return "Drug{" + "drugId=" + drugId + ", drugName=" + drugName + ", comment=" + comment + ", numberOfItems=" + numberOfItems + ", pricePerItems=" + pricePerItems + '}';
    }
     
}
