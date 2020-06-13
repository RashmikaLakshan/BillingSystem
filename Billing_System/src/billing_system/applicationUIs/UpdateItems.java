/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system.applicationUIs;

import billing_system.dboperation.RegDBOperations;
import billing_system.models.RegDetails;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdateItems extends javax.swing.JFrame {

    RegDBOperations Regdbo = new RegDBOperations();
    String name;
    int a = 0;

    public UpdateItems() {
        initComponents();
    }

    public void loadUpdateItemUI(RegDetails rd) {

        txtProductCode.setText(rd.getProductCode());
        txtProductName.setText(rd.getName());
        ddCategory.setSelectedItem(rd.getCategory());
        txtDefaultUnit.setText(rd.getDefaultUnit());
        txtUnitPrice.setText(String.valueOf(rd.getUnitPrice()));
        txtPurchingPrice.setText(String.valueOf(rd.getPurchingPrice()));
        if (rd.getWarningRate() == 0) {
            txtWaningRate.setEditable(false);
            ChBoxNoNeedToWarn.setSelected(true);
            a = 1;
        } else {
            txtWaningRate.setText(String.valueOf(rd.getWarningRate()));
            a = 0;
        }

        name = rd.getName();

    }

    void RegClear() {

        txtProductCode.setText("");
        txtProductName.setText("");
        ddCategory.setSelectedIndex(0);
        txtUnitPrice.setText("");
        txtPurchingPrice.setText("");
        txtWaningRate.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlImage3 = new javax.swing.JPanel();
        lbProductCode = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        ddCategory = new javax.swing.JComboBox<>();
        lblUnitPrice = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        lblPurchingPrice = new javax.swing.JLabel();
        txtPurchingPrice = new javax.swing.JTextField();
        lblWarningRate = new javax.swing.JLabel();
        txtWaningRate = new javax.swing.JTextField();
        btnItemsUpdate = new javax.swing.JButton();
        ChBoxNoNeedToWarn = new javax.swing.JCheckBox();
        lblDefaultUnit = new javax.swing.JLabel();
        txtDefaultUnit = new javax.swing.JTextField();
        btnCustom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlImage3Layout = new javax.swing.GroupLayout(pnlImage3);
        pnlImage3.setLayout(pnlImage3Layout);
        pnlImage3Layout.setHorizontalGroup(
            pnlImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        pnlImage3Layout.setVerticalGroup(
            pnlImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        lbProductCode.setBackground(new java.awt.Color(255, 255, 255));
        lbProductCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbProductCode.setText("Product Code");

        txtProductCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblProductName.setBackground(new java.awt.Color(255, 255, 255));
        lblProductName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblProductName.setText("Product Name");

        lblCategory.setBackground(new java.awt.Color(255, 255, 255));
        lblCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblCategory.setText("Category");

        ddCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ddCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieces", "Weight", "Liquid" }));

        lblUnitPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblUnitPrice.setText("Unit Price");

        txtUnitPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblPurchingPrice.setBackground(new java.awt.Color(255, 255, 255));
        lblPurchingPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPurchingPrice.setText("Purching Price");

        txtPurchingPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblWarningRate.setBackground(new java.awt.Color(255, 255, 255));
        lblWarningRate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblWarningRate.setText("Warning Rate");

        txtWaningRate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnItemsUpdate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnItemsUpdate.setText("Update");
        btnItemsUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemsUpdateActionPerformed(evt);
            }
        });

        ChBoxNoNeedToWarn.setBackground(new java.awt.Color(255, 255, 255));
        ChBoxNoNeedToWarn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChBoxNoNeedToWarn.setText("No need to warn");
        ChBoxNoNeedToWarn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChBoxNoNeedToWarnActionPerformed(evt);
            }
        });

        lblDefaultUnit.setBackground(new java.awt.Color(255, 255, 255));
        lblDefaultUnit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDefaultUnit.setText("Default Unit");

        txtDefaultUnit.setEditable(false);
        txtDefaultUnit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnCustom.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnCustom.setText("Custom");
        btnCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ChBoxNoNeedToWarn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnItemsUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(lblWarningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtWaningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWaningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ChBoxNoNeedToWarn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnItemsUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnItemsUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemsUpdateActionPerformed

        RegDetails rd = new RegDetails();

        if (!txtProductCode.getText().equals("") && !txtProductName.getText().equals("") && !txtUnitPrice.getText().equals("") && !txtPurchingPrice.getText().equals("")) {
            try {
                rd.setRegID(0);
                rd.setProductCode(txtProductCode.getText());
                rd.setName(txtProductName.getText());
                rd.setCategory(ddCategory.getSelectedItem().toString());
                rd.setUnitPrice(Integer.parseInt(txtUnitPrice.getText()));
                rd.setPurchingPrice(Integer.parseInt(txtPurchingPrice.getText()));

                if (txtWaningRate.getText().equals("")) {
                    if (a == 1) {
                        rd.setWarningRate(0);

                        String msg = "<html>" + "Please Check all Details again...!<br><br>"
                                + "<tr><td>Code</td>-<td> </td><td> " + txtProductCode.getText() + "</td></tr>"
                                + "<tr><td>Name </td>-<td></td><td> " + txtProductName.getText() + "</td></tr>"
                                + "<tr><td>Category</td>-<td></td><td>" + ddCategory.getSelectedItem() + "</td></tr>"
                                + "<tr><td>Default Unit </td>-<td></td><td> " + txtDefaultUnit.getText() + "</td></tr>"
                                + "<tr><td>Unit Price</td>-<td></td><td>" + txtUnitPrice.getText() + "</td></tr>"
                                + "<tr><td>Purching Price</td>-<td></td><td>" + txtPurchingPrice.getText() + "</td></tr>"
                                + "<tr><td> </td></tr><br> Save Changes </html>";

                        int p = JOptionPane.showConfirmDialog(this, msg, "Update Details", JOptionPane.YES_NO_OPTION);

                        int result = 0;
                        if (p == 0) {
                            if (Integer.parseInt(txtPurchingPrice.getText()) <= Integer.parseInt(txtUnitPrice.getText())) {
                                result = Regdbo.UpdateItemDetails(rd, name);
                                App a = new App();
                                a.LoadBorrorwerTbl();
                                UpdateDeleteItems udb = new UpdateDeleteItems();
                                udb.LoadItemTbl();
                            } else {
                                JOptionPane.showMessageDialog(this, "Purching Price should be less than or equal to Unit Price");
                            }
                        }
                        switch (result) {
                            case 1:
                                dispose();
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(this, "Error Occured While Inserting ,Please Reenter Details!");
                            //ItemRegClear();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please enter Warning Rate or tick as No need to Warn otherwise enter '0'");
                    }

                } else {
                    rd.setWarningRate(Integer.parseInt(txtWaningRate.getText()));

                    String msg = "<html>" + "Please Check all Details again...!<br><br>"
                            + "<tr><td>Code</td>-<td> </td><td> " + txtProductCode.getText() + "</td></tr>"
                            + "<tr><td>Name </td>-<td></td><td> " + txtProductName.getText() + "</td></tr>"
                            + "<tr><td>Category</td>-<td></td><td>" + ddCategory.getSelectedItem() + "</td></tr>"
                            + "<tr><td>Default Unit </td>-<td></td><td> " + txtDefaultUnit.getText() + "</td></tr>"
                            + "<tr><td>Unit Price</td>-<td></td><td>" + txtUnitPrice.getText() + "</td></tr>"
                            + "<tr><td>Purching Price</td>-<td></td><td>" + txtPurchingPrice.getText() + "</td></tr>"
                            + "<tr><td>Warning Rate</td>-<td></td><td>" + txtWaningRate.getText() + "</td></tr><tr><td> </td></tr><br> Save Changes </html>";

                    int p = JOptionPane.showConfirmDialog(this, msg, "Update Details", JOptionPane.YES_NO_OPTION);

                    int result = 0;
                    if (p == 0) {
                        if (Integer.parseInt(txtPurchingPrice.getText()) <= Integer.parseInt(txtUnitPrice.getText())) {
                            result = Regdbo.UpdateItemDetails(rd, name);
                            App a = new App();
                            a.LoadBorrorwerTbl();
                            UpdateDeleteItems udb = new UpdateDeleteItems();
                            udb.LoadItemTbl();
                        } else {
                            JOptionPane.showMessageDialog(this, "Purching Price should be less than or equal to Unit Price");
                        }
                    }
                    switch (result) {
                        case 1:
                            dispose();
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(this, "Error Occured While Inserting ,Please Reenter Details!");
                        //ItemRegClear();
                    }
                }

            } catch (Exception e) {
                System.out.println("btnUpdateDetails --> " + e);
                JOptionPane.showMessageDialog(this, "Error Occured, Check Your Details Again");
                //ItemRegClear();
            }
        } else {
            JOptionPane.showMessageDialog(this, "You must enter all details");
        }
    }//GEN-LAST:event_btnItemsUpdateActionPerformed

    private void ChBoxNoNeedToWarnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChBoxNoNeedToWarnActionPerformed

        if (a == 0) {
            txtWaningRate.setEditable(false);
            txtWaningRate.setText("");
            a = 1;
        } else {
            txtWaningRate.setEditable(true);
            a = 0;
        }
    }//GEN-LAST:event_ChBoxNoNeedToWarnActionPerformed

    private void btnCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomActionPerformed
        CustomItemUnit ciu = new CustomItemUnit();
        ciu.setVisible(true);
        ciu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCustomActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChBoxNoNeedToWarn;
    private javax.swing.JButton btnCustom;
    private javax.swing.JButton btnItemsUpdate;
    private javax.swing.JComboBox<String> ddCategory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbProductCode;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDefaultUnit;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblPurchingPrice;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JLabel lblWarningRate;
    private javax.swing.JPanel pnlImage3;
    private javax.swing.JTextField txtDefaultUnit;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtPurchingPrice;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtWaningRate;
    // End of variables declaration//GEN-END:variables
}
