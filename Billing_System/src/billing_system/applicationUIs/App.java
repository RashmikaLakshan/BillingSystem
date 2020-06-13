package billing_system.applicationUIs;

import billing_system.dboperation.DBOperations;
import billing_system.dboperation.RegDBOperations;
import billing_system.models.ComponentDetails;
import billing_system.models.RegDetails;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import billing_system.tables.BorrowerGrid;
import billing_system.tables.BuyerGrid;
import billing_system.tables.ItemGrid;
import billing_system.tables.PriceGrid;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class App extends javax.swing.JFrame {

    private DBOperations dbo;
    private RegDBOperations Regdbo;
    private ArrayList<ComponentDetails> todayList;
    private ArrayList<String> namelist;
    private ArrayList<Integer> buyerlist;
    private double total;
    private ArrayList<RegDetails> BorrowerList;
    private ArrayList<RegDetails> buList;
    private ArrayList<RegDetails> ItemList;
    int time1 = -1, time, Addtime;
    private ArrayList<RegDetails> SearchProductNames;
    String st = "";

    public App() throws SQLException {
        this.total = 0;
        this.dbo = new DBOperations();
        this.Regdbo = new RegDBOperations();
        this.todayList = new ArrayList<ComponentDetails>();
        this.namelist = dbo.selectComponents();
        this.buyerlist = dbo.selectbuyer();
        //txt_cash.setText("0.0");
        initComponents();
        setDate();
        LoadBorrorwerTbl();

        new Thread() {
            public void run() {
                while (true) {
                    SimpleDateFormat timeFormat = new SimpleDateFormat("ss");
                    Calendar currentCalendar = Calendar.getInstance();
                    Date currentTime = currentCalendar.getTime();
                    time = Integer.parseInt(timeFormat.format(currentTime));
                    //System.out.println(time);
                    if (time == time1) {
                        lblShowMSG.setText("");
                        lblBuyerShowMSG.setText("");
                        lblItemShowMSG.setText("");
                        time1 = -1;
                    }
                }
            }
        }.start();

        LoadPriceTbl();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_quick = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_saleQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_saleOk = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_saleProductname = new javax.swing.JTextField();
        combo_code = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_sale = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        lbl_date2 = new javax.swing.JLabel();
        txt_SaleTot = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_cashfinishDeal = new javax.swing.JButton();
        txt_saleCashCustomerName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMonthlyBills = new javax.swing.JTable();
        pnlSale = new javax.swing.JPanel();
        lbSalelCode = new javax.swing.JLabel();
        btnSale = new javax.swing.JButton();
        lbSaleName = new javax.swing.JLabel();
        txtSaleName = new javax.swing.JTextField();
        lbSaleQuickCode = new javax.swing.JLabel();
        txtSaleQuickCode = new javax.swing.JTextField();
        txtSaleQuantity = new javax.swing.JTextField();
        lblSaleQuantity = new javax.swing.JLabel();
        txtSaleCode1 = new javax.swing.JTextField();
        lblSaleQuantity1 = new javax.swing.JLabel();
        pnlSaleReturns = new javax.swing.JPanel();
        lbSaleReturnsCode = new javax.swing.JLabel();
        btnSaleReturns = new javax.swing.JButton();
        lbSaleReturnsQuantity = new javax.swing.JLabel();
        txtSaleReturnsQuantity = new javax.swing.JTextField();
        lbSaleReturnsQuickCode = new javax.swing.JLabel();
        txtSaleReturnsQuickCode = new javax.swing.JTextField();
        txtSaleReturnsCode = new javax.swing.JTextField();
        txtSaleReturnsName1 = new javax.swing.JTextField();
        lbSaleReturnsName1 = new javax.swing.JLabel();
        txtSalePayment = new javax.swing.JTextField();
        lbSalePayment = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbl_date3 = new javax.swing.JLabel();
        btnSale1 = new javax.swing.JButton();
        btn_bilfinishdeal = new javax.swing.JButton();
        txt_saleCashCustomerName1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_creditProductName = new javax.swing.JTextField();
        txt_creditUnitPrice = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_creditQuantity = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_credit = new javax.swing.JTable();
        txt_creditTotal = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btn_buyCreditVerify = new javax.swing.JButton();
        txt_paid = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_balance = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btn_creditGoTo = new javax.swing.JButton();
        txt_creditUnitCost = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_creditProductCode = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_sellerName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        lbl_date1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_cashProductName = new javax.swing.JTextField();
        txt_cashQuantity = new javax.swing.JTextField();
        txt_cashUnitPrice = new javax.swing.JTextField();
        btn_buyCashVerify = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_cash = new javax.swing.JTable();
        btn_cashGoTo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        txt_buyTotal = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_cashSupplierName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_cashUnitCost = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_cashProductCode = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtPriceSearch = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPriceSearch = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        btnBorrowerList = new javax.swing.JButton();
        btnBuyerList = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCustomerItemList = new javax.swing.JTable();
        btnItemList = new javax.swing.JButton();
        lblTitile = new javax.swing.JLabel();
        btnDeleteDetails = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        btnUpdateDetails = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        lblBorrowerCode = new javax.swing.JLabel();
        txtBorrowerCode = new javax.swing.JTextField();
        pnlPersonalDetails = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNICNo = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblV = new javax.swing.JLabel();
        lblNICNo = new javax.swing.JLabel();
        ddGenger = new javax.swing.JComboBox<>();
        pnlContactDetails = new javax.swing.JPanel();
        lblMobile = new javax.swing.JLabel();
        lblTelephoneNo = new javax.swing.JLabel();
        txtTPMobile = new javax.swing.JTextField();
        txtTPLand = new javax.swing.JTextField();
        lblFixed = new javax.swing.JLabel();
        lblAdderess = new javax.swing.JLabel();
        txtAdderess = new javax.swing.JTextField();
        pnlImage = new javax.swing.JPanel();
        btnUpdateAndDeleteDetails = new javax.swing.JButton();
        btnAddDetails = new javax.swing.JButton();
        lblShowMSG = new javax.swing.JLabel();
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
        btnBuyerUpdateDeleteDetails = new javax.swing.JButton();
        btnBuyerAddDetails = new javax.swing.JButton();
        lblBuyerShowMSG = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        lbProductCode = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        pnlImage3 = new javax.swing.JPanel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        ddCategory = new javax.swing.JComboBox<>();
        lblCategory = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        lblPurchingPrice = new javax.swing.JLabel();
        txtPurchingPrice = new javax.swing.JTextField();
        lblWarningRate = new javax.swing.JLabel();
        txtWaningRate = new javax.swing.JTextField();
        btnItemsAddDetails = new javax.swing.JButton();
        lblItemShowMSG = new javax.swing.JLabel();
        btnItemUpdateDeleteDetails = new javax.swing.JButton();
        ChBoxNoNeedToWarn = new javax.swing.JCheckBox();
        lblDefaultUnit = new javax.swing.JLabel();
        txtDefaultUnit = new javax.swing.JTextField();
        btnCustom = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("    Billing System");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane2.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Quick Code");

        txt_quick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quickActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Code");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Quantity");

        btn_saleOk.setBackground(new java.awt.Color(153, 153, 153));
        btn_saleOk.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_saleOk.setText("OK");
        btn_saleOk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_saleOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saleOkActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Product Name");

        combo_code.setEditable(true);
        combo_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_code.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Table_sale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_sale.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(Table_sale);

        jLabel27.setFont(new java.awt.Font("Tekton Pro Ext", 1, 16)); // NOI18N
        jLabel27.setText("Date :");

        lbl_date2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt_SaleTot.setEditable(false);
        txt_SaleTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SaleTotActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total Price");

        btn_cashfinishDeal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cashfinishDeal.setText("FINISH DEAL");
        btn_cashfinishDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cashfinishDealActionPerformed(evt);
            }
        });

        txt_saleCashCustomerName.setForeground(new java.awt.Color(153, 153, 153));
        txt_saleCashCustomerName.setText("UNKNOWN");
        txt_saleCashCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saleCashCustomerNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Customer Name");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_saleCashCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_quick, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(btn_saleOk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(combo_code, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(txt_saleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_saleProductname)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_date2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_SaleTot, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_cashfinishDeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_date2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_saleCashCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_saleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quick, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_saleOk))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_saleProductname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SaleTot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cashfinishDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_saleOk, txt_quick});

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_code, jLabel5});

        jTabbedPane1.addTab("     CASH     ", jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tblMonthlyBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quntity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMonthlyBills);

        pnlSale.setBackground(new java.awt.Color(255, 255, 255));
        pnlSale.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lbSalelCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSalelCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalelCode.setText("Code ");

        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        lbSaleName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSaleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaleName.setText("Name");

        txtSaleName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleName.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleName.setText("  Name");
        txtSaleName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lbSaleQuickCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSaleQuickCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaleQuickCode.setText("Quick Code");

        txtSaleQuickCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleQuickCode.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleQuickCode.setText("  Code.Quantity");
        txtSaleQuickCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtSaleQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleQuantity.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleQuantity.setText("  Quantity");
        txtSaleQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblSaleQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblSaleQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtSaleCode1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleCode1.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleCode1.setText("  Code");
        txtSaleCode1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblSaleQuantity1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblSaleQuantity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaleQuantity1.setText("Quantity");

        javax.swing.GroupLayout pnlSaleLayout = new javax.swing.GroupLayout(pnlSale);
        pnlSale.setLayout(pnlSaleLayout);
        pnlSaleLayout.setHorizontalGroup(
            pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSaleLayout.createSequentialGroup()
                        .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSalelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaleCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSaleLayout.createSequentialGroup()
                                .addComponent(txtSaleName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlSaleLayout.createSequentialGroup()
                                .addComponent(lbSaleName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSaleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSaleLayout.createSequentialGroup()
                                .addComponent(lblSaleQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(lblSaleQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlSaleLayout.createSequentialGroup()
                        .addComponent(lbSaleQuickCode, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaleQuickCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlSaleLayout.setVerticalGroup(
            pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalelCode)
                    .addComponent(lbSaleName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaleQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaleQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaleCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSaleQuickCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSaleQuickCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlSaleLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSaleName, txtSaleQuantity});

        pnlSaleReturns.setBackground(new java.awt.Color(255, 255, 255));
        pnlSaleReturns.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Returens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lbSaleReturnsCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSaleReturnsCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaleReturnsCode.setText("Code ");

        btnSaleReturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleReturnsActionPerformed(evt);
            }
        });

        lbSaleReturnsQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSaleReturnsQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaleReturnsQuantity.setText("Quantity");

        txtSaleReturnsQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleReturnsQuantity.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleReturnsQuantity.setText("  Quantity");
        txtSaleReturnsQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lbSaleReturnsQuickCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSaleReturnsQuickCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaleReturnsQuickCode.setText("Quick Code");

        txtSaleReturnsQuickCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleReturnsQuickCode.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleReturnsQuickCode.setText("  Code.Quantity");
        txtSaleReturnsQuickCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtSaleReturnsCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleReturnsCode.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleReturnsCode.setText("  Code");
        txtSaleReturnsCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtSaleReturnsName1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtSaleReturnsName1.setForeground(new java.awt.Color(204, 204, 204));
        txtSaleReturnsName1.setText("  Name");
        txtSaleReturnsName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lbSaleReturnsName1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSaleReturnsName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaleReturnsName1.setText("Name");

        javax.swing.GroupLayout pnlSaleReturnsLayout = new javax.swing.GroupLayout(pnlSaleReturns);
        pnlSaleReturns.setLayout(pnlSaleReturnsLayout);
        pnlSaleReturnsLayout.setHorizontalGroup(
            pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleReturnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSaleReturnsLayout.createSequentialGroup()
                        .addComponent(lbSaleReturnsQuickCode, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtSaleReturnsQuickCode, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaleReturns, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlSaleReturnsLayout.createSequentialGroup()
                        .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSaleReturnsCode, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaleReturnsCode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSaleReturnsLayout.createSequentialGroup()
                                .addComponent(lbSaleReturnsName1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtSaleReturnsName1))
                        .addGap(0, 0, 0)
                        .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaleReturnsQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSaleReturnsQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlSaleReturnsLayout.setVerticalGroup(
            pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleReturnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSaleReturnsName1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSaleReturnsCode)
                        .addComponent(lbSaleReturnsQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaleReturnsCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaleReturnsQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaleReturnsName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSaleReturnsQuickCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSaleReturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSaleReturns, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSaleReturnsQuickCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlSaleReturnsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSaleReturnsCode, txtSaleReturnsQuantity});

        txtSalePayment.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSalePayment.setForeground(new java.awt.Color(102, 102, 102));
        txtSalePayment.setText(" 0.00");
        txtSalePayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lbSalePayment.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbSalePayment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalePayment.setText("Payment (Rs)");

        jLabel28.setFont(new java.awt.Font("Tekton Pro Ext", 1, 16)); // NOI18N
        jLabel28.setText("Date :");

        lbl_date3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnSale1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSale1.setText("Pay");
        btnSale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSale1ActionPerformed(evt);
            }
        });

        btn_bilfinishdeal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btn_bilfinishdeal.setText("Finish Deal");
        btn_bilfinishdeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bilfinishdealActionPerformed(evt);
            }
        });

        txt_saleCashCustomerName1.setForeground(new java.awt.Color(153, 153, 153));
        txt_saleCashCustomerName1.setText("UNKNOWN");
        txt_saleCashCustomerName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saleCashCustomerName1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Customer Name");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lbSalePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSale1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_bilfinishdeal, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(pnlSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(pnlSaleReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_saleCashCustomerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_date3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_date3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_saleCashCustomerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(pnlSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSalePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSale1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(pnlSaleReturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_bilfinishdeal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pnlSale, pnlSaleReturns});

        jTabbedPane1.addTab("MONTHLY BILLS", jPanel10);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("   CREDIT   ", jPanel9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane2.addTab("  Sale              ", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/goods (1).png")), jPanel2); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Seller Name     :");

        jPanel16.setBackground(new java.awt.Color(249, 249, 249));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Product Name    :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Unit Price            :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Quantity             :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Cash");

        Table_credit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Unit Cost", "Unit Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_credit.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Table_credit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Table_creditMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(Table_credit);

        txt_creditTotal.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Total Price");

        btn_buyCreditVerify.setText("Verify");
        btn_buyCreditVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyCreditVerifyActionPerformed(evt);
            }
        });

        txt_paid.setEditable(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Paid");

        txt_balance.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Balance");

        btn_creditGoTo.setText("Go To Stock");
        btn_creditGoTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditGoToActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Unit Cost           :");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Product Code    :");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_creditTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_creditGoTo)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_creditProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_creditProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_creditUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_creditQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(btn_buyCreditVerify))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_creditUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_creditProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_creditProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_creditUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_creditUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_creditQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buyCreditVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_creditTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_creditGoTo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Tekton Pro Ext", 1, 16)); // NOI18N
        jLabel25.setText("Date :");

        lbl_date1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("   CREDIT   ", jPanel13);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Product Name :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Unit Price");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Quantity");

        txt_cashQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cashQuantityActionPerformed(evt);
            }
        });

        btn_buyCashVerify.setText("Verify");
        btn_buyCashVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyCashVerifyActionPerformed(evt);
            }
        });

        Table_cash.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Unit Cost", "Unit Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table_cash);

        btn_cashGoTo.setText("Go To Stock");
        btn_cashGoTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cashGoToActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Date :");

        lbl_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt_buyTotal.setEditable(false);
        txt_buyTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buyTotalActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Total Price");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Supplier Name :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Unit Cost");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Product Code :");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cashProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txt_cashUnitPrice))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(txt_cashUnitCost))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205)))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txt_cashQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_buyCashVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cashSupplierName))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(223, 223, 223)
                                        .addComponent(jLabel32)
                                        .addGap(21, 21, 21)
                                        .addComponent(txt_cashProductCode))
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel14Layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_buyTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_cashGoTo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 74, Short.MAX_VALUE)))
                        .addGap(49, 49, 49))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cashProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cashUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cashUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cashProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cashQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buyCashVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cashSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buyTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cashGoTo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("    CASH    ", jPanel14);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane2.addTab(" Buy              ", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/buyer.png")), jPanel11); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab(" Statistics", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/bar-chart.png")), jPanel5); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        txtPriceSearch.setEditable(false);
        txtPriceSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtPriceSearch.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtPriceSearch.setForeground(new java.awt.Color(204, 204, 204));
        txtPriceSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPriceSearch.setText("   Enter Product Name");
        txtPriceSearch.setToolTipText("");
        txtPriceSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPriceSearch.setSelectionColor(new java.awt.Color(204, 204, 204));
        txtPriceSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceSearchMouseClicked(evt);
            }
        });
        txtPriceSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceSearchKeyReleased(evt);
            }
        });

        tblPriceSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblPriceSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Price"
            }
        ));
        tblPriceSearch.setGridColor(new java.awt.Color(204, 204, 204));
        tblPriceSearch.setRowHeight(22);
        tblPriceSearch.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblPriceSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPriceSearchMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblPriceSearch);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtPriceSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(104, 104, 104)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab(" Prices         ", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/dollar-coin-stack.png")), jPanel6); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab(" Stocks       ", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/warehouse.png")), jPanel1); // NOI18N

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        btnBorrowerList.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBorrowerList.setText("BORROWER  LIST");
        btnBorrowerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowerListActionPerformed(evt);
            }
        });

        btnBuyerList.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBuyerList.setText("BUYER  LIST");
        btnBuyerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyerListActionPerformed(evt);
            }
        });

        tblCustomerItemList.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCustomerItemList.setGridColor(new java.awt.Color(225, 225, 225));
        tblCustomerItemList.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane5.setViewportView(tblCustomerItemList);

        btnItemList.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnItemList.setText("ITEM  LIST");
        btnItemList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemListActionPerformed(evt);
            }
        });

        lblTitile.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        lblTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitile.setText("BORROWER  LIST");

        btnDeleteDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteDetails.setText("Delete Details");
        btnDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDetailsActionPerformed(evt);
            }
        });

        lblCount.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblCount.setForeground(new java.awt.Color(102, 51, 0));
        lblCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnUpdateDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnUpdateDetails.setText("Update Details");
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/icons8-refresh-24.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(btnItemList, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183)
                                .addComponent(btnBorrowerList, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuyerList, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnItemList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrowerList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuyerList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitile, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jTabbedPane4.addTab("CUSTOMER/ITEM LIST", jPanel22);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane2.addTab(" Profiles     ", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/users.png")), jPanel15); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        lblBorrowerCode.setBackground(new java.awt.Color(255, 255, 255));
        lblBorrowerCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblBorrowerCode.setText("Borrower Code");

        txtBorrowerCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtBorrowerCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorrowerCodeActionPerformed(evt);
            }
        });

        pnlPersonalDetails.setBackground(new java.awt.Color(249, 249, 249));
        pnlPersonalDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblName.setText("Name");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtNICNo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblGender.setBackground(new java.awt.Color(255, 255, 255));
        lblGender.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblGender.setText("Gender");

        lblV.setBackground(new java.awt.Color(255, 255, 255));
        lblV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblV.setText("v");
        lblV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblNICNo.setBackground(new java.awt.Color(255, 255, 255));
        lblNICNo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblNICNo.setText("NIC No");

        ddGenger.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ddGenger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout pnlPersonalDetailsLayout = new javax.swing.GroupLayout(pnlPersonalDetails);
        pnlPersonalDetails.setLayout(pnlPersonalDetailsLayout);
        pnlPersonalDetailsLayout.setHorizontalGroup(
            pnlPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPersonalDetailsLayout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPersonalDetailsLayout.createSequentialGroup()
                        .addComponent(lblNICNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNICNo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblV, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ddGenger, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        pnlPersonalDetailsLayout.setVerticalGroup(
            pnlPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalDetailsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNICNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNICNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ddGenger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pnlPersonalDetailsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblName, txtName});

        pnlPersonalDetailsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ddGenger, lblGender, lblV, txtNICNo});

        pnlContactDetails.setBackground(new java.awt.Color(249, 249, 249));
        pnlContactDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lblMobile.setBackground(new java.awt.Color(255, 255, 255));
        lblMobile.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMobile.setText("Mobile");

        lblTelephoneNo.setBackground(new java.awt.Color(255, 255, 255));
        lblTelephoneNo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTelephoneNo.setText("Telephone No");

        txtTPMobile.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtTPLand.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblFixed.setBackground(new java.awt.Color(255, 255, 255));
        lblFixed.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblFixed.setText("Fixed");

        lblAdderess.setBackground(new java.awt.Color(255, 255, 255));
        lblAdderess.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAdderess.setText("Adderess");

        txtAdderess.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout pnlContactDetailsLayout = new javax.swing.GroupLayout(pnlContactDetails);
        pnlContactDetails.setLayout(pnlContactDetailsLayout);
        pnlContactDetailsLayout.setHorizontalGroup(
            pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlContactDetailsLayout.createSequentialGroup()
                        .addComponent(lblTelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTPMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTPLand, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFixed, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlContactDetailsLayout.createSequentialGroup()
                        .addComponent(lblAdderess, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdderess)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContactDetailsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTPLand, txtTPMobile});

        pnlContactDetailsLayout.setVerticalGroup(
            pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactDetailsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFixed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephoneNo)
                    .addComponent(txtTPMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTPLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdderess)
                    .addComponent(txtAdderess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pnlContactDetailsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblMobile, lblTelephoneNo, txtTPLand, txtTPMobile});

        pnlImage.setToolTipText("Click to add a Image");

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        btnUpdateAndDeleteDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnUpdateAndDeleteDetails.setText("Update & Delete Details");
        btnUpdateAndDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAndDeleteDetailsActionPerformed(evt);
            }
        });

        btnAddDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddDetails.setText("Add Details");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        lblShowMSG.setBackground(new java.awt.Color(255, 255, 255));
        lblShowMSG.setFont(new java.awt.Font("Tekton Pro Ext", 0, 17)); // NOI18N
        lblShowMSG.setForeground(new java.awt.Color(102, 51, 0));
        lblShowMSG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(btnUpdateAndDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(lblBorrowerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBorrowerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlContactDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblShowMSG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBorrowerCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBorrowerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(pnlPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(pnlContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lblShowMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateAndDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jTabbedPane5.addTab(" BORROWER ", jPanel17);

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
                .addGap(35, 35, 35)
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSettlingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSettlingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ddType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ddTimeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pnlAboutLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBuyerName, txtBuyerName});

        pnlAboutLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblSettlingTime, txtSettlingTime});

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
                .addGap(35, 35, 35)
                .addGroup(pnlBuyerContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdderessEmail)
                    .addComponent(txtAdderessEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pnlImage2.setToolTipText("Click to add a Image");

        javax.swing.GroupLayout pnlImage2Layout = new javax.swing.GroupLayout(pnlImage2);
        pnlImage2.setLayout(pnlImage2Layout);
        pnlImage2Layout.setHorizontalGroup(
            pnlImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        pnlImage2Layout.setVerticalGroup(
            pnlImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        btnBuyerUpdateDeleteDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBuyerUpdateDeleteDetails.setText("Update & Delete Details");
        btnBuyerUpdateDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyerUpdateDeleteDetailsActionPerformed(evt);
            }
        });

        btnBuyerAddDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBuyerAddDetails.setText("Add Details");
        btnBuyerAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyerAddDetailsActionPerformed(evt);
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
                        .addGap(36, 36, 36))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblBuyerShowMSG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                .addComponent(btnBuyerUpdateDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuyerAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlBuyerContactDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(44, Short.MAX_VALUE))))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(pnlImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(pnlBuyerContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(lblBuyerShowMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyerUpdateDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuyerAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jTabbedPane5.addTab("    BUYER    ", jPanel18);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        lbProductCode.setBackground(new java.awt.Color(255, 255, 255));
        lbProductCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbProductCode.setText("Product Code");

        txtProductCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        pnlImage3.setToolTipText("Click to add a Image");

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

        lblProductName.setBackground(new java.awt.Color(255, 255, 255));
        lblProductName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblProductName.setText("Product Name");

        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        ddCategory.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ddCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieces", "Weight", "Liquid" }));

        lblCategory.setBackground(new java.awt.Color(255, 255, 255));
        lblCategory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblCategory.setText("Category");

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

        btnItemsAddDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnItemsAddDetails.setText("Add Details");
        btnItemsAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemsAddDetailsActionPerformed(evt);
            }
        });

        lblItemShowMSG.setBackground(new java.awt.Color(255, 255, 255));
        lblItemShowMSG.setFont(new java.awt.Font("Tekton Pro Ext", 0, 17)); // NOI18N
        lblItemShowMSG.setForeground(new java.awt.Color(102, 51, 0));
        lblItemShowMSG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnItemUpdateDeleteDetails.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnItemUpdateDeleteDetails.setText("Update & Delete Details");
        btnItemUpdateDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemUpdateDeleteDetailsActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel21Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(btnItemUpdateDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnItemsAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblItemShowMSG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel21Layout.createSequentialGroup()
                                            .addComponent(lbProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel21Layout.createSequentialGroup()
                                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(lblDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                        .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                        .addComponent(lblPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(lblWarningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtWaningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ChBoxNoNeedToWarn)
                                .addGap(2, 2, 2)))
                        .addGap(13, 13, 13)))
                .addGap(35, 35, 35))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDefaultUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pnlImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWaningRate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(ChBoxNoNeedToWarn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(lblItemShowMSG)
                .addGap(121, 121, 121)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnItemsAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnItemUpdateDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        jPanel21Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ddCategory, lblCategory, lblProductName, txtProductName});

        jPanel21Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblItemShowMSG, txtPurchingPrice});

        jTabbedPane5.addTab("      ITEMS      ", jPanel21);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane2.addTab(" Register   ", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/notepad.png")), jPanel4); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab(" Settings  ", new javax.swing.ImageIcon(getClass().getResource("/billing_system/applicationUIs/settings.png")), jPanel7); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LoadPriceTbl() {
        SearchProductNames = Regdbo.ProductNameSearch(st);
        PriceGrid pg = new PriceGrid(SearchProductNames);
        tblPriceSearch.setModel(pg);
    }

    public void LoadBorrorwerTbl() {
        if (lblTitile.getText().equals("BORROWER  LIST")) {

            BorrowerList = Regdbo.getBorrowers();
            BorrowerGrid bg = new BorrowerGrid(BorrowerList);
            tblCustomerItemList.setModel(bg);
            lblCount.setText(Regdbo.getQuentityOfBorrowerList());

        } else if (lblTitile.getText().equals("BUYER  LIST")) {

            buList = Regdbo.getBuyers();
            BuyerGrid bg = new BuyerGrid(buList);
            tblCustomerItemList.setModel(bg);
            lblCount.setText(Regdbo.getQuentityOfBuyerList());

        } else {

            ItemList = Regdbo.getItems();
            ItemGrid bg = new ItemGrid(ItemList);
            tblCustomerItemList.setModel(bg);
            lblCount.setText(Regdbo.getQuentityOfItemList());

        }

    }

    private void LoadData(String type) {
        ComponentDetails cdtl = new ComponentDetails();
        switch (type) {
            case "cash":

                cdtl.setProductName(txt_cashProductName.getText());
                cdtl.setQuickCode(txt_cashProductCode.getText());
                double unitprice = new Double(txt_cashUnitPrice.getText()).doubleValue();
                cdtl.setUnitPrice(unitprice);
                double unitcost = new Double(txt_cashUnitCost.getText()).doubleValue();
                cdtl.setUnitCost(unitcost);
                double quantity = new Double(txt_cashQuantity.getText()).doubleValue();
                cdtl.setQuantity(quantity);
                cdtl.setTotal(unitprice * quantity);

                this.total += cdtl.getTotal();
                todayList.add(cdtl);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        DefaultTableModel model = (DefaultTableModel) Table_cash.getModel();
                        model.addRow(new Object[]{cdtl.getQuickCode(), cdtl.getProductName(), cdtl.getUnitCost(), cdtl.getUnitPrice(), cdtl.getQuantity(), cdtl.getTotal()});
                    }
                });
                break;

            case "credit":
                cdtl.setProductName(txt_creditProductName.getText());
                cdtl.setQuickCode(txt_creditProductCode.getText());
                double unitprice1 = new Double(txt_creditUnitPrice.getText()).doubleValue();
                cdtl.setUnitPrice(unitprice1);
                double unitcost1 = new Double(txt_creditUnitCost.getText()).doubleValue();
                cdtl.setUnitCost(unitcost1);
                double quantity1 = new Double(txt_creditQuantity.getText()).doubleValue();
                cdtl.setQuantity(quantity1);
                cdtl.setTotal(unitprice1 * quantity1);

                this.total += cdtl.getTotal();
                todayList.add(cdtl);
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        DefaultTableModel model = (DefaultTableModel) Table_credit.getModel();
                        model.addRow(new Object[]{cdtl.getQuickCode(), cdtl.getProductName(), cdtl.getUnitCost(), cdtl.getUnitPrice(), cdtl.getQuantity(), cdtl.getTotal()});
                    }
                });
                break;
        }
    }

    private void setDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        Calendar currentCalendar = Calendar.getInstance();
        Date currentTime = currentCalendar.getTime();
        lbl_date.setText(dateFormat.format(currentTime));
        lbl_date1.setText(dateFormat.format(currentTime));
        lbl_date2.setText(dateFormat.format(currentTime));
        //lbl_date.setHorizontalAlignment(SwingConstants.CENTER);
        //timeLabel.setText(timeFormat.format(currentTime));
    }

    private void cloneData() throws SQLException {
        ComponentDetails cdtl = new ComponentDetails();
        cdtl.setProductName(txt_saleProductname.getText());
        cdtl.setQuickCode(txt_quick.getText());
        double unitprice, preQuantity;
        ResultSet rs = dbo.cloneStockData(cdtl);
        if (rs.next()) {
            unitprice = rs.getDouble("unitprice");
            preQuantity = rs.getDouble("quantity");
            cdtl.setUnitPrice(unitprice);
        } else {
            JOptionPane.showMessageDialog(this, "NAME NOT FOUND");
            return;
        }
        double quantity = new Double(txt_saleQuantity.getText()).doubleValue();

        if (preQuantity >= quantity) {
            cdtl.setQuantity(quantity);
            cdtl.setTotal(unitprice * quantity);
            this.total += cdtl.getTotal();
            todayList.add(cdtl);

            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    DefaultTableModel model = (DefaultTableModel) Table_sale.getModel();
                    model.addRow(new Object[]{cdtl.getProductName(), cdtl.getUnitPrice() + "*" + cdtl.getQuantity(), cdtl.getTotal()});
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "STOCK IS OUT OF RANGE");
            return;
        }
    }

    private void btn_buyCashVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyCashVerifyActionPerformed
        LoadData("cash");
        txt_cashProductName.setText("");
        txt_cashProductCode.setText("");
        txt_cashUnitPrice.setText("");
        txt_cashUnitCost.setText("");
        txt_cashQuantity.setText("");
        txt_buyTotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_btn_buyCashVerifyActionPerformed

    private void btn_buyCreditVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyCreditVerifyActionPerformed
        if(!(txt_cash.getText().equals(""))){
            LoadData("credit");
            txt_creditProductName.setText("");
            txt_creditProductCode.setText("");
            txt_creditUnitPrice.setText("");
            txt_creditUnitCost.setText("");
            txt_creditQuantity.setText("");
            txt_paid.setText(txt_cash.getText());
            txt_creditTotal.setText(String.valueOf(this.total));
            double balance = Math.abs(this.total - Double.parseDouble(txt_cash.getText()));
            txt_balance.setText(String.valueOf(balance));
        }else{
            JOptionPane.showMessageDialog(this, "how much cash has been paid ?");
        }
    }//GEN-LAST:event_btn_buyCreditVerifyActionPerformed

    private void btn_cashGoToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cashGoToActionPerformed
        try {
            String supliername = txt_cashSupplierName.getText();
            int id = dbo.enterBuyersDeal(supliername, total, todayList, 1);
            if(id != -1){
                
                for (ComponentDetails cdtl : todayList) {
                    if (this.namelist.contains(cdtl.getProductName())) {
                        dbo.updateComponentDetails(cdtl, "buy");
                    } else {
                        dbo.addComponentDetails(cdtl);
                        namelist.add(cdtl.getProductName());
                    }
                }
                
                dbo.journalized(total,"expense");
                
                this.todayList.clear();
                this.total = 0;
                txt_cashProductName.setText("");
                txt_cashProductCode.setText("");
                txt_cashQuantity.setText("");
                txt_cashSupplierName.setText("");
                txt_cashUnitPrice.setText("");
                txt_cashSupplierName.setText("");
                txt_buyTotal.setText("");
                txt_cashUnitCost.setText("");
                DefaultTableModel model = (DefaultTableModel) Table_cash.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(this, "successfully inserted");
            }else{
                JOptionPane.showMessageDialog(this, "plz register the supplier first");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }


    }//GEN-LAST:event_btn_cashGoToActionPerformed

    private void btn_creditGoToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditGoToActionPerformed

        try {
            String sellerName = txt_sellerName.getText();
            int id = dbo.enterBuyersDeal(sellerName, total, todayList, 0);
            if(id != -1){
                double balance = Double.parseDouble(txt_balance.getText());

                for (ComponentDetails cdtl : todayList) {
                    if (this.namelist.contains(cdtl.getProductName())) {
                        dbo.updateComponentDetails(cdtl, "buy");
                    } else {
                        dbo.addComponentDetails(cdtl);
                        namelist.add(cdtl.getProductName());
                    }
                }
//                System.out.println(buyerlist);
//                System.out.println(namelist);
                if (this.buyerlist.contains(id)) {
                    dbo.updatecreditbuyer(id, balance);
                } else {
                    dbo.addcreditbuyer(id, balance);
                    namelist.add(sellerName);
                }
                
                dbo.journalized(new Double(txt_cash.getText()).doubleValue(),"expense");

                this.todayList.clear();
                this.total = 0;
                txt_creditProductName.setText("");
                txt_creditProductCode.setText("");
                txt_creditQuantity.setText("");
                txt_creditTotal.setText("");
                txt_creditUnitPrice.setText("");
                txt_creditUnitCost.setText("");
                txt_paid.setText("");
                txt_balance.setText("");
                txt_sellerName.setText("");
                txt_cash.setText("");
                DefaultTableModel model = (DefaultTableModel) Table_credit.getModel();
                model.setRowCount(0);

                JOptionPane.showMessageDialog(this, "successfully inserted");
            }else{
                JOptionPane.showMessageDialog(this, "plz register the seller first");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_btn_creditGoToActionPerformed

    private void btn_saleOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saleOkActionPerformed
        try {
            cloneData();
            txt_SaleTot.setText(String.valueOf(this.total));
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_saleOkActionPerformed

    private void txt_quickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quickActionPerformed
        try {
            String[] txt = txt_quick.getText().split("_", 2);
            txt_saleProductname.setText(dbo.applyName(txt[0]));
            txt_saleQuantity.setText(txt[1]);
            combo_code.setToolTipText(txt[0]);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_quickActionPerformed

    private void btn_cashfinishDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cashfinishDealActionPerformed
        for (ComponentDetails cdtl : todayList) {
            try {
                dbo.updateComponentDetails(cdtl, "sell");
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                dbo.journalized(total, "income");
                
                if(txt_saleCashCustomerName.getText().equals("UNKNOWN") || txt_saleCashCustomerName.getText().equals("")){
                    dbo.enterCustomersDeal("unknown", total, todayList, 1);
                }else{
                    String customer = txt_saleCashCustomerName.getText();
                    dbo.enterCustomersDeal(customer, total, todayList, 1);
                }
                this.todayList.clear();
                this.total = 0;
                txt_saleCashCustomerName.setText("");
                txt_saleProductname.setText("");
                txt_saleQuantity.setText("");
                txt_quick.setText("");
                JOptionPane.showMessageDialog(this, "successfully dealed");

    }//GEN-LAST:event_btn_cashfinishDealActionPerformed

    void RegClear() {

        txtBorrowerCode.setText("");
        txtName.setText("");
        txtNICNo.setText("");
        ddGenger.setSelectedIndex(0);
        txtTPMobile.setText("");
        txtTPLand.setText("");
        txtAdderess.setText("");

    }

    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed

        RegDetails rd = new RegDetails();

        if (!txtBorrowerCode.getText().equals("") && !txtName.getText().equals("")) {
            try {
                rd.setRegID(0);
                rd.setBorrowerCode(txtBorrowerCode.getText());
                rd.setName(txtName.getText());
                if (txtNICNo.getText().equals("")) {
                    rd.setNIC_Number(0);
                } else {
                    rd.setNIC_Number(Integer.parseInt(txtNICNo.getText()));
                }
                rd.setGender((String) ddGenger.getSelectedItem());     //under if statement,ask whether details are correct via message dialog 
                if (txtTPMobile.getText().equals("")) {
                    rd.setTP_Mobile(0);
                } else {
                    rd.setTP_Mobile(Integer.parseInt(txtTPMobile.getText()));
                }
                if (txtTPLand.getText().equals("")) {
                    rd.setTP_Land(0);
                } else {
                    rd.setTP_Land(Integer.parseInt(txtTPLand.getText()));
                }
                if (txtAdderess.getText().equals("")) {
                    rd.setAdderess("Null");
                } else {
                    rd.setAdderess(txtAdderess.getText());
                }

                String msg = "<html>" + "Please Check all Details again...!<br><br>"
                        + "<tr><td>Borrower code</td>-<td> </td><td> " + txtBorrowerCode.getText() + "</td></tr>"
                        + "<tr><td>Name </td>-<td></td><td> " + txtName.getText() + "</td></tr>"
                        + "<tr><td>NIC Number</td>-<td></td><td> " + txtNICNo.getText() + "</td></tr>"
                        + "<tr><td>Gender</td>-<td></td><td>" + ddGenger.getSelectedItem() + "</td></tr>"
                        + "<tr><td>Mobile</td>-<td></td><td>" + txtTPMobile.getText() + "</td></tr>"
                        + "<tr><td>Fixed</td>-<td></td><td>" + txtTPLand.getText() + "</td></tr>"
                        + "<tr><td>Adderess</td>-<td></td><td>" + txtAdderess.getText() + "</td></tr><tr><td> </td></tr><br>" + "Shall It be entered to the Borrower List" + "</html>";

                int p = JOptionPane.showConfirmDialog(this, msg, "Add Details", JOptionPane.YES_NO_OPTION);

                int result = 0;
                if (p == 0) {
                    result = Regdbo.addRegDetails(rd);

                    Addtime = time;
                    lblShowMSG.setText("Successfully  Inserted");
                    time1 = Addtime + 2;
                    if (time1 > 59) {
                        time1 = time1 - 60;
                    }

                    LoadBorrorwerTbl();
                }

                switch (result) {
                    case 1:
                        RegClear();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "Error Occured While Inserting ,Please Reenter Details!");
                        RegClear();
                }

            } catch (Exception e) {
                System.out.println("btnAddDetails --> " + e);
                JOptionPane.showMessageDialog(this, "Error Occured, Check Your Details Again");
                RegClear();
            }
        } else {
            JOptionPane.showMessageDialog(this, "You must enter Name and Borrower Code");
        }
    }//GEN-LAST:event_btnAddDetailsActionPerformed

    void BuyerRegClear() {

        txtBuyerCode.setText("");
        txtBuyerName.setText("");
        txtSettlingTime.setText("");
        ddTimeUnit.setSelectedIndex(0);
        ddType.setSelectedIndex(0);
        txtTPMobileI.setText("");
        txtTPLandII.setText("");
        txtAdderessEmail.setText("");

    }

    private void btnBuyerAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerAddDetailsActionPerformed

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
                rd.setType((String) ddType.getSelectedItem());     //under if statement,ask whether details are correct via message dialog 
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
                        + "<tr><td>Fixed</td>-<td></td><td>" + txtTPLandII.getText() + "</td></tr>"
                        + "<tr><td>Adderess/Email</td>-<td></td><td>" + txtAdderessEmail.getText() + "</td></tr><tr><td> </td></tr><br>" + "Shall It be entered to the Buyer List" + "</html>";

                int p = JOptionPane.showConfirmDialog(this, msg, "Add Details", JOptionPane.YES_NO_OPTION);

                int result = 0;
                if (p == 0) {
                    result = Regdbo.addBuyerRegDetails(rd);
                    Addtime = time;
                    lblBuyerShowMSG.setText("Successfully  Inserted");
                    time1 = Addtime + 2;
                    if (time1 > 59) {
                        time1 = time1 - 60;
                    }
                    LoadBorrorwerTbl();
                }
                switch (result) {
                    case 1:
                        BuyerRegClear();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "Error Occured While Inserting ,Please Reenter Details!");
                        BuyerRegClear();
                }
            } catch (Exception e) {
                System.out.println("btnAddDetails --> " + e);
                JOptionPane.showMessageDialog(this, "Error Occured, Check Your Details Again");
                BuyerRegClear();
            }
        } else {
            JOptionPane.showMessageDialog(this, "You must enter Name , Buyer Code & correct Type");
        }
    }//GEN-LAST:event_btnBuyerAddDetailsActionPerformed

    private void Table_creditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_creditMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_creditMouseEntered

    private void btnBuyerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerListActionPerformed

        lblTitile.setText(btnBuyerList.getText());

        LoadBorrorwerTbl();

    }//GEN-LAST:event_btnBuyerListActionPerformed

    private void btnBorrowerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowerListActionPerformed

        lblTitile.setText(btnBorrowerList.getText());

        LoadBorrorwerTbl();

    }//GEN-LAST:event_btnBorrowerListActionPerformed

    private void btnItemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemListActionPerformed

        lblTitile.setText(btnItemList.getText());

        LoadBorrorwerTbl();


    }//GEN-LAST:event_btnItemListActionPerformed

    private void btnUpdateAndDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAndDeleteDetailsActionPerformed

        RegClear();
        UpdateDeleteBorrowers db = new UpdateDeleteBorrowers();
        db.setVisible(true);
        db.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_btnUpdateAndDeleteDetailsActionPerformed

    private void btnDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDetailsActionPerformed

        try {
            RegDetails rd = new RegDetails();

            if (lblTitile.getText().equals("BORROWER  LIST")) {
                rd.setName(BorrowerList.get(tblCustomerItemList.getSelectedRow()).getName());

                String msg = "<html>" + "Are you sure that you want to Delete this Details ...!<br><br>"
                        + "<tr><td>Borrower code</td>-<td> </td><td> " + BorrowerList.get(tblCustomerItemList.getSelectedRow()).getBorrowerCode() + "</td></tr>"
                        + "<tr><td>Name </td>-<td></td><td> " + BorrowerList.get(tblCustomerItemList.getSelectedRow()).getName() + "</td></tr>"
                        + "<tr><td>NIC Number</td>-<td></td><td> " + BorrowerList.get(tblCustomerItemList.getSelectedRow()).getNIC_Number() + "</td></tr>"
                        + "<tr><td>Gender</td>-<td></td><td>" + BorrowerList.get(tblCustomerItemList.getSelectedRow()).getGender() + "</td></tr>"
                        + "<tr><td>Mobile</td>-<td></td><td>" + BorrowerList.get(tblCustomerItemList.getSelectedRow()).getTP_Mobile() + "</td></tr>"
                        + "<tr><td>Fixed</td>-<td></td><td>" + BorrowerList.get(tblCustomerItemList.getSelectedRow()).getTP_Land() + "</td></tr>"
                        + "<tr><td>Adderess</td>-<td></td><td>" + BorrowerList.get(tblCustomerItemList.getSelectedRow()).getAdderess() + "</td></tr><br><br>" + "Delete details" + "</html>";

                int p = JOptionPane.showConfirmDialog(this, msg, "Delete Borrower Details", JOptionPane.YES_NO_OPTION);

                if (p == 0) {
                    Regdbo.DeleteBorrower(rd);
                    LoadBorrorwerTbl();
                }
            } else if (lblTitile.getText().equals("BUYER  LIST")) {
                rd.setName(buList.get(tblCustomerItemList.getSelectedRow()).getName());

                String msg = "<html>" + "Are you sure that you want to Delete this Details ...!<br><br>"
                        + "<tr><td>Buyer code</td>-<td> </td><td> " + buList.get(tblCustomerItemList.getSelectedRow()).getBuyerCode() + "</td></tr>"
                        + "<tr><td>Name </td>-<td></td><td> " + buList.get(tblCustomerItemList.getSelectedRow()).getName() + "</td></tr>"
                        + "<tr><td>Settling Time</td>-<td></td><td> " + buList.get(tblCustomerItemList.getSelectedRow()).getSettelingTime() + "</td></tr>"
                        + "<tr><td>Type</td>-<td></td><td>" + buList.get(tblCustomerItemList.getSelectedRow()).getType() + "</td></tr>"
                        + "<tr><td>Mobile</td>-<td></td><td>" + buList.get(tblCustomerItemList.getSelectedRow()).getTP_Mobile() + "</td></tr>"
                        + "<tr><td>Mobile/Fixed</td>-<td></td><td>" + buList.get(tblCustomerItemList.getSelectedRow()).getTP_Land() + "</td></tr>"
                        + "<tr><td>Adderess/Email</td>-<td></td><td>" + buList.get(tblCustomerItemList.getSelectedRow()).getAdderess() + "</td></tr><br><br>" + "Delete details" + "</html>";

                int p = JOptionPane.showConfirmDialog(this, msg, "Delete Buyer Details", JOptionPane.YES_NO_OPTION);

                if (p == 0) {
                    Regdbo.DeleteBuyer(rd);
                    LoadBorrorwerTbl();
                }
            } else {
                rd.setName(ItemList.get(tblCustomerItemList.getSelectedRow()).getName());
                int p = 3;
                if (ItemList.get(tblCustomerItemList.getSelectedRow()).getWarningRate() == 0) {
                    String msg = "<html>" + "Are you sure that you want to Delete this Details ...!<br><br>"
                            + "<tr><td>Code</td>-<td> </td><td> " + ItemList.get(tblCustomerItemList.getSelectedRow()).getProductCode() + "</td></tr>"
                            + "<tr><td>Name </td>-<td></td><td> " + ItemList.get(tblCustomerItemList.getSelectedRow()).getName() + "</td></tr>"
                            + "<tr><td>Category</td>-<td></td><td> " + ItemList.get(tblCustomerItemList.getSelectedRow()).getCategory() + "</td></tr>"
                            + "<tr><td>Unit Price</td>-<td></td><td>" + ItemList.get(tblCustomerItemList.getSelectedRow()).getUnitPrice() + "</td></tr>"
                            + "<tr><td>Purching Price</td>-<td></td><td>" + ItemList.get(tblCustomerItemList.getSelectedRow()).getPurchingPrice() + "</td></tr>"
                            + "</td></tr> </td></tr><br><br> Delete details </html>";
                    p = JOptionPane.showConfirmDialog(this, msg, "Delete Item Details", JOptionPane.YES_NO_OPTION);
                } else {
                    String msg = "<html>" + "Are you sure that you want to Delete this Details ...!<br><br>"
                            + "<tr><td>Code</td>-<td> </td><td> " + ItemList.get(tblCustomerItemList.getSelectedRow()).getProductCode() + "</td></tr>"
                            + "<tr><td>Name </td>-<td></td><td> " + ItemList.get(tblCustomerItemList.getSelectedRow()).getName() + "</td></tr>"
                            + "<tr><td>Category</td>-<td></td><td> " + ItemList.get(tblCustomerItemList.getSelectedRow()).getCategory() + "</td></tr>"
                            + "<tr><td>Unit Price</td>-<td></td><td>" + ItemList.get(tblCustomerItemList.getSelectedRow()).getUnitPrice() + "</td></tr>"
                            + "<tr><td>Purching Price</td>-<td></td><td>" + ItemList.get(tblCustomerItemList.getSelectedRow()).getPurchingPrice() + "</td></tr>"
                            + "<tr><td>Warning Rate</td>-<td></td><td>" + ItemList.get(tblCustomerItemList.getSelectedRow()).getWarningRate() + "</td></tr> </td></tr><br><br> Delete details </html>";
                    p = JOptionPane.showConfirmDialog(this, msg, "Delete Item Details", JOptionPane.YES_NO_OPTION);
                }

                if (p == 0) {
                    Regdbo.DeleteItems(rd);
                    LoadBorrorwerTbl();
                }
            }
            //System.out.println("Delete this "+BorrowerList.get(tblBorrowerList.getSelectedRow()).getName());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDeleteDetailsActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed

        try {
            UpdateBorrowers ub = new UpdateBorrowers();
            UpdateBuyers ubuy = new UpdateBuyers();
            UpdateItems ui = new UpdateItems();
            RegDetails rd = new RegDetails();

            if (lblTitile.getText().equals("BORROWER  LIST")) {
                rd.setName(BorrowerList.get(tblCustomerItemList.getSelectedRow()).getName());

                Regdbo.SetUpdateTxtFieldsOfBorrowers(rd.getName(), rd);
                ub.setVisible(true);
                ub.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ub.loadUpdateBorrowerUI(rd);
            } else if (lblTitile.getText().equals("BUYER  LIST")) {
                rd.setName(buList.get(tblCustomerItemList.getSelectedRow()).getName());

                Regdbo.SetUpdateTxtFieldsOfBuyers(rd.getName(), rd);
                ubuy.setVisible(true);
                ubuy.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ubuy.loadUpdateBuyerUI(rd);
            } else {
                rd.setName(ItemList.get(tblCustomerItemList.getSelectedRow()).getName());

                Regdbo.SetUpdateTxtFieldsOfItems(rd.getName(), rd);
                ui.setVisible(true);
                ui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ui.loadUpdateItemUI(rd);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Select a Row First");
            System.out.println(e);
        }

    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void btnBuyerUpdateDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerUpdateDeleteDetailsActionPerformed

        RegClear();
        UpdateDeleteBuyers db = new UpdateDeleteBuyers();
        db.setVisible(true);
        db.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_btnBuyerUpdateDeleteDetailsActionPerformed

    private void txtBorrowerCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorrowerCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBorrowerCodeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        LoadBorrorwerTbl();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    void ItemRegClear() {

        txtProductCode.setText("");
        txtProductName.setText("");
        ddCategory.setSelectedIndex(0);
        txtUnitPrice.setText("");
        txtPurchingPrice.setText("");
        txtWaningRate.setText("");

    }

    private void btnItemsAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemsAddDetailsActionPerformed
        RegDetails rd = new RegDetails();

        if (!txtProductCode.getText().equals("") && !txtProductName.getText().equals("") && !txtUnitPrice.getText().equals("") && !txtPurchingPrice.getText().equals("")) {
            try {
                rd.setRegID(0);
                rd.setProductCode(txtProductCode.getText());
                rd.setName(txtProductName.getText());
                rd.setCategory(ddCategory.getSelectedItem().toString());
                rd.setUnitPrice(Integer.parseInt(txtUnitPrice.getText()));
                rd.setPurchingPrice(Integer.parseInt(txtPurchingPrice.getText()));
                rd.setDefaultUnit(txtDefaultUnit.getText());

                if (txtWaningRate.getText().equals("")) {
                    if (a == 1) {
                        rd.setWarningRate(0);

                        String msg = "<html>" + "Please Check all Details again...!<br><br>"
                                + "<tr><td>Code</td>-<td> </td><td> " + txtProductCode.getText() + "</td></tr>"
                                + "<tr><td>Name </td>-<td></td><td> " + txtProductName.getText() + "</td></tr>"
                                + "<tr><td>Category</td>-<td></td><td>" + ddCategory.getSelectedItem() + "</td></tr>"
                                + "<tr><td>Default Unit</td>-<td></td><td>" + txtDefaultUnit.getText()+ "</td></tr>"
                                + "<tr><td>Unit Price</td>-<td></td><td>" + txtUnitPrice.getText() + "</td></tr>"
                                + "<tr><td>Purching Price</td>-<td></td><td>" + txtPurchingPrice.getText() + "</td></tr>"
                                + "<tr><td> </td></tr><br> Shall It be entered to the Item List </html>";

                        int p = JOptionPane.showConfirmDialog(this, msg, "Add Details", JOptionPane.YES_NO_OPTION);

                        int result = 0;
                        if (p == 0) {
                            if (Integer.parseInt(txtPurchingPrice.getText()) <= Integer.parseInt(txtUnitPrice.getText())) {
                                result = Regdbo.addItemRegDetails(rd);
                                Addtime = time;
                                lblItemShowMSG.setText("Successfully  Inserted");
                                time1 = Addtime + 2;
                                if (time1 > 59) {
                                    time1 = time1 - 60;
                                }
                                LoadBorrorwerTbl();
                            } else {
                                JOptionPane.showMessageDialog(this, "Purching Price should be less than or equal to Unit Price");
                            }
                        }
                        switch (result) {
                            case 1:
                                ItemRegClear();
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
                            + "<tr><td>Default Unit</td>-<td></td><td>" + txtDefaultUnit.getText()+ "</td></tr>"
                            + "<tr><td>Unit Price</td>-<td></td><td>" + txtUnitPrice.getText() + "</td></tr>"
                            + "<tr><td>Purching Price</td>-<td></td><td>" + txtPurchingPrice.getText() + "</td></tr>"
                            + "<tr><td>Warning Rate</td>-<td></td><td>" + txtWaningRate.getText() + "</td></tr><tr><td> </td></tr><br>" + "Shall It be entered to the Item List" + "</html>";

                    int p = JOptionPane.showConfirmDialog(this, msg, "Add Details", JOptionPane.YES_NO_OPTION);

                    int result = 0;
                    if (p == 0) {
                        if (Integer.parseInt(txtPurchingPrice.getText()) <= Integer.parseInt(txtUnitPrice.getText())) {
                            result = Regdbo.addItemRegDetails(rd);
                            Addtime = time;
                            lblItemShowMSG.setText("Successfully  Inserted");
                            time1 = Addtime + 2;
                            if (time1 > 59) {
                                time1 = time1 - 60;
                            }
                            LoadBorrorwerTbl();
                        } else {
                            JOptionPane.showMessageDialog(this, "Purching Price should be less than or equal to Unit Price");
                        }
                    }
                    switch (result) {
                        case 1:
                            ItemRegClear();
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(this, "Error Occured While Inserting ,Please Reenter Details!");
                        //ItemRegClear();
                    }
                }

            } catch (Exception e) {
                System.out.println("btnAddDetails --> " + e);
                JOptionPane.showMessageDialog(this, "Error Occured, Check Your Details Again");
                //ItemRegClear();
            }
        } else {
            JOptionPane.showMessageDialog(this, "You must enter all details");
        }
    }//GEN-LAST:event_btnItemsAddDetailsActionPerformed

    private void btnItemUpdateDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemUpdateDeleteDetailsActionPerformed

        ItemRegClear();
        UpdateDeleteItems db = new UpdateDeleteItems();
        db.setVisible(true);
        db.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_btnItemUpdateDeleteDetailsActionPerformed

    int a = 0;
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

    private void txtPriceSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceSearchKeyReleased
        st = txtPriceSearch.getText().trim();
        LoadPriceTbl();

    }//GEN-LAST:event_txtPriceSearchKeyReleased

    private void txtPriceSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceSearchMouseClicked
        try {
            txtPriceSearch.setText("");
            txtPriceSearch.setForeground(new Color(0, 0, 0));
            txtPriceSearch.setEditable(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtPriceSearchMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        try {
            txtPriceSearch.setForeground(new Color(204, 204, 204));
            txtPriceSearch.setText("   Enter Product Name");
            txtPriceSearch.setEditable(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jPanel6MouseClicked

    private void tblPriceSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPriceSearchMouseClicked
        try {
            txtPriceSearch.setForeground(new Color(204, 204, 204));
            txtPriceSearch.setText("   Enter Product Name");
            txtPriceSearch.setEditable(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblPriceSearchMouseClicked

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaleActionPerformed

    private void btnSaleReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleReturnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaleReturnsActionPerformed

    private void btnSale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSale1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSale1ActionPerformed

    private void btn_bilfinishdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bilfinishdealActionPerformed
        for (ComponentDetails cdtl : todayList) {
            try {
                dbo.updateComponentDetails(cdtl, "sell");
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                dbo.journalized(total, "income");
                
                if(txt_saleCashCustomerName.getText().equals("UNKNOWN") || txt_saleCashCustomerName.getText().equals("")){
                    dbo.enterCustomersDeal("unknown", total, todayList, 1);
                }else{
                    String customer = txt_saleCashCustomerName.getText();
                    dbo.enterCustomersDeal(customer, total, todayList, 1);
                }
                this.todayList.clear();
                this.total = 0;
                txt_saleCashCustomerName.setText("");
                txt_saleProductname.setText("");
                txt_saleQuantity.setText("");
                txt_quick.setText("");
                JOptionPane.showMessageDialog(this, "successfully dealed");
    }//GEN-LAST:event_btn_bilfinishdealActionPerformed

    private void btnCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomActionPerformed
        CustomItemUnit ciu = new CustomItemUnit();
        ciu.setVisible(true);
        ciu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCustomActionPerformed

    private void txt_buyTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buyTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buyTotalActionPerformed

    private void txt_cashQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cashQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cashQuantityActionPerformed

    private void txt_SaleTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SaleTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SaleTotActionPerformed

    private void txt_saleCashCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saleCashCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saleCashCustomerNameActionPerformed

    private void txt_saleCashCustomerName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saleCashCustomerName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saleCashCustomerName1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new App().setVisible(true);
                } catch (SQLException ex) {
                    System.out.println("SQL handling exception");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChBoxNoNeedToWarn;
    private javax.swing.JTable Table_cash;
    private javax.swing.JTable Table_credit;
    private javax.swing.JTable Table_sale;
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JButton btnBorrowerList;
    private javax.swing.JButton btnBuyerAddDetails;
    private javax.swing.JButton btnBuyerList;
    private javax.swing.JButton btnBuyerUpdateDeleteDetails;
    private javax.swing.JButton btnCustom;
    private javax.swing.JButton btnDeleteDetails;
    private javax.swing.JButton btnItemList;
    private javax.swing.JButton btnItemUpdateDeleteDetails;
    private javax.swing.JButton btnItemsAddDetails;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSale;
    private javax.swing.JButton btnSale1;
    private javax.swing.JButton btnSaleReturns;
    private javax.swing.JButton btnUpdateAndDeleteDetails;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btn_bilfinishdeal;
    private javax.swing.JButton btn_buyCashVerify;
    private javax.swing.JButton btn_buyCreditVerify;
    private javax.swing.JButton btn_cashGoTo;
    private javax.swing.JButton btn_cashfinishDeal;
    private javax.swing.JButton btn_creditGoTo;
    private javax.swing.JButton btn_saleOk;
    private javax.swing.JComboBox<String> combo_code;
    private javax.swing.JComboBox<String> ddCategory;
    private javax.swing.JComboBox<String> ddGenger;
    private javax.swing.JComboBox<String> ddTimeUnit;
    private javax.swing.JComboBox<String> ddType;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel lbProductCode;
    private javax.swing.JLabel lbSaleName;
    private javax.swing.JLabel lbSalePayment;
    private javax.swing.JLabel lbSaleQuickCode;
    private javax.swing.JLabel lbSaleReturnsCode;
    private javax.swing.JLabel lbSaleReturnsName1;
    private javax.swing.JLabel lbSaleReturnsQuantity;
    private javax.swing.JLabel lbSaleReturnsQuickCode;
    private javax.swing.JLabel lbSalelCode;
    private javax.swing.JLabel lblAdderess;
    private javax.swing.JLabel lblAdderessEmail;
    private javax.swing.JLabel lblBorrowerCode;
    private javax.swing.JLabel lblBuyerCode;
    private javax.swing.JLabel lblBuyerName;
    private javax.swing.JLabel lblBuyerShowMSG;
    private javax.swing.JLabel lblBuyerTelephoneNo;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblDefaultUnit;
    private javax.swing.JLabel lblFixed;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblItemShowMSG;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblMobileFixed;
    private javax.swing.JLabel lblMobileI;
    private javax.swing.JLabel lblNICNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblPurchingPrice;
    private javax.swing.JLabel lblSaleQuantity;
    private javax.swing.JLabel lblSaleQuantity1;
    private javax.swing.JLabel lblSettlingTime;
    private javax.swing.JLabel lblShowMSG;
    private javax.swing.JLabel lblTelephoneNo;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JLabel lblV;
    private javax.swing.JLabel lblWarningRate;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_date1;
    private javax.swing.JLabel lbl_date2;
    private javax.swing.JLabel lbl_date3;
    private javax.swing.JPanel pnlAbout;
    private javax.swing.JPanel pnlBuyerContactDetails;
    private javax.swing.JPanel pnlContactDetails;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlImage2;
    private javax.swing.JPanel pnlImage3;
    private javax.swing.JPanel pnlPersonalDetails;
    private javax.swing.JPanel pnlSale;
    private javax.swing.JPanel pnlSaleReturns;
    private javax.swing.JTable tblCustomerItemList;
    private javax.swing.JTable tblMonthlyBills;
    private javax.swing.JTable tblPriceSearch;
    private javax.swing.JTextField txtAdderess;
    private javax.swing.JTextField txtAdderessEmail;
    private javax.swing.JTextField txtBorrowerCode;
    private javax.swing.JTextField txtBuyerCode;
    private javax.swing.JTextField txtBuyerName;
    private javax.swing.JTextField txtDefaultUnit;
    private javax.swing.JTextField txtNICNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPriceSearch;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtPurchingPrice;
    private javax.swing.JTextField txtSaleCode1;
    private javax.swing.JTextField txtSaleName;
    private javax.swing.JTextField txtSalePayment;
    private javax.swing.JTextField txtSaleQuantity;
    private javax.swing.JTextField txtSaleQuickCode;
    private javax.swing.JTextField txtSaleReturnsCode;
    private javax.swing.JTextField txtSaleReturnsName1;
    private javax.swing.JTextField txtSaleReturnsQuantity;
    private javax.swing.JTextField txtSaleReturnsQuickCode;
    private javax.swing.JTextField txtSettlingTime;
    private javax.swing.JTextField txtTPLand;
    private javax.swing.JTextField txtTPLandII;
    private javax.swing.JTextField txtTPMobile;
    private javax.swing.JTextField txtTPMobileI;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtWaningRate;
    private javax.swing.JTextField txt_SaleTot;
    private javax.swing.JTextField txt_balance;
    private javax.swing.JTextField txt_buyTotal;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_cashProductCode;
    private javax.swing.JTextField txt_cashProductName;
    private javax.swing.JTextField txt_cashQuantity;
    private javax.swing.JTextField txt_cashSupplierName;
    private javax.swing.JTextField txt_cashUnitCost;
    private javax.swing.JTextField txt_cashUnitPrice;
    private javax.swing.JTextField txt_creditProductCode;
    private javax.swing.JTextField txt_creditProductName;
    private javax.swing.JTextField txt_creditQuantity;
    private javax.swing.JTextField txt_creditTotal;
    private javax.swing.JTextField txt_creditUnitCost;
    private javax.swing.JTextField txt_creditUnitPrice;
    private javax.swing.JTextField txt_paid;
    private javax.swing.JTextField txt_quick;
    private javax.swing.JTextField txt_saleCashCustomerName;
    private javax.swing.JTextField txt_saleCashCustomerName1;
    private javax.swing.JTextField txt_saleProductname;
    private javax.swing.JTextField txt_saleQuantity;
    private javax.swing.JTextField txt_sellerName;
    // End of variables declaration//GEN-END:variables
}
