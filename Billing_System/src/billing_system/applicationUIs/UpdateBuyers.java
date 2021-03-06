/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing_system.applicationUIs;

import billing_system.dboperation.RegDBOperations;
import billing_system.models.RegDetails;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class UpdateBuyers extends javax.swing.JFrame {

    RegDBOperations Regdbo = new RegDBOperations();
    String name;
    
    public UpdateBuyers() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        lblBuyerCode = new javax.swing.JLabel();
        txtBuyerCode = new javax.swing.JTextField();
        pnlAbout = new javax.swing.JPanel();
        lblBuyerName = new javax.swing.JLabel();
        txtBuyerName = new javax.swing.JTextField();
        txtSettlingTime = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        lblSettlingTime = new javax.swing.JLabel();
        ddType = new javax.swing.JComboBox<>();
        ddTimeUnit = new javax.swing.JComboBox<>();
        pnlBuyerContactDetails = new javax.swing.JPanel();
        lblMobileI = new javax.swing.JLabel();
        lblBuyerTelephoneNo = new javax.swing.JLabel();
        txtTPMobileI = new javax.swing.JTextField();
        txtTPLandII = new javax.swing.JTextField();
        lblMobileFixed = new javax.swing.JLabel();
        lblAdderessEmail = new javax.swing.JLabel();
        txtAdderessEmail = new javax.swing.JTextField();
        pnlImage2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        lblBuyerShowMSG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        lblBuyerCode.setBackground(new java.awt.Color(255, 255, 255));
        lblBuyerCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblBuyerCode.setText("Buyer Code");

        txtBuyerCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        pnlAbout.setBackground(new java.awt.Color(249, 249, 249));
        pnlAbout.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "About", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        lblBuyerName.setBackground(new java.awt.Color(255, 255, 255));
        lblBuyerName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblBuyerName.setText("Name");

        txtBuyerName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtSettlingTime.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblType.setBackground(new java.awt.Color(255, 255, 255));
        lblType.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblType.setText("Type");

        lblSettlingTime.setBackground(new java.awt.Color(255, 255, 255));
        lblSettlingTime.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblSettlingTime.setText("Settling Time");

        ddType.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ddType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From Delivery", "From Shop", "From Person" }));
        ddType.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        ddTimeUnit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ddTimeUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Days", "Weeks", "Months", "Years" }));

        javax.swing.GroupLayout pnlAboutLayout = new javax.swing.GroupLayout(pnlAbout);
        pnlAbout.setLayout(pnlAboutLayout);
        pnlAboutLayout.setHorizontalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAboutLayout.createSequentialGroup()
                        .addComponent(lblBuyerName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuyerName, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAboutLayout.createSequentialGroup()
                        .addComponent(lblSettlingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSettlingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ddTimeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ddType, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        pnlAboutLayout.setVerticalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuyerName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuyerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSettlingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSettlingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ddType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ddTimeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pnlAboutLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ddTimeUnit, ddType, lblType, txtBuyerName, txtSettlingTime});

        pnlBuyerContactDetails.setBackground(new java.awt.Color(249, 249, 249));
        pnlBuyerContactDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lblMobileI.setBackground(new java.awt.Color(255, 255, 255));
        lblMobileI.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMobileI.setText("Mobile");

        lblBuyerTelephoneNo.setBackground(new java.awt.Color(255, 255, 255));
        lblBuyerTelephoneNo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblBuyerTelephoneNo.setText("Telephone No");

        txtTPMobileI.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtTPLandII.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblMobileFixed.setBackground(new java.awt.Color(255, 255, 255));
        lblMobileFixed.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMobileFixed.setText("Mobile/Fixed");

        lblAdderessEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblAdderessEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAdderessEmail.setText("Adderess/Email");

        txtAdderessEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout pnlBuyerContactDetailsLayout = new javax.swing.GroupLayout(pnlBuyerContactDetails);
        pnlBuyerContactDetails.setLayout(pnlBuyerContactDetailsLayout);
        pnlBuyerContactDetailsLayout.setHorizontalGroup(
            pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuyerContactDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBuyerContactDetailsLayout.createSequentialGroup()
                        .addComponent(lblBuyerTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMobileI, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTPMobileI, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTPLandII, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMobileFixed, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBuyerContactDetailsLayout.createSequentialGroup()
                        .addComponent(lblAdderessEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdderessEmail)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        pnlBuyerContactDetailsLayout.setVerticalGroup(
            pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuyerContactDetailsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobileFixed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobileI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuyerTelephoneNo)
                    .addComponent(txtTPMobileI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTPLandII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdderessEmail)
                    .addComponent(txtAdderessEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlImage2Layout = new javax.swing.GroupLayout(pnlImage2);
        pnlImage2.setLayout(pnlImage2Layout);
        pnlImage2Layout.setHorizontalGroup(
            pnlImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        pnlImage2Layout.setVerticalGroup(
            pnlImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblBuyerShowMSG.setBackground(new java.awt.Color(255, 255, 255));
        lblBuyerShowMSG.setFont(new java.awt.Font("Tekton Pro Ext", 0, 17)); // NOI18N
        lblBuyerShowMSG.setForeground(new java.awt.Color(102, 51, 0));
        lblBuyerShowMSG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(lblBuyerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuyerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblBuyerShowMSG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBuyerContactDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBuyerCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuyerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(pnlAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(pnlImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(pnlBuyerContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lblBuyerShowMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void loadUpdateBuyerUI(RegDetails rd) {

        txtBuyerCode.setText(rd.getBuyerCode());
        txtBuyerName.setText(rd.getName());
        String[] settletime =rd.getSettleTime().split("  ");
            //System.out.println(Arrays.toString(settletime));
        txtSettlingTime.setText(settletime[0]);
        
        switch (settletime[1]) {
            case "Days":
                ddTimeUnit.setSelectedIndex(0);
                break;
            case "Weeks":
                ddTimeUnit.setSelectedIndex(1);
                break;
            case "Months":
                ddTimeUnit.setSelectedIndex(2);
                break;
            case "Years":
                ddTimeUnit.setSelectedIndex(3);
                break;
            default:
                break;
        }
        
        ddType.setSelectedItem(rd.getType());
        txtTPMobileI.setText(String.valueOf(rd.getTP_Mobile()));
        txtTPLandII.setText(String.valueOf(rd.getTP_Land()));
        txtAdderessEmail.setText(rd.getAdderess());
        name = rd.getName();

    }

    void RegClear() {

        txtBuyerCode.setText("");
        txtBuyerName.setText("");
        txtSettlingTime.setText("");
        ddType.setSelectedIndex(0);
        txtTPMobileI.setText("");
        txtTPLandII.setText("");
        txtAdderessEmail.setText("");

    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        RegDetails rd = new RegDetails();

        if (!txtBuyerCode.getText().equals("") && !txtBuyerName.getText().equals("")) {
            try {
                String x;
                rd.setRegID(0);
                rd.setBuyerCode(txtBuyerCode.getText());
                rd.setName(txtBuyerName.getText());
                if (txtSettlingTime.getText().equals("")) {
                    rd.setSettelingTime(0);
                    x = "";
                } else {
                    rd.setSettelingTime(Integer.parseInt(txtSettlingTime.getText()));
                    x = txtSettlingTime.getText() + " " + ddTimeUnit.getSelectedItem();
                }
                rd.setTimeUnit((String) ddTimeUnit.getSelectedItem());
                rd.setType((String) ddType.getSelectedItem());      
                if (txtTPMobileI.getText().equals("")) {
                    rd.setTP_Mobile(0);
                } else {
                    rd.setTP_Mobile(Integer.parseInt(txtTPMobileI.getText()));
                }
                if (txtTPLandII.getText().equals("")) {
                    rd.setTP_Land(0);
                } else {
                    rd.setTP_Land(Integer.parseInt(txtTPLandII.getText()));
                }
                if (txtAdderessEmail.getText().equals("")) {
                    rd.setAdderess("Null");
                } else {
                    rd.setAdderess(txtAdderessEmail.getText());
                }

                String msg = "<html>" + "Please Check all Details again...!<br><br>"
                        + "<tr><td>Buyer code</td>-<td> </td><td> " + txtBuyerCode.getText() + "</td></tr>"
                        + "<tr><td>Name </td>-<td></td><td> " + txtBuyerName.getText() + "</td></tr>"
                        + "<tr><td>Settling Time</td>-<td></td><td> " + x + "</td></tr>"
                        + "<tr><td>Type</td>-<td></td><td>" + ddType.getSelectedItem() + "</td></tr>"
                        + "<tr><td>Mobile</td>-<td></td><td>" + txtTPMobileI.getText() + "</td></tr>"
                        + "<tr><td>Mobile/Fixed</td>-<td></td><td>" + txtTPLandII.getText() + "</td></tr>"
                        + "<tr><td>Adderess/Email</td>-<td></td><td>" + txtAdderessEmail.getText() + "</td></tr><br><br>" + "Save Changes" + "</html>";

                int p = JOptionPane.showConfirmDialog(this, msg, "Update Details", JOptionPane.YES_NO_OPTION);

                int result = 0;
                if (p == 0) {
                    result = Regdbo.UpdateBuyerDetails(rd, name);
                    App a = new App();
                    a.LoadBorrorwerTbl();
                    UpdateDeleteBuyers udb = new UpdateDeleteBuyers();
                    udb.LoadBuyerTbl();
                }
                switch (result) {
                    case 1:
                        dispose();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "Error Occured While Inserting ,Please Reenter Details!");
                        RegClear();
                }
            } catch (Exception e) {
                System.out.println("btnAddDetails --> " + e);
                JOptionPane.showMessageDialog(this, "Error Occured, Check Your Details Again");
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "You must enter Name and Borrower Code");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBuyers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> ddTimeUnit;
    private javax.swing.JComboBox<String> ddType;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JLabel lblAdderessEmail;
    private javax.swing.JLabel lblBuyerCode;
    private javax.swing.JLabel lblBuyerName;
    private javax.swing.JLabel lblBuyerShowMSG;
    private javax.swing.JLabel lblBuyerTelephoneNo;
    private javax.swing.JLabel lblMobileFixed;
    private javax.swing.JLabel lblMobileI;
    private javax.swing.JLabel lblSettlingTime;
    private javax.swing.JLabel lblType;
    private javax.swing.JPanel pnlAbout;
    private javax.swing.JPanel pnlBuyerContactDetails;
    private javax.swing.JPanel pnlImage2;
    private javax.swing.JTextField txtAdderessEmail;
    private javax.swing.JTextField txtBuyerCode;
    private javax.swing.JTextField txtBuyerName;
    private javax.swing.JTextField txtSettlingTime;
    private javax.swing.JTextField txtTPLandII;
    private javax.swing.JTextField txtTPMobileI;
    // End of variables declaration//GEN-END:variables
}
