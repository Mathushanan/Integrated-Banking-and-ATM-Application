package javabank;

public class CreateAccount extends javax.swing.JFrame {

    private String mail;

    public CreateAccount(String mail) {
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
        label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        rePassword = new javax.swing.JTextField();
        accountTypeComboBox = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label.setText("Account Type");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("NIC Number");

        submitBtn.setBackground(new java.awt.Color(241, 40, 25));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("SUBMIT");
        submitBtn.setBorder(null);
        submitBtn.setFocusable(false);
        submitBtn.setName("signin-btn"); // NOI18N
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Password");

        password.setBackground(new java.awt.Color(242, 242, 242));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Re-enter password");

        nic.setBackground(new java.awt.Color(242, 242, 242));
        nic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        rePassword.setBackground(new java.awt.Color(242, 242, 242));
        rePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        accountTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Current Account", "Fixed Account" }));

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(51, 102, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Amount");

        amount.setBackground(new java.awt.Color(242, 242, 242));
        amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("You should deposit minimum 2000LKR to open a new account");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cancelBtn)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nic)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password)
                    .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rePassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 420, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        String type = accountTypeComboBox.getSelectedItem().toString();
        String pass = password.getText();
        String rePass = rePassword.getText();
        String Nic = nic.getText();
        String Amount = amount.getText();

        AccountsTableValues obj2 = new AccountsTableValues(mail,this);
        obj2.assignAccountTableValues(type);
        boolean isAvailable = obj2.isAccountAvailable();

        UserTableValues obj1 = new UserTableValues(mail, this);
        String realPassword = obj1.getStringValue("password");
        String realNic = obj1.getStringValue("nic");
        int userId = obj1.getIntValue("userId");

        if (type.trim().isEmpty() || pass.trim().isEmpty() || rePass.trim().isEmpty() || Nic.trim().isEmpty() || Amount.trim().isEmpty()) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Please fill all the fields!");
        } else if (!pass.equals(rePass)) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Password mismatch!");
        } else if (!realNic.equals(Nic)) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Wrong NIC number!");
        } else if (!realPassword.equals(pass)) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Wrong password!");
        } else if (isAvailable) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "You already have " + type + "!");
        } else if (Double.parseDouble(Amount) < 2000) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "You should deposit minimum 2000LKR to open a new account!");
        } else {
            if (type == "Savings Account") {
                if (obj2.insertValues(userId, mail, 200100 + userId, Double.parseDouble(Amount), type)) {
                    this.dispose();
                    CustomerDashBoard obj3 = new CustomerDashBoard(mail);
                    obj3.setVisible(true);
                    MessageBox messageBox = new MessageBox();
                    messageBox.getMessageBoxInfo(obj3, "You have sucessfully opened a " + type + "!");
                } else {
                    MessageBox messageBox = new MessageBox();
                    messageBox.getMessageBoxWar(this, "Something went wrong!");
                }

            } else if (type == "Current Account") {
                if (obj2.insertValues(userId, mail, 300200 + userId, Double.parseDouble(Amount), type)) {
                    this.dispose();
                    CustomerDashBoard obj3 = new CustomerDashBoard(mail);
                    obj3.setVisible(true);
                    MessageBox messageBox = new MessageBox();
                    messageBox.getMessageBoxInfo(obj3, "You have sucessfully opened a " + type + "!");
                } else {
                    MessageBox messageBox = new MessageBox();
                    messageBox.getMessageBoxWar(this, "Something went wrong!");
                }

            } else {
                if (obj2.insertValues(userId, mail, 40000 + userId, Double.parseDouble(Amount), type)) {
                    this.dispose();
                    CustomerDashBoard obj3 = new CustomerDashBoard(mail);
                    obj3.setVisible(true);
                    MessageBox messageBox = new MessageBox();
                    messageBox.getMessageBoxInfo(obj3, "You have sucessfully opened a " + type + "!");
                } else {
                    MessageBox messageBox = new MessageBox();
                    messageBox.getMessageBoxWar(this, "Something went wrong!");
                }
            }

        }

    }//GEN-LAST:event_submitBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.dispose();
        CustomerDashBoard obj1 = new CustomerDashBoard(mail);
        obj1.setVisible(true);

    }//GEN-LAST:event_cancelBtnMouseClicked

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
    private javax.swing.JComboBox<String> accountTypeComboBox;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField password;
    private javax.swing.JTextField rePassword;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
