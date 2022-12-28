package SFaS.gui;

import SFaS.controller.SignupController;
import SFaS.model.Account;
import javax.swing.JOptionPane;

/**
 *
 * @author kritiqual
 */
public class SignupUI extends javax.swing.JFrame {

    /**
     * Creates new form SignUupUI
     */
    public SignupUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG_act = new javax.swing.ButtonGroup();
        labelSignUp = new javax.swing.JLabel();
        labelUsernameSU = new javax.swing.JLabel();
        tfUsernameSU = new javax.swing.JTextField();
        labelPasswordSU = new javax.swing.JLabel();
        labelRePassword = new javax.swing.JLabel();
        pfPasswordSU = new javax.swing.JPasswordField();
        pfRePasswordSU = new javax.swing.JPasswordField();
        btnSignupCF = new javax.swing.JButton();
        btnSignupCC = new javax.swing.JButton();
        btn_act_Teacher = new javax.swing.JRadioButton();
        btn_act_Student = new javax.swing.JRadioButton();
        labelAcctype = new javax.swing.JLabel();
        btn_act_Admin = new javax.swing.JRadioButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSignUp.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        labelSignUp.setText("TẠO TÀI KHOẢN");

        labelUsernameSU.setText("Username");

        labelPasswordSU.setText("Password");

        labelRePassword.setText("Re-type");

        btnSignupCF.setText("SIGN UP");
        btnSignupCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupCFActionPerformed(evt);
            }
        });

        btnSignupCC.setText("CANCEL");
        btnSignupCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupCCActionPerformed(evt);
            }
        });

        btnG_act.add(btn_act_Teacher);
        btn_act_Teacher.setText("Teacher");

        btnG_act.add(btn_act_Student);
        btn_act_Student.setText("Student");

        labelAcctype.setText("Account type");

        btnG_act.add(btn_act_Admin);
        btn_act_Admin.setSelected(true);
        btn_act_Admin.setText("Admin");

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(labelSignUp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelUsernameSU)
                        .addGap(44, 44, 44)
                        .addComponent(tfUsernameSU))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPasswordSU)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfRePasswordSU, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pfPasswordSU)))
                    .addComponent(labelRePassword)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAcctype)
                        .addGap(29, 29, 29)
                        .addComponent(btn_act_Admin)
                        .addGap(18, 18, 18)
                        .addComponent(btn_act_Student)
                        .addGap(18, 18, 18)
                        .addComponent(btn_act_Teacher))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSignupCF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignupCC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsernameSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsernameSU))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_act_Student)
                    .addComponent(labelAcctype)
                    .addComponent(btn_act_Teacher)
                    .addComponent(btn_act_Admin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasswordSU)
                    .addComponent(pfPasswordSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRePassword)
                    .addComponent(pfRePasswordSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSignupCF)
                        .addComponent(btnSignupCC)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupCFActionPerformed
        try {
            String username = tfUsernameSU.getText().trim();
            var password = String.valueOf(pfPasswordSU.getPassword()).trim();
            var repassword = String.valueOf(pfRePasswordSU.getPassword()).trim();
            int acctype = 1;
            if (btn_act_Student.isSelected()) {
                acctype = 0;
            } else if (btn_act_Teacher.isSelected()) {
                acctype = 2;
            }

            if ("".equals(username) || "".equals(password) || "".equals(repassword)) {
                throw new Exception("Không được để trống thông tin!");
            }

            if (!repassword.equals(password)) {
                throw new Exception("Mật khẩu không trùng khớp!");
            }

            JOptionPane.showMessageDialog(this.getContentPane(), SignupController.onSignupEvent(new Account(username, password, acctype)), "Thông báo!", JOptionPane.OK_OPTION);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.getContentPane(), e.getMessage(), "Thông Báo", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnSignupCFActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        tfUsernameSU.setText("");
        pfPasswordSU.setText("");
        pfRePasswordSU.setText("");
        btn_act_Admin.setSelected(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSignupCCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSignupCCActionPerformed
        new SigninUI().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnSignupCCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignupUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnG_act;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSignupCC;
    private javax.swing.JButton btnSignupCF;
    private javax.swing.JRadioButton btn_act_Admin;
    private javax.swing.JRadioButton btn_act_Student;
    private javax.swing.JRadioButton btn_act_Teacher;
    private javax.swing.JLabel labelAcctype;
    private javax.swing.JLabel labelPasswordSU;
    private javax.swing.JLabel labelRePassword;
    private javax.swing.JLabel labelSignUp;
    private javax.swing.JLabel labelUsernameSU;
    private javax.swing.JPasswordField pfPasswordSU;
    private javax.swing.JPasswordField pfRePasswordSU;
    private javax.swing.JTextField tfUsernameSU;
    // End of variables declaration//GEN-END:variables
}
