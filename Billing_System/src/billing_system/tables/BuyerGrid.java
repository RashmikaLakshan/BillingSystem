/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system.tables;

import billing_system.models.RegDetails;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class BuyerGrid extends AbstractTableModel {

    private static final String[] ColumnNames = {"Buyer Code", "Name", "Settling Time", "Type", "TP Mobile", "TP Mobile/Fixed", "Adderess/Email"};
    private static ArrayList<RegDetails> list;

    public BuyerGrid(ArrayList<RegDetails> BorrowerList) {
        list = BorrowerList;
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
                return list.get(rowIndex).getBuyerCode();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getSettleTime();
            case 3:
                return list.get(rowIndex).getType();
            case 4:
                return list.get(rowIndex).getTP_Mobile();
            case 5:
                return list.get(rowIndex).getTP_Land();
            case 6:
                return list.get(rowIndex).getAdderess();
            default:
                return "Error";
        }
    }

}
