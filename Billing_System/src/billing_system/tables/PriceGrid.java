
package billing_system.tables;

import billing_system.models.RegDetails;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class PriceGrid extends AbstractTableModel {
    
    private static final String[] ColumnNames ={"Code","Name","Price"};
    private static ArrayList<RegDetails> list;
    
    public PriceGrid(ArrayList<RegDetails> BorrowerList){
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
                return list.get(rowIndex).getProductCode();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getUnitPrice();
            default:
                return "Error";
        }
    }
    
}
