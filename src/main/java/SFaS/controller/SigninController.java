package SFaS.controller;

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

    private static final String FINDUSER = "SELECT COUNT(*) FROM Account WHERE Username=? AND Password=?";


    public static String onLoginEvent(Account acc) {
        try {
            Connection conn = ConnectDB.getConnection();

            PreparedStatement ps = conn.prepareStatement(FINDUSER);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ResultSet rs = ps.executeQuery();
            rs.next();
            int ans_fu = rs.getInt(1);
            if (ans_fu != 1) {
                return "Không tìm thấy tài khoản!";
            }

            return "Đăng nhập thành công";
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
