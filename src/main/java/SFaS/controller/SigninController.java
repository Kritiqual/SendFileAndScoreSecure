package SFaS.controller;

import SFaS.gui.*;
import SFaS.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kritiqual
 */
public class SigninController {

    private static final String FINDUSER = "SELECT COUNT(*) FROM Account WHERE Username = ? AND Password = ?";
    private static final String ACCTYPE = "SELECT AccType FROM Account WHERE Username = ? AND Password = ?";

    public static String onSigninEvent(Account acc) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps = conn.prepareStatement(FINDUSER);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) != 1) {
                new SigninUI().setVisible(true);
                return "Không tìm thấy tài khoản!";
            }

            ps = conn.prepareStatement(ACCTYPE);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            rs = ps.executeQuery();
            rs.next();
            switch (rs.getInt(1)) {
                case 0 -> {
                    new TeacherUI().setVisible(true);
                }
                case 1 -> {
                    new AdminUI().setVisible(true);
                }
            }

            return "Đăng nhập thành công";
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
