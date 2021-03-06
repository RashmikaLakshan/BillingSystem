/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system.tables;

import billing_system.models.RegDetails;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ItemGrid extends AbstractTableModel {

    private static final String[] ColumnNames = {"Product Code", "Name", "Category", "Default unit","Unit Price", "Purching Price", "Warning Rate"};
    private static ArrayList<RegDetails> list;

    public ItemGrid(ArrayList<RegDetails> ItemList) {
        list = ItemList;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    public String getColumnName(int ColumnIndex) {
        return ColumnNames[ColumnIndex];
    }

    @Override
    public int getColumnCount() {
        return ColumnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getProductCode();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getCategory();
            case 3:
                return list.get(rowIndex).getDefaultUnit();
            case 4:
                return list.get(rowIndex).getUnitPrice();
            case 5:
                return list.get(rowIndex).getPurchingPrice();
            case 6:
                return list.get(rowIndex).getWarningRate();
            default:
                return "Error";
        }
    }

}
