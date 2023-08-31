
package javabank;


public class CreateAccount extends javax.swing.JFrame {

    private String mail;
    public CreateAccount(String mail) {
        initComponents();
        this.mail=mail;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createCurrentAccountBtn = new javax.swing.JButton();
        createFixedAccountBtn = new javax.swing.JButton();
        createSalaryAccountBtn = new javax.swing.JButton();
        createSavingsAccountBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1090, 590));
        setPreferredSize(new java.awt.Dimension(1090, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createCurrentAccountBtn.setBackground(new java.awt.Color(241, 40, 25));
        createCurrentAccountBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createCurrentAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        createCurrentAccountBtn.setText("CURRENT ACCOUNT");
        createCurrentAccountBtn.setBorder(null);
        createCurrentAccountBtn.setFocusable(false);
        createCurrentAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCurrentAccountBtnMouseClicked(evt);
            }
        });

        createFixedAccountBtn.setBackground(new java.awt.Color(241, 40, 25));
        createFixedAccountBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createFixedAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        createFixedAccountBtn.setText("FIXED DEPOSIT ACCOUNT");
        createFixedAccountBtn.setBorder(null);
        createFixedAccountBtn.setFocusable(false);
        createFixedAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createFixedAccountBtnMouseClicked(evt);
            }
        });

        createSalaryAccountBtn.setBackground(new java.awt.Color(241, 40, 25));
        createSalaryAccountBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createSalaryAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        createSalaryAccountBtn.setText("SALARY ACCOUNT");
        createSalaryAccountBtn.setBorder(null);
        createSalaryAccountBtn.setFocusable(false);
        createSalaryAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createSalaryAccountBtnMouseClicked(evt);
            }
        });

        createSavingsAccountBtn.setBackground(new java.awt.Color(241, 40, 25));
        createSavingsAccountBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createSavingsAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        createSavingsAccountBtn.setText("SAVINGS ACCOUNT");
        createSavingsAccountBtn.setBorder(null);
        createSavingsAccountBtn.setFocusable(false);
        createSavingsAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createSavingsAccountBtnMouseClicked(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 102, 255));
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createFixedAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createSavingsAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createSalaryAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createCurrentAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCurrentAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createSavingsAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createFixedAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createSalaryAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 760, 230));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
       this.dispose();
       CustomerDashBoard obj1=new CustomerDashBoard(mail);
       obj1.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    private void createCurrentAccountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCurrentAccountBtnMouseClicked
        this.dispose();
        CurrentTransferFunds obj1=new CurrentTransferFunds(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_createCurrentAccountBtnMouseClicked

    private void createFixedAccountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createFixedAccountBtnMouseClicked
        this.dispose();
        SavingsTransferFunds obj1=new SavingsTransferFunds(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_createFixedAccountBtnMouseClicked

    private void createSalaryAccountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createSalaryAccountBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_createSalaryAccountBtnMouseClicked

    private void createSavingsAccountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createSavingsAccountBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_createSavingsAccountBtnMouseClicked

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JButton createCurrentAccountBtn;
    private javax.swing.JButton createFixedAccountBtn;
    private javax.swing.JButton createSalaryAccountBtn;
    private javax.swing.JButton createSavingsAccountBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
