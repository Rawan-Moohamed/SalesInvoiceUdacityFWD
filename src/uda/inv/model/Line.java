
package uda.inv.model;

public class Line {
    private String itemsLine;
    private double priceOfItem;
    private int countOfItems;
    private Invoice invoiceRecord;

    public Line() {
    }

    public Line(String item, double price, int count, Invoice invoice) {
        this.itemsLine = item;
        this.priceOfItem = price;
        this.countOfItems = count;
        this.invoiceRecord = invoice;
    }

    public double getLineTotal() {
        return priceOfItem * countOfItems;
    }
    
    public int getCountOfItems() {
        return countOfItems;
    }

    public void setCountOfItems(int countOfItems) {
        this.countOfItems = countOfItems;
    }

    public String getItemsLine() {
        return itemsLine;
    }

    public void setItemsLine(String itemsLine) {
        this.itemsLine = itemsLine;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    @Override
    public String toString() {
        return "Line{" + "number=" + invoiceRecord.getNumberOfInv() + ", item=" + itemsLine + ", price=" + priceOfItem + ", count=" + countOfItems + '}';
    }

    public Invoice getInvoiceRecord() {
        return invoiceRecord;
    }
    
    public String getAsCSV() {
        return invoiceRecord.getNumberOfInv() + "," + itemsLine + "," + priceOfItem + "," + countOfItems;
    }
    
}
