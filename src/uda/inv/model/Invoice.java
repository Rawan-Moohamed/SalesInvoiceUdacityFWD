
package uda.inv.model;

import java.util.ArrayList;

public class Invoice {
    private int numberOfInv;
    private String dateOfInv;
    private String customerName;
    private ArrayList<Line> linesRecord;
    
    public Invoice() {
    }

    public Invoice(int num, String date, String customer) {
        this.numberOfInv = num;
        this.dateOfInv = date;
        this.customerName = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Line line : getLinesRecord()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Line> getLinesRecord() {
        if (linesRecord == null) {
            linesRecord = new ArrayList<>();
        }
        return linesRecord;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumberOfInv() {
        return numberOfInv;
    }

    public void setNumberOfInv(int numberOfInv) {
        this.numberOfInv = numberOfInv;
    }

    public String getDateOfInv() {
        return dateOfInv;
    }

    public void setDateOfInv(String dateOfInv) {
        this.dateOfInv = dateOfInv;
    }

    @Override
    public String toString() {
        return "Invoice{" + "number=" + numberOfInv + ", date=" + dateOfInv + ", customer=" + customerName + '}';
    }
    
    public String getAsCSV() {
        return numberOfInv + "," + dateOfInv + "," + customerName;
    }
    
}
