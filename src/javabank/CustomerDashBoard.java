package javabank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class CustomerDashBoard extends javax.swing.JFrame {

    private String mail;
    private String fName;
    private String lName;
    private String mobile;
    private String nic;
    private String userName;
    private int count;

    public CustomerDashBoard(String mail) {
        initComponents();
        this.mail = mail;
        this.count = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        transactionHistory = new javax.swing.JButton();
        balanceInquery = new javax.swing.JButton();
        mobileRechargeBtn = new javax.swing.JButton();
        billPaymentsBtn = new javax.swing.JButton();
        transferFundsBtn = new javax.swing.JButton();
        changePasswordBtn = new javax.swing.JButton();
        myProfileBtn = new javax.swing.JButton();
        createAccountBtn = new javax.swing.JButton();
        activatePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        activateBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        totalAccountsLabel = new javax.swing.JLabel();
        nicLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1090, 590));
        setPreferredSize(new java.awt.Dimension(1090, 590));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javabank/Java logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 40, 25));
        jLabel3.setText("Java Bank");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 380, 100));

        transactionHistory.setBackground(new java.awt.Color(241, 40, 25));
        transactionHistory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        transactionHistory.setForeground(new java.awt.Color(255, 255, 255));
        transactionHistory.setText("TRANSACTION HISTORY");
        transactionHistory.setBorder(null);
        transactionHistory.setFocusable(false);
        transactionHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionHistoryMouseClicked(evt);
            }
        });

        balanceInquery.setBackground(new java.awt.Color(241, 40, 25));
        balanceInquery.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        balanceInquery.setForeground(new java.awt.Color(255, 255, 255));
        balanceInquery.setText("BALANCE INQUERY");
        balanceInquery.setBorder(null);
        balanceInquery.setFocusable(false);
        balanceInquery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balanceInqueryMouseClicked(evt);
            }
        });

        mobileRechargeBtn.setBackground(new java.awt.Color(241, 40, 25));
        mobileRechargeBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobileRechargeBtn.setForeground(new java.awt.Color(255, 255, 255));
        mobileRechargeBtn.setText("MOBILE RECHARGE");
        mobileRechargeBtn.setBorder(null);
        mobileRechargeBtn.setFocusable(false);
        mobileRechargeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileRechargeBtnMouseClicked(evt);
            }
        });

        billPaymentsBtn.setBackground(new java.awt.Color(241, 40, 25));
        billPaymentsBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        billPaymentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        billPaymentsBtn.setText("BILL PAYMENTS");
        billPaymentsBtn.setBorder(null);
        billPaymentsBtn.setFocusable(false);
        billPaymentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billPaymentsBtnMouseClicked(evt);
            }
        });

        transferFundsBtn.setBackground(new java.awt.Color(241, 40, 25));
        transferFundsBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        transferFundsBtn.setForeground(new java.awt.Color(255, 255, 255));
        transferFundsBtn.setText("TRANSFER FUNDS");
        transferFundsBtn.setBorder(null);
        transferFundsBtn.setFocusable(false);
        transferFundsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferFundsBtnMouseClicked(evt);
            }
        });

        changePasswordBtn.setBackground(new java.awt.Color(241, 40, 25));
        changePasswordBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changePasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordBtn.setText("CHANGE PASSWORD");
        changePasswordBtn.setBorder(null);
        changePasswordBtn.setFocusable(false);
        changePasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordBtnMouseClicked(evt);
            }
        });

        myProfileBtn.setBackground(new java.awt.Color(241, 40, 25));
        myProfileBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        myProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        myProfileBtn.setText("MY PROFILE");
        myProfileBtn.setBorder(null);
        myProfileBtn.setFocusable(false);
        myProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myProfileBtnMouseClicked(evt);
            }
        });

        createAccountBtn.setBackground(new java.awt.Color(241, 40, 25));
        createAccountBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        createAccountBtn.setText("CREATE ACCOUNTS");
        createAccountBtn.setBorder(null);
        createAccountBtn.setFocusable(false);
        createAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferFundsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobileRechargeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceInquery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billPaymentsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myProfileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferFundsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billPaymentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceInquery, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileRechargeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 760, 340));

        activatePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Activate Your ATM Card!");

        activateBtn.setBackground(new java.awt.Color(0, 153, 51));
        activateBtn.setForeground(new java.awt.Color(255, 255, 255));
        activateBtn.setText("ACTIVATE");
        activateBtn.setBorder(null);
        activateBtn.setFocusable(false);
        activateBtn.setPreferredSize(new java.awt.Dimension(80, 30));
        activateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activateBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout activatePanelLayout = new javax.swing.GroupLayout(activatePanel);
        activatePanel.setLayout(activatePanelLayout);
        activatePanelLayout.setHorizontalGroup(
            activatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(activatePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        activatePanelLayout.setVerticalGroup(
            activatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activatePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(activateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(activatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 280, 140));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Total acoounts");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("NIC");

        logoutBtn.setBackground(new java.awt.Color(0, 153, 51));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOG OUT");
        logoutBtn.setBorder(null);
        logoutBtn.setFocusable(false);
        logoutBtn.setPreferredSize(new java.awt.Dimension(80, 30));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalAccountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(10, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalAccountsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nicLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changePasswordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordBtnMouseClicked
        this.dispose();
        ChangePassword obj1 = new ChangePassword(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_changePasswordBtnMouseClicked

    private void transactionHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionHistoryMouseClicked
        this.dispose();
        TransactionHistory obj1 = new TransactionHistory(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_transactionHistoryMouseClicked

    private void transferFundsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferFundsBtnMouseClicked
        this.dispose();
        TransferFundsMainDashboard obj1 = new TransferFundsMainDashboard(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_transferFundsBtnMouseClicked

    private void billPaymentsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentsBtnMouseClicked
        this.dispose();
        BillPayments obj1 = new BillPayments(mail);
        obj1.setVisible(true);

    }//GEN-LAST:event_billPaymentsBtnMouseClicked

    private void balanceInqueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceInqueryMouseClicked
        this.dispose();
        BalanceInquery obj1 = new BalanceInquery(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_balanceInqueryMouseClicked

    private void mobileRechargeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeBtnMouseClicked
        this.dispose();
        MobileRecharge obj1 = new MobileRecharge(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_mobileRechargeBtnMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AtmOperations obj2 = new AtmOperations(mail, this);
        if (obj2.isAlreadyActivated()) {
            activatePanel.setVisible(false);
        }
        try {
            DatabaseConnection con = new DatabaseConnection();
            Connection connection = con.createConnection();
            String selectQuery = "SELECT * FROM users WHERE email=?";
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setString(1, mail);

            ResultSet set = statement.executeQuery();

            if (set.next()) {
                this.mobile = set.getString("mobile");
                this.fName = set.getString("firstName");
                this.lName = set.getString("lastName");
                this.userName = set.getString("userName");
                this.nic = set.getString("nic");
            }
            connection.close();
            set.close();

        } catch (Exception ex) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxErr(this, ex.toString());
        }

        AccountsTableValues obj1 = new AccountsTableValues(mail, this);
        int totalCountOfAccounts = obj1.getTotalCountOfAccounts();

        nameLabel.setText(fName);
        nicLabel.setText(nic);
        totalAccountsLabel.setText(Integer.toString(totalCountOfAccounts));
    }//GEN-LAST:event_formWindowOpened

    private void myProfileBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileBtnMouseClicked
        this.dispose();
        MyProfile obj1 = new MyProfile(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_myProfileBtnMouseClicked

    private void createAccountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountBtnMouseClicked
        this.dispose();
        CreateAccount obj1 = new CreateAccount(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_createAccountBtnMouseClicked

    private void activateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activateBtnMouseClicked
        AtmOperations obj1 = new AtmOperations(mail, this);
        AccountsTableValues obj2 = new AccountsTableValues(mail, this);

        if (!obj2.isAccountAvailableHere("Savings Account")) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxInfo(this, "You don't have a Savings Account!");
        } else {
            if (obj1.activateAtm()) {
                MessageBox messageBox = new MessageBox();
                messageBox.getMessageBoxInfo(this, "Your ATM card successfully activated! \n Your PIN number is " + obj1.getAtmPin());
                activatePanel.setVisible(false);
            }

        }

    }//GEN-LAST:event_activateBtnMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        this.dispose();
        Login obj1 = new Login();
        obj1.setVisible(true);

    }//GEN-LAST:event_logoutBtnMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashBoard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activateBtn;
    private javax.swing.JPanel activatePanel;
    private javax.swing.JButton balanceInquery;
    private javax.swing.JButton billPaymentsBtn;
    private javax.swing.JButton changePasswordBtn;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton mobileRechargeBtn;
    private javax.swing.JButton myProfileBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nicLabel;
    private javax.swing.JLabel totalAccountsLabel;
    private javax.swing.JButton transactionHistory;
    private javax.swing.JButton transferFundsBtn;
    // End of variables declaration//GEN-END:variables
}
