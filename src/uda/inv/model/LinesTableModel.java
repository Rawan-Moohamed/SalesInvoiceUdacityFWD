
package uda.inv.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LinesTableModel extends AbstractTableModel {

    private ArrayList<Line> linesRecord;
    private String[] columnsOfList = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LinesTableModel(ArrayList<Line> lines) {
        this.linesRecord = lines;
    }

    public ArrayList<Line> getLinesRecord() {
        return linesRecord;
    }
    
    
    @Override
    public int getRowCount() {
        return linesRecord.size();
    }

    @Override
    public int getColumnCount() {
        return columnsOfList.length;
    }

    @Override
    public String getColumnName(int x) {
        return columnsOfList[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Line line = linesRecord.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoiceRecord().getNumberOfInv();
            case 1: return line.getItemsLine();
            case 2: return line.getPriceOfItem();
            case 3: return line.getCountOfItems();
            case 4: return line.getLineTotal();
            default : return "";
        }
    }
    
}
