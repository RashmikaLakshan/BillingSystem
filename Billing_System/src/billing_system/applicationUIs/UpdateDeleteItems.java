

package billing_system.applicationUIs;

import billing_system.dboperation.RegDBOperations;
import billing_system.models.RegDetails;
import billing_system.tables.BorrowerGrid;
import billing_system.tables.ItemGrid;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdateDeleteItems extends javax.swing.JFrame {

    private ArrayList<RegDetails> ItemList;
    private RegDBOperations Regdbo = new RegDBOperations();

    public UpdateDeleteItems() {
        initComponents();
        LoadItemTbl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemList = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        lblTitile = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblItemList.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblItemList);

        Delete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        lblTitile.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        lblTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitile.setText("ITEM  LIST");

        lblCount.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblCount.setForeground(new java.awt.Color(102, 51, 0));
        lblCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Update.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitile, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadItemTbl() {

        ItemList = Regdbo.getItems();
        ItemGrid bg = new ItemGrid(ItemList);
        tblItemList.setModel(bg);
        lblCount.setText(Regdbo.getQuentityOfItemList());
    }

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        try {
            RegDetails rd = new RegDetails();

            rd.setName(ItemList.get(tblItemList.getSelectedRow()).getName());
            int p = 3;
            if (ItemList.get(tblItemList.getSelectedRow()).getWarningRate() == 0) {
                String msg = "<html>" + "Are you sure that you want to Delete this Details ...!<br><br>"
                        + "<tr><td>Code</td>-<td> </td><td> " + ItemList.get(tblItemList.getSelectedRow()).getProductCode() + "</td></tr>"
                        + "<tr><td>Name </td>-<td></td><td> " + ItemList.get(tblItemList.getSelectedRow()).getName() + "</td></tr>"
                        + "<tr><td>Category</td>-<td></td><td> " + ItemList.get(tblItemList.getSelectedRow()).getCategory() + "</td></tr>"
                        + "<tr><td>Unit Price</td>-<td></td><td>" + ItemList.get(tblItemList.getSelectedRow()).getUnitPrice() + "</td></tr>"
                        + "<tr><td>Purching Price</td>-<td></td><td>" + ItemList.get(tblItemList.getSelectedRow()).getPurchingPrice() + "</td></tr>"
                        + "</td></tr> </td></tr><br><br> Delete details </html>";
                p = JOptionPane.showConfirmDialog(this, msg, "Delete Item Details", JOptionPane.YES_NO_OPTION);
            } else {
                String msg = "<html>" + "Are you sure that you want to Delete this Details ...!<br><br>"
                        + "<tr><td>Code</td>-<td> </td><td> " + ItemList.get(tblItemList.getSelectedRow()).getProductCode() + "</td></tr>"
                        + "<tr><td>Name </td>-<td></td><td> " + ItemList.get(tblItemList.getSelectedRow()).getName() + "</td></tr>"
                        + "<tr><td>Category</td>-<td></td><td> " + ItemList.get(tblItemList.getSelectedRow()).getCategory() + "</td></tr>"
                        + "<tr><td>Unit Price</td>-<td></td><td>" + ItemList.get(tblItemList.getSelectedRow()).getUnitPrice() + "</td></tr>"
                        + "<tr><td>Purching Price</td>-<td></td><td>" + ItemList.get(tblItemList.getSelectedRow()).getPurchingPrice() + "</td></tr>"
                        + "<tr><td>Warning Rate</td>-<td></td><td>" + ItemList.get(tblItemList.getSelectedRow()).getWarningRate() + "</td></tr> </td></tr><br><br> Delete details </html>";
                p = JOptionPane.showConfirmDialog(this, msg, "Delete Item Details", JOptionPane.YES_NO_OPTION);
            }

            if (p == 0) {
                Regdbo.DeleteItems(rd);
                LoadItemTbl();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
            System.out.println(e);
        }

    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        try {
            UpdateItems ub = new UpdateItems();
            RegDetails rd = new RegDetails();

            rd.setName(ItemList.get(tblItemList.getSelectedRow()).getName());

            Regdbo.SetUpdateTxtFieldsOfItems(rd.getName(), rd);
            ub.setVisible(true);
            ub.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ub.loadUpdateItemUI(rd);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
            System.out.println(e);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JTable tblItemList;
    // End of variables declaration//GEN-END:variables
}
