package javabank;

public class AtmDashBoard extends javax.swing.JFrame {

    private String mail;

    public AtmDashBoard(String mail) {
        initComponents();
        this.mail = mail;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        billPaymentBtn = new javax.swing.JButton();
        pinChangeBtn = new javax.swing.JButton();
        balanceInquiryBtn = new javax.swing.JButton();
        mobileRechargeBtn = new javax.swing.JButton();
        withDrawalBtn = new javax.swing.JButton();
        tranferFundsBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1090, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javabank/Java logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 40, 25));
        jLabel3.setText("Java Bank ATM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 450, 100));

        billPaymentBtn.setBackground(new java.awt.Color(241, 40, 25));
        billPaymentBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        billPaymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        billPaymentBtn.setText("BILL PAYMENTS");
        billPaymentBtn.setBorder(null);
        billPaymentBtn.setFocusable(false);
        billPaymentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billPaymentBtnMouseClicked(evt);
            }
        });

        pinChangeBtn.setBackground(new java.awt.Color(241, 40, 25));
        pinChangeBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pinChangeBtn.setForeground(new java.awt.Color(255, 255, 255));
        pinChangeBtn.setText("PIN CHANGE");
        pinChangeBtn.setBorder(null);
        pinChangeBtn.setFocusable(false);
        pinChangeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinChangeBtnMouseClicked(evt);
            }
        });

        balanceInquiryBtn.setBackground(new java.awt.Color(241, 40, 25));
        balanceInquiryBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        balanceInquiryBtn.setForeground(new java.awt.Color(255, 255, 255));
        balanceInquiryBtn.setText("BALANCE INQUERY");
        balanceInquiryBtn.setBorder(null);
        balanceInquiryBtn.setFocusable(false);
        balanceInquiryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balanceInquiryBtnMouseClicked(evt);
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

        withDrawalBtn.setBackground(new java.awt.Color(241, 40, 25));
        withDrawalBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        withDrawalBtn.setForeground(new java.awt.Color(255, 255, 255));
        withDrawalBtn.setText("WITHDRAWAL");
        withDrawalBtn.setBorder(null);
        withDrawalBtn.setFocusable(false);
        withDrawalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withDrawalBtnMouseClicked(evt);
            }
        });

        tranferFundsBtn.setBackground(new java.awt.Color(241, 40, 25));
        tranferFundsBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tranferFundsBtn.setForeground(new java.awt.Color(255, 255, 255));
        tranferFundsBtn.setText("TRANSFER FUNDS");
        tranferFundsBtn.setBorder(null);
        tranferFundsBtn.setFocusable(false);
        tranferFundsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tranferFundsBtnMouseClicked(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(0, 153, 51));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("EXIT");
        cancelBtn.setBorder(null);
        cancelBtn.setFocusable(false);
        cancelBtn.setPreferredSize(new java.awt.Dimension(80, 30));
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(pinChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(withDrawalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(billPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tranferFundsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(112, 112, 112)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mobileRechargeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(balanceInquiryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(withDrawalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(billPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceInquiryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileRechargeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tranferFundsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 760, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.dispose();
        AtmLogin obj1 = new AtmLogin();
        obj1.setVisible(true);
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void pinChangeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinChangeBtnMouseClicked
        this.dispose();
        AtmPinChange obj1 = new AtmPinChange(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_pinChangeBtnMouseClicked

    private void billPaymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billPaymentBtnMouseClicked
        this.dispose();
        AtmBillPayments obj1 = new AtmBillPayments(mail);
        obj1.setVisible(true);

    }//GEN-LAST:event_billPaymentBtnMouseClicked

    private void tranferFundsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranferFundsBtnMouseClicked
        this.dispose();
        AtmTransferFunds obj1 = new AtmTransferFunds(mail);
        obj1.setVisible(true);

    }//GEN-LAST:event_tranferFundsBtnMouseClicked

    private void withDrawalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withDrawalBtnMouseClicked
        this.dispose();
        AtmWithdrawl obj1 = new AtmWithdrawl(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_withDrawalBtnMouseClicked

    private void balanceInquiryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceInquiryBtnMouseClicked
        this.dispose();
        AtmBalanceInquiry obj1 = new AtmBalanceInquiry(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_balanceInquiryBtnMouseClicked

    private void mobileRechargeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileRechargeBtnMouseClicked
        this.dispose();
        AtmMobileRecharge obj1 = new AtmMobileRecharge(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_mobileRechargeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AtmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtmDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmDashBoard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balanceInquiryBtn;
    private javax.swing.JButton billPaymentBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton mobileRechargeBtn;
    private javax.swing.JButton pinChangeBtn;
    private javax.swing.JButton tranferFundsBtn;
    private javax.swing.JButton withDrawalBtn;
    // End of variables declaration//GEN-END:variables
}
