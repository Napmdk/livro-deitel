package model;

public class ItemModel {

    private int itemId;
    private double value;

    public ItemModel(int itemId, double value) {
        if (itemId > 0)
            this.itemId = itemId;
        if (value > 0.0)
            this.value = value;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemValue(double value) {
        if (value > 0.0)
            this.value = value;
    }

    public int getItemId() {
        return itemId;
    }

    public double getItemValue() {
        return value;
    }

    public static double calculateSalesComission(double totalSalesValue) {
        if (totalSalesValue > 0.0)
            return 0.09 * totalSalesValue + 200;
        else
            return 0.0;
    }

}
