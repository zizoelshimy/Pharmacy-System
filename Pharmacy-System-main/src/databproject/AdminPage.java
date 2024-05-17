package databproject;

import java.sql.Connection;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
public class AdminPage extends javax.swing.JFrame {
    static Connection con;
    PharmacyAPI pharma = PharmacyAPI.getInstance();
    Employee empobj = new Employee(pharma);
    Manufacturers manuobj=new Manufacturers(pharma);
    Medicine medobj = new Medicine(pharma);
    Branch branobj = new Branch(pharma);
    Stock stkobj = new Stock(pharma);
    customer cstmobj = new customer(pharma);
    LoginPage logp=new LoginPage();
    public AdminPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        addemp = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        addmanager = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        manname = new javax.swing.JTextField();
        manssn = new javax.swing.JTextField();
        mansalary = new javax.swing.JTextField();
        manBid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        manPN = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Delete = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        appemp = new javax.swing.JPanel();
        empname = new javax.swing.JTextField();
        empssn = new javax.swing.JTextField();
        empsalary = new javax.swing.JTextField();
        empBid = new javax.swing.JTextField();
        empPN = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        empmanid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addstock = new javax.swing.JPanel();
        brnid = new javax.swing.JTextField();
        medid = new javax.swing.JTextField();
        amn = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addemp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addemp.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        addemp.setToolTipText("");
        addemp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addemp.setMinimumSize(new java.awt.Dimension(789, 540));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        addemp.addTab("Menu", jLabel2);

