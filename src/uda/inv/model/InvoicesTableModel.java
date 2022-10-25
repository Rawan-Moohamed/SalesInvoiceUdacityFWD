
package uda.inv.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoicesTableModel extends AbstractTableModel {
    private ArrayList<Invoice> invoicesRecords;
    private String[] columnsRecords = {"No.", "Date", "Customer", "Total"};
    
    public InvoicesTableModel(ArrayList<Invoice> invoices) {
        this.invoicesRecords = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoicesRecords.size();
    }

    @Override
    public int getColumnCount() {
        return columnsRecords.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnsRecords[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoicesRecords.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNumberOfInv();
            case 1: return invoice.getDateOfInv();
            case 2: return invoice.getCustomerName();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
}
