package javabank;

public class AtmPinChange extends javax.swing.JFrame {

    private String mail;

    public AtmPinChange(String mail) {
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
        submitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nPin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cPin = new javax.swing.JTextField();
        rePin = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JLabel();

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Current PIN");

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
        jLabel6.setText("New PIN");

        nPin.setBackground(new java.awt.Color(242, 242, 242));
        nPin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nPin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Re-enter PIN");

        cPin.setBackground(new java.awt.Color(242, 242, 242));
        cPin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cPin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        rePin.setBackground(new java.awt.Color(242, 242, 242));
        rePin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rePin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(51, 102, 255));
        cancelBtn.setText("Back");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelBtn)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cPin, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nPin, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rePin, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nPin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rePin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 400, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        String currentPin = cPin.getText().trim();
        String newPin = nPin.getText().trim();
        String confirmPin = rePin.getText().trim();
        
        AtmOperations obj1=new AtmOperations(mail,this);

        if (currentPin.isEmpty() || newPin.isEmpty() || confirmPin.isEmpty()) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Please fill all the fields!");
        } else if (!newPin.equals(confirmPin)) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "PIN mismatch!");
        } else if (currentPin.equals(newPin)) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Your new PIN must be different from your current PIN!");
        } else if (newPin.length() > 4 || newPin.length() < 4 || confirmPin.length() < 4 || confirmPin.length() > 4) {
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Your new PIN must be in 4 digits!");

        } else if(obj1.getAtmPin()!=Integer.parseInt(currentPin)){
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Wrong current PIN number!");
        }else if(obj1.isAtmPinExit(Integer.parseInt(newPin))){
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Try with diferent PIN number!");
        }else if(obj1.updateAtmPin(Integer.parseInt(newPin))){
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxInfo(this, "Your new PIN updated!");
            this.dispose();
            AtmDashBoard obj2=new AtmDashBoard(mail);
            obj2.setVisible(true);
        }else{
            MessageBox messageBox = new MessageBox();
            messageBox.getMessageBoxWar(this, "Failed to update your new PIN!");
        }
    }//GEN-LAST:event_submitBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.dispose();
        AtmDashBoard obj1 = new AtmDashBoard(mail);
        obj1.setVisible(true);
    }//GEN-LAST:event_cancelBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AtmPinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtmPinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtmPinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtmPinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmPinChange("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cPin;
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nPin;
    private javax.swing.JTextField rePin;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
