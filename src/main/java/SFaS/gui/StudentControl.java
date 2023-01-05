/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SFaS.gui;

import SFaS.controller.ConnectDB;
import SFaS.controller.StudentController;
import SFaS.model.Student;
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
public class StudentControl extends javax.swing.JFrame {

    /**
     * Creates new form StudentControl
     */
    public StudentControl() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelStuControl = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        tfFCT = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        labelFaculty = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelHometown = new javax.swing.JLabel();
        labelDoB = new javax.swing.JLabel();
        labelClass = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfDoB = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        tfHome = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfClass = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        spTableStudent = new javax.swing.JScrollPane();
        tableStudentList = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        labelGPA = new javax.swing.JLabel();
        tfGPA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelStuControl.setText("QUẢN LÝ SINH VIÊN");

        labelID.setText("ID");

        labelName.setText("Name");

        labelFaculty.setText("Faculty");

        labelPhone.setText("Phone");

        labelHometown.setText("Hometown");

        labelDoB.setText("DOB");

        labelClass.setText("Class");

        tfID.setEditable(false);
        tfID.setFocusable(false);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tableStudentList.setModel(buildTableModel());
        tableStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentListMouseClicked(evt);
            }
        });
        spTableStudent.setViewportView(tableStudentList);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelGPA.setText("GPA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(labelStuControl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelClass)
                                .addGap(18, 18, 18)
                                .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelFaculty)
                                .addGap(18, 18, 18)
                                .addComponent(tfFCT))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelDoB)
                                .addGap(18, 18, 18)
                                .addComponent(tfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labelID)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelName)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labelHometown)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfHome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelGPA)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(spTableStudent))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelStuControl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelID)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDoB)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelPhone)
                                .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHometown)
                            .addComponent(tfHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGPA)
                            .addComponent(tfGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelClass)
                            .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFaculty)
                            .addComponent(tfFCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnReset)))
                    .addComponent(spTableStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onClear() {
        tfID.setText("");
        tfID.setText("");
        tfName.setText("");
        tfDoB.setText("");
        tfTel.setText("");
        tfHome.setText("");
        tfClass.setText("");
        tfFCT.setText("");
    }

    public static DefaultTableModel buildTableModel() {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Student");
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
                data.add(rs.getString(4));
                data.add(rs.getString(5));
                data.add(rs.getString(6));
                data.add(rs.getString(7));
                data.add(rs.getFloat(8));
                tbdata.add(data);
            }

            boolean[] isEditable = {false, false, false, false, false, false, false};
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String name = tfName.getText().trim();
            String dob = tfDoB.getText().trim();
            String tel = tfTel.getText().trim();
            String home = tfHome.getText().trim();
            String stuclass = tfClass.getText().trim();
            String fct = tfFCT.getText().trim();
            String gpa_str = tfGPA.getText().trim();
            Float gpa = Float.valueOf(gpa_str);

            if ("".equals(name) || "".equals(dob) || "".equals(tel) || "".equals(home) || "".equals(stuclass) || "".equals(fct) || "".equals(gpa_str)) {
                throw new Exception("Không được để trống thông tin!");
            }

            JOptionPane.showMessageDialog(this.getContentPane(), StudentController.onAddEvent(new Student(tel, name, fct, dob, home, stuclass, gpa)), "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            tableStudentList.revalidate();
            this.dispose();
            new StudentControl().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.getContentPane(), e.getMessage(), "Thông Báo", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String name = tableStudentList.getModel().getValueAt(tableStudentList.getSelectedRow(), 1).toString();
            JOptionPane.showMessageDialog(this.getContentPane(), StudentController.onDeleteEvent(name), "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            tableStudentList.revalidate();
            this.dispose();
            new StudentControl().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this.getContentPane(), e.getMessage(), "Thông Báo", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String name = tfName.getText().trim();
            String dob = tfDoB.getText().trim();
            String tel = tfTel.getText().trim();
            String home = tfHome.getText().trim();
            String stuclass = tfClass.getText().trim();
            String fct = tfFCT.getText().trim();
            String gpa_str = tfGPA.getText().trim();
            Float gpa = Float.valueOf(gpa_str);

            if ("".equals(name) || "".equals(dob) || "".equals(tel) || "".equals(home) || "".equals(stuclass) || "".equals(fct) || "".equals(gpa_str)) {
                throw new Exception("Không được để trống thông tin!");
            }
            var stuid = Integer.valueOf(tableStudentList.getModel().getValueAt(tableStudentList.getSelectedRow(), 0).toString());
            JOptionPane.showMessageDialog(this.getContentPane(), StudentController.onEditEvent(new Student(stuid, tel, name, fct, dob, home, stuclass, gpa)), "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            tableStudentList.revalidate();
            this.dispose();
            new StudentControl().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.getContentPane(), e.getMessage(), "Thông Báo", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        onClear();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AdminUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tableStudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentListMouseClicked
        int selected = tableStudentList.getSelectedRow();
        TableModel model = tableStudentList.getModel();
        tfID.setText(model.getValueAt(selected, 0).toString());
        tfName.setText(model.getValueAt(selected, 1).toString());
        tfTel.setText(model.getValueAt(selected, 2).toString());
        tfDoB.setText(model.getValueAt(selected, 3).toString());
        tfHome.setText(model.getValueAt(selected, 4).toString());
        tfClass.setText(model.getValueAt(selected, 5).toString());
        tfFCT.setText(model.getValueAt(selected, 6).toString());
        tfGPA.setText(model.getValueAt(selected, 7).toString());
    }//GEN-LAST:event_tableStudentListMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new SigninUI().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(StudentControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentControl().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel labelClass;
    private javax.swing.JLabel labelDoB;
    private javax.swing.JLabel labelFaculty;
    private javax.swing.JLabel labelGPA;
    private javax.swing.JLabel labelHometown;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelStuControl;
    private javax.swing.JScrollPane spTableStudent;
    private javax.swing.JTable tableStudentList;
    private javax.swing.JTextField tfClass;
    private javax.swing.JTextField tfDoB;
    private javax.swing.JTextField tfFCT;
    private javax.swing.JTextField tfGPA;
    private javax.swing.JTextField tfHome;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}
