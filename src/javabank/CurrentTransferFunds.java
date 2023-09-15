package javabank;

public class CurrentTransferFunds extends javax.swing.JFrame {

    private String mail;
    private int AccNo;
    private double Amount;

    public CurrentTransferFunds(String mail) {
        initComponents();
        this.mail = mail;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        accountNumber = new javax.swing.JTextField();
        accHolderName = new javax.swing.JTextField();
        cancelBtn1 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1090, 590));
        setPreferredSize(new java.awt.Dimension(1090, 590));
        setResizable(false);
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

        jPanel4.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Account Number");

        searchBtn.setBackground(new java.awt.Color(0, 153, 153));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("SEARCH");
        searchBtn.setBorder(null);
        searchBtn.setFocusable(false);
        searchBtn.setName("signin-btn"); // NOI18N
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Amount");

        amount.setBackground(new java.awt.Color(242, 242, 242));
        amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Account Holders Name");

        accountNumber.setBackground(new java.awt.Color(242, 242, 242));
        accountNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accountNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        accountNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        accHolderName.setBackground(new java.awt.Color(242, 242, 242));
        accHolderName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accHolderName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        accHolderName.setDisabledTextColor(new java.awt.Color(241, 40, 25));
        accHolderName.setEnabled(false);

        cancelBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelBtn1.setForeground(new java.awt.Color(51, 102, 255));
        cancelBtn1.setText("Cancel");
        cancelBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtn1MouseClicked(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(241, 40, 25));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("TRANSFER");
        submitBtn.setBorder(null);
        submitBtn.setFocusable(false);
        submitBtn.setName("signin-btn"); // NOI18N
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cancelBtn1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountNumber)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amount)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(accHolderName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelBtn1)
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 420, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        AccountsTableValues obj2 = new AccountsTableValues(mail, this);
        obj2.assignAccountTableValues("Current Account");

        if (accountNumber.getText().trim().isEmpty() || amount.getText().trim().isEmpty()) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Please enter Account number and Amount first!");
        } else if (obj2.getDoubleValues("balance") < Double.parseDouble(amount.getText().trim())) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Your Account balance is low!");

        } else if (!obj2.isCorrectAccountType("Current Account", Integer.parseInt(accountNumber.getText().trim()), this)) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Wrong Account Number!");
            accountNumber.setText("");
            amount.setText("");
        } else {
            this.AccNo=Integer.parseInt(accountNumber.getText().trim());
            this.Amount=Double.parseDouble(amount.getText().trim());
            
            AccountsTableValues obj1 = new AccountsTableValues(mail, this);
            String name = obj1.getNameOfAccountNumber(Integer.parseInt(accountNumber.getText().trim()), this);
            
            if (name == "") {
                MessageBox messageBox = new MessageBox();
                messageBox.getMessageBoxWar(this, "Wrong Account Number!");
                accountNumber.setText("");
                amount.setText("");
            } else {
                accHolderName.setText(name);
            }

        }
    }//GEN-LAST:event_searchBtnMouseClicked

    private void cancelBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtn1MouseClicked
        this.dispose();
        TransferFundsMainDashboard obj1 = new TransferFundsMainDashboard(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_cancelBtn1MouseClicked

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        AccountsTableValues obj1 = new AccountsTableValues(mail, this);
        obj1.assignAccountTableValues("Current Account");
        
        Transactions obj2=new Transactions(mail,this);
        
        DateAndTime obj3=new DateAndTime();

        if (accHolderName.getText().trim().isEmpty()) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Please search the Account Number First!");
        } else if (accHolderName.getText().trim().equals("")) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Wrong Account Number!");
        } else if(obj1.updateTransferFunds(Double.parseDouble(amount.getText().trim()), "Current Account", Integer.parseInt(accountNumber.getText().trim()))&& obj2.makeMoneyTransaction(AccNo, Amount, "Current account money transfer", obj3.getDateAndTime())&& obj2.updateRecipientTransaction(AccNo, Amount, "Current account money received",obj3.getDateAndTime(),this )) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxInfo(this, "transaction Succesfull!");
        }else{
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "transaction Failedl!");
        }
    }//GEN-LAST:event_submitBtnMouseClicked

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
            java.util.logging.Logger.getLogger(CurrentTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentTransferFunds("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accHolderName;
    private javax.swing.JTextField accountNumber;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel cancelBtn1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
