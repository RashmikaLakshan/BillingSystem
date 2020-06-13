/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system.tables;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import billing_system.models.RegDetails;

public class BorrowerGrid extends AbstractTableModel{

    private static final String[] ColumnNames ={"Borrower Code","Name","NIC Number","Gender","TP Mobile","TP Fixed","Adderess"};
    private static ArrayList<RegDetails> list;
    
    public BorrowerGrid(ArrayList<RegDetails> BorrowerList){
        list = BorrowerList;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    public String getColumnName(int ColumnIndex){
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
                return list.get(rowIndex).getBorrowerCode();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getNIC_Number();
            case 3:
                return list.get(rowIndex).getGender();
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
