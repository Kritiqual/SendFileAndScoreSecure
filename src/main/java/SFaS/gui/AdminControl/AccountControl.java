/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SFaS.gui.AdminControl;

import SFaS.controller.ConnectDB;
import SFaS.controller.AccountController;
import SFaS.gui.*;
import SFaS.model.Account;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author kritiqual
 */
public class AccountControl extends javax.swing.JFrame {

    /**
     * Creates new form AccountControl
     */
    public AccountControl() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAccountControl = new javax.swing.JLabel();
        btnEditAccount = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        labelUsernameAC = new javax.swing.JLabel();
        labelPasswordAC = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        labelAdminCb = new javax.swing.JLabel();
        cbAdmin = new javax.swing.JCheckBox();
        spAccountList = new javax.swing.JScrollPane();
        tableAccountList = new javax.swing.JTable();
        btnAddAccount = new javax.swing.JButton();
        btnResetInfo = new javax.swing.JButton();
        tfPassword = new javax.swing.JTextField();
        labelID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelAccountControl.setText("QU???N L?? T??I KHO???N");

        btnEditAccount.setText("EDIT");
        btnEditAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAccountActionPerformed(evt);
            }
        });

        btnDeleteAccount.setText("DELETE");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelUsernameAC.setText("Username");

        labelPasswordAC.setText("Password");

        labelAdminCb.setText("Is Admin?");

        cbAdmin.setMaximumSize(new java.awt.Dimension(23, 25));
        cbAdmin.setMinimumSize(new java.awt.Dimension(23, 25));
        cbAdmin.setPreferredSize(new java.awt.Dimension(23, 25));

        tableAccountList.setModel(buildTableModel());
        tableAccountList.getTableHeader().setReorderingAllowed(false);
        tableAccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAccountListMouseClicked(evt);
            }
        });
        spAccountList.setViewportView(tableAccountList);

        btnAddAccount.setText("ADD");
        btnAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountActionPerformed(evt);
            }
        });

        btnResetInfo.setText("RESET");
        btnResetInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetInfoActionPerformed(evt);
            }
        });

        labelID.setText("ID");

        tfID.setEditable(false);
        tfID.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(labelAccountControl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelUsernameAC)
                                            .addComponent(labelPasswordAC))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelAdminCb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfPassword)
                                    .addComponent(tfID)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEditAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnResetInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(spAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAccountControl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelUsernameAC)
                                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAdminCb))
                            .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPasswordAC)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddAccount)
                            .addComponent(btnDeleteAccount))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditAccount)
                            .addComponent(btnResetInfo)))
                    .addComponent(spAccountList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static DefaultTableModel buildTableModel() {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Account");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();

            // names of columns
            Vector<String> columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnName(column));
            }

            // data of the table
            Vector<Vector<Object>> tbdata = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> data = new Vector<Object>();
                data.add(rs.getInt(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getBoolean(4));
                tbdata.add(data);
            }

            boolean[] isEditable = {false, false, false, false};
            return new DefaultTableModel(tbdata, columnNames) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // make read only fields except column 0,13,14
                    return isEditable[column];
                }
            };
        } catch (SQLException e) {
            return null;
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AdminUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAccountActionPerformed
        try {
            String username = tfUsername.getText().trim();
            String password = tfPassword.getText().trim();
            int isadmin = 0;
            if (cbAdmin.isSelected()) {
                isadmin = 1;
            }
            var accid = Integer.valueOf(tableAccountList.getModel().getValueAt(tableAccountList.getSelectedRow(), 0).toString());
            JOptionPane.showMessageDialog(this.getContentPane(), AccountController.onEditEvent(new Account(username, password, isadmin, accid)), "Th??ng b??o!", JOptionPane.INFORMATION_MESSAGE);
            tableAccountList.revalidate();
            this.dispose();
            new AccountControl().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this.getContentPane(), e.getMessage(), "Th??ng B??o", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnEditAccountActionPerformed

    private void btnAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountActionPerformed
        try {
            String username = tfUsername.getText().trim();
            String password = tfPassword.getText().trim();
            int isadmin = 0;
            if (cbAdmin.isSelected()) {
                isadmin = 1;
            }

            if ("".equals(username) || "".equals(password)) {
                throw new Exception("Kh??ng ???????c ????? tr???ng th??ng tin!");
            }

            JOptionPane.showMessageDialog(this.getContentPane(), AccountController.onAddEvent(new Account(username, password, isadmin)), "Th??ng b??o!", JOptionPane.INFORMATION_MESSAGE);
            tableAccountList.revalidate();
            this.dispose();
            new AccountControl().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.getContentPane(), e.getMessage(), "Th??ng B??o", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnAddAccountActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        try {
            String username = tableAccountList.getModel().getValueAt(tableAccountList.getSelectedRow(), 1).toString();
            JOptionPane.showMessageDialog(this.getContentPane(), AccountController.onDeleteEvent(username), "Th??ng B??o", JOptionPane.INFORMATION_MESSAGE);
            tableAccountList.revalidate();
            this.dispose();
            new AccountControl().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this.getContentPane(), e.getMessage(), "Th??ng B??o", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnResetInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetInfoActionPerformed
        onClear();
    }//GEN-LAST:event_btnResetInfoActionPerformed

    private void tableAccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAccountListMouseClicked
        int selected = tableAccountList.getSelectedRow();
        TableModel model = tableAccountList.getModel();
        tfID.setText(model.getValueAt(selected, 0).toString());
        tfUsername.setText(model.getValueAt(selected, 1).toString());
        tfPassword.setText(model.getValueAt(selected, 2).toString());
        boolean checked = false;
        if ((boolean) model.getValueAt(selected, 3)) {
            checked = true;
        }
        cbAdmin.setSelected(checked);
    }//GEN-LAST:event_tableAccountListMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new AccountControl().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void onClear() {
        tfID.setText("");
        tfUsername.setText("");
        tfPassword.setText("");
        cbAdmin.setSelected(false);
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountControl.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AccountControl().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccount;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnEditAccount;
    private javax.swing.JButton btnResetInfo;
    private javax.swing.JCheckBox cbAdmin;
    private javax.swing.JLabel labelAccountControl;
    private javax.swing.JLabel labelAdminCb;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelPasswordAC;
    private javax.swing.JLabel labelUsernameAC;
    private javax.swing.JScrollPane spAccountList;
    private javax.swing.JTable tableAccountList;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