        addmanager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        addmanager.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 22, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("SSN:");
        addmanager.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Name:");
        addmanager.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Salary:");
        addmanager.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Branch ID:");
        addmanager.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));
        addmanager.add(manname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 190, -1));
        addmanager.add(manssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 190, -1));
        addmanager.add(mansalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 190, -1));
        addmanager.add(manBid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Phone Number:");
        addmanager.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));
        addmanager.add(manPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 140, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        addmanager.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 70, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        addmanager.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Salary" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        addmanager.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        addmanager.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 70, -1));

        jButton13.setText("LogOut");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        addmanager.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        addmanager.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addemp.addTab("Manager", addmanager);

        appemp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        appemp.add(empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 142, 180, -1));
        appemp.add(empssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 180, -1));

        empsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsalaryActionPerformed(evt);
            }
        });
        appemp.add(empsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 179, -1));
        appemp.add(empBid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 150, -1));
        appemp.add(empPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 140, -1));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        appemp.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 70, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name:");
        appemp.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("SSN:");
        appemp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Salary:");
        appemp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Branch ID:");
        appemp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Phone Number:");
        appemp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        appemp.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 70, -1));

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        appemp.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Manager", "Salary" }));
        appemp.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 380, 90, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Manager ID:");
        appemp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));
        appemp.add(empmanid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 140, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        appemp.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        addemp.addTab("Employee", appemp);

        addstock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        addstock.add(brnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 190, -1));
        addstock.add(medid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, -1));
        addstock.add(amn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 190, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Branch ID:");
        addstock.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Medicine ID:");
        addstock.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Amount:");
        addstock.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jButton12.setText("Add");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        addstock.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        addstock.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        addemp.addTab("Add to Stock", addstock);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SSN", "Name", "Salary", "Manager SSN", "Branch id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 36, 650, 454));

        jButton6.setText("View Employees");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        jTabbedPane1.addTab("Employee", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Manufacture Code", "Manufacture Name"
            }
        ));
        jTable2.setMinimumSize(new java.awt.Dimension(375, 80));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 643, 452));

        jButton7.setText("Show Manufactures");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        jTabbedPane1.addTab("Manufactures", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medicine id", "Price", "Medicine Name", "Manufacturer code"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 40, 640, 450));

        jButton8.setText("Show Medicine");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 12, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Medicine", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Branch id", "Location "
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 39, 634, 450));

        jButton9.setText("Show Branches");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Branches", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Stock Number", "Branch id", "Medicine id", "Amount", "Medicine name"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 42, 634, 449));

        jButton10.setText("Show Stock");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        jTabbedPane1.addTab("Stock", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Phone Number", "Customer name"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 45, 640, 440));

        jButton11.setText("Show Cusomers");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 17, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/MenuBG.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        jTabbedPane1.addTab("Customer", jPanel6);

        addemp.addTab("Contents", jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addemp, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addemp, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        addemp.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!empssn.getText().equals("") || !empname.getText().equals("") || !empBid.getText().equals("") || !empsalary.getText().equals("")||!empmanid.getText().equals("") || !manPN.getText().equals("")) {
        try {
            empobj.insert(Integer.parseInt(empssn.getText()), empname.getText(), Integer.parseInt(empsalary.getText()), Integer.parseInt(empBid.getText()), Integer.parseInt(empmanid.getText()), empPN.getText());
            JOptionPane.showMessageDialog(this, "Employee has been added successfully!");
        } catch (SQLException ex) {
            if (ex instanceof SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage() + "\nPossible foreign key constraint violation.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please insert all fields!");
    }       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try {
    String ssnText = manssn.getText();
    if (ssnText != null && !ssnText.isEmpty()) {
        int ssn = Integer.parseInt(ssnText);
        empobj.deletePN(manssn.getText());
        empobj.delete(ssn);
            JOptionPane.showMessageDialog(this, "Manager has been removed successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "You must insert SSN field");
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid SSN format. Please enter a valid integer.");
    }catch (NullPointerException e){
     JOptionPane.showMessageDialog(this, "Please insert all data to make sure");
    }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  
      // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Object selectedValue =jComboBox1.getSelectedItem();
    if(selectedValue.equals("Salary")){        
        try {
            empobj.updatesalary(Integer.parseInt(manssn.getText()), Integer.parseInt(mansalary.getText()));
            JOptionPane.showMessageDialog(this, "Salary has been updated successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NullPointerException e){
         JOptionPane.showMessageDialog(this, "You must enter SSN field and salary Field");
        }
    }else if (selectedValue.equals("-Select-")){
    JOptionPane.showMessageDialog(this, "Please select the field to update");
    }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (!manssn.getText().equals("") || !manname.getText().equals("") || !manBid.getText().equals("") || !mansalary.getText().equals("") || !manPN.getText().equals("")) {
        try {
            empobj.insert(Integer.parseInt(manssn.getText()), manname.getText(), Integer.parseInt(mansalary.getText()), Integer.parseInt(manBid.getText()), manPN.getText());
            JOptionPane.showMessageDialog(this, "Manager has been added successfully!");
        } catch (SQLException ex) {
            if (ex instanceof SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage() + "\nPossible foreign key constraint violation.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please insert all fields!");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empsalaryActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try {
    String ssnText = empssn.getText();
    if (ssnText != null && !ssnText.isEmpty()) {
        int ssn = Integer.parseInt(ssnText);
        empobj.deletePN(empssn.getText());
        empobj.delete(Integer.parseInt(ssnText));
            JOptionPane.showMessageDialog(this, "Employee has been removed successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "You must insert SSN field");
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid SSN format. Please enter a valid integer.");
    }          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Object selectedValue =jComboBox2.getSelectedItem();       
        if(selectedValue.equals("Salary")){        
        try {
            empobj.updatesalary(Integer.parseInt(empssn.getText()), Integer.parseInt(empsalary.getText()));
            JOptionPane.showMessageDialog(this, "Salary has been updated successfully!");
        }catch (NullPointerException e){
         JOptionPane.showMessageDialog(this, "You must enter SSN field and salary Field");
        }   catch (SQLException ex) {
                Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (selectedValue.equals("Manager")){
        try {
            empobj.updatemanager(Integer.parseInt(empssn.getText()), Integer.parseInt(empmanid.getText()));
            JOptionPane.showMessageDialog(this, "Manager has been updated successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NullPointerException e){
         JOptionPane.showMessageDialog(this, "You must enter SSN field and Manager ID Field");
        }        
        }else {
         JOptionPane.showMessageDialog(this, "Please select the field to update");
        }         
    }//GEN-LAST:event_jButton5ActionPerformed
private void performSearch(String searchText) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        // Get data from the database using the selectall method
        ArrayList<ArrayList<String>> data = empobj.selectall();

        // Filter data based on search text
        for (ArrayList<String> row : data) {
            for (String value : row) {
                if (value.toLowerCase().contains(searchText.toLowerCase())) {
                    model.addRow(row.toArray());
                    break; // Add the row once if any column contains the search text
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading data from the database.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        // Get data from the database using the selectall method
        ArrayList<ArrayList<String>> data = empobj.selectall();

        // Print the retrieved data for debugging
        for (ArrayList<String> row : data) {
            System.out.println("Row: " + row);
        }

        // Populate the data into the table model
        for (ArrayList<String> row : data) {
            model.addRow(row.toArray());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading data from the database.", "Error", JOptionPane.ERROR_MESSAGE);

    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        // Get data from the database using the selectall method
        ArrayList<ArrayList<String>> data = manuobj.selectall();

        // Print the retrieved data for debugging
        for (ArrayList<String> row : data) {
            System.out.println("Row: " + row);
        }

        // Populate the data into the table model
        for (ArrayList<String> row : data) {
            model.addRow(row.toArray());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading data from the database.", "Error", JOptionPane.ERROR_MESSAGE);

    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        // Get data from the database using the selectall method
        ArrayList<ArrayList<String>> data = medobj.selectall();

        // Print the retrieved data for debugging
        for (ArrayList<String> row : data) {
            System.out.println("Row: " + row);
        }

        // Populate the data into the table model
        for (ArrayList<String> row : data) {
            model.addRow(row.toArray());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading data from the database.", "Error", JOptionPane.ERROR_MESSAGE);

    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        // Get data from the database using the selectall method
        ArrayList<ArrayList<String>> data = branobj.selectall();

        // Print the retrieved data for debugging
        for (ArrayList<String> row : data) {
            System.out.println("Row: " + row);
        }

        // Populate the data into the table model
        for (ArrayList<String> row : data) {
            model.addRow(row.toArray());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading data from the database.", "Error", JOptionPane.ERROR_MESSAGE);

    }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        // Get data from the database using the selectall method
        ArrayList<ArrayList<String>> data = stkobj.selectall();

        // Print the retrieved data for debugging
        for (ArrayList<String> row : data) {
            System.out.println("Row: " + row);
        }

        // Populate the data into the table model
        for (ArrayList<String> row : data) {
            model.addRow(row.toArray());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading data from the database.", "Error", JOptionPane.ERROR_MESSAGE);

    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
    model.setRowCount(0); // Clear existing rows

    try {
        // Get data from the database using the selectall method
        ArrayList<ArrayList<String>> data = cstmobj.selectall();

        // Print the retrieved data for debugging
        for (ArrayList<String> row : data) {
            System.out.println("Row: " + row);
        }

        // Populate the data into the table model
        for (ArrayList<String> row : data) {
            model.addRow(row.toArray());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading data from the database.", "Error", JOptionPane.ERROR_MESSAGE);

    }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
        String branchIdText = brnid.getText().trim();
        String medicineIdText = medid.getText().trim();
        String amountText = amn.getText().trim();

        // Check if the fields are not empty
        if (branchIdText.isEmpty() || medicineIdText.isEmpty() || amountText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You must insert all fields");
            return;  // Exit the method if any field is empty
        } else {
            // Parse the fields into integers
            int branchId = Integer.parseInt(branchIdText);
            int medicineId = Integer.parseInt(medicineIdText);
            int amount = Integer.parseInt(amountText);

            // Call your insert method with the parsed values
            stkobj.insert(branchId, medicineId, amount);
            JOptionPane.showMessageDialog(null, "Medicine has been added successfully");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers for Branch ID, Medicine ID, and Amount.");
    } catch (SQLException ex) {
        Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable6MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         this.setVisible(false);
         logp.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTabbedPane addemp;
    private javax.swing.JPanel addmanager;
    private javax.swing.JPanel addstock;
    private javax.swing.JTextField amn;
    private javax.swing.JPanel appemp;
    private javax.swing.JTextField brnid;
    private javax.swing.JTextField empBid;
    private javax.swing.JTextField empPN;
    private javax.swing.JTextField empmanid;
    private javax.swing.JTextField empname;
    private javax.swing.JTextField empsalary;
    private javax.swing.JTextField empssn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField manBid;
    private javax.swing.JTextField manPN;
    private javax.swing.JTextField manname;
    private javax.swing.JTextField mansalary;
    private javax.swing.JTextField manssn;
    private javax.swing.JTextField medid;
    // End of variables declaration//GEN-END:variables
}
