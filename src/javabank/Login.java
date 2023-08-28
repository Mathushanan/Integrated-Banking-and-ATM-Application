package javabank;

import javax.swing.*;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        forgotPasswordBtn = new javax.swing.JLabel();
        signinBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        signupBtn = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Login"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1090, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javabank/Login background.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 590));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javabank/Java logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 40, 25));
        jLabel3.setText("Java Bank");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );

        email.setBackground(new java.awt.Color(242, 242, 242));
        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email or username");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        forgotPasswordBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        forgotPasswordBtn.setForeground(new java.awt.Color(51, 102, 255));
        forgotPasswordBtn.setText("Forgot Password?");
        forgotPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordBtnMouseClicked(evt);
            }
        });

        signinBtn.setBackground(new java.awt.Color(241, 40, 25));
        signinBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signinBtn.setForeground(new java.awt.Color(255, 255, 255));
        signinBtn.setText("SIGN IN");
        signinBtn.setBorder(null);
        signinBtn.setFocusable(false);
        signinBtn.setName("signin-btn"); // NOI18N
        signinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinBtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("New to JavaBank? ");

        signupBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(51, 102, 255));
        signupBtn.setText("Register");
        signupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnMouseClicked(evt);
            }
        });

        password.setBackground(new java.awt.Color(242, 242, 242));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 102, 255));
        backBtn.setText("Back");
        backBtn.setName("Back"); // NOI18N
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signinBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(forgotPasswordBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addComponent(password)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signupBtn)))
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPasswordBtn)
                .addGap(40, 40, 40)
                .addComponent(signinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(signupBtn))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 410, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinBtnMouseClicked
        MessageBox messageBox = new MessageBox();

        String mail = email.getText();
        String pass = password.getText();

        if (mail.trim().isEmpty() || pass.trim().isEmpty()) {
            messageBox.getMessageBoxErr(this, "Please fill all the fields!");
        } else {

            DatabaseConnection con = new DatabaseConnection();
            try {
                Connection connection = con.createConnection();
                String selectQuery = "SELECT COUNT(*) FROM users WHERE email=?";

                PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                selectStatement.setString(1, mail);
                ResultSet selectSet = selectStatement.executeQuery();

                if (selectSet.next()) {
                    if (selectSet.getInt(1) > 0) {

                        selectSet.close();

                        String passQuery = "SELECT COUNT(*) FROM users WHERE email=? && password=?";
                        PreparedStatement passStatement = connection.prepareStatement(passQuery);
                        passStatement.setString(1, mail);
                        passStatement.setString(2, pass);

                        ResultSet passSet = passStatement.executeQuery();

                        if (passSet.next()) {
                            if (passSet.getInt(1) > 0) {
                                
                                connection.close();
                                passSet.close();
                                this.dispose();
                                CustomerDashBoard obj1 = new CustomerDashBoard();
                                obj1.setVisible(rootPaneCheckingEnabled);

                            }else{
                                messageBox.getMessageBoxWar(this, "Check your password!");
                            }

                        }
                        passSet.close();

                    } else {
                        messageBox.getMessageBoxWar(this, "You haven't registered yet!");
                    }
                }
                connection.close();
                selectSet.close();

            } catch (Exception ex) {
                messageBox.getMessageBoxErr(this, ex.getMessage() + "!");
            }

        }

    }//GEN-LAST:event_signinBtnMouseClicked

    private void signupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseClicked
        this.dispose();
        Register obj1 = new Register();
        obj1.setVisible(true);
    }//GEN-LAST:event_signupBtnMouseClicked

    private void forgotPasswordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordBtnMouseClicked
        MessageBox messageBox = new MessageBox();
        messageBox.getMessageBoxWar(this, "Please contact your nearest bank!");
    }//GEN-LAST:event_forgotPasswordBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        this.dispose();
        Main obj1 = new Main();
        obj1.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel forgotPasswordBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signinBtn;
    private javax.swing.JLabel signupBtn;
    // End of variables declaration//GEN-END:variables
}
