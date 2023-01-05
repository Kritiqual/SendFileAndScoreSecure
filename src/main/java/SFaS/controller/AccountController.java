/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.controller;

import SFaS.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class AccountController {

    private static final String FINDUSER = "SELECT COUNT(*) FROM Account WHERE Username = ?";
    private static final String ADDACC = "INSERT INTO Account VALUES (?, ?, ?)";
    private static final String DELACC = "DELETE FROM Account WHERE Username = ?";
    private static final String EDITACC = "UPDATE Account SET Username = ?, Password = ?, IsAdmin = ? WHERE AccID = ?";

    public static String onAddEvent(Account acc) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps = conn.prepareStatement(FINDUSER);
            ps.setString(1, acc.getUsername());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                return "Tài khoản đã tồn tại!";
            }

            ps = conn.prepareStatement(ADDACC);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setInt(3, acc.getIsAdmin());
            ps.executeUpdate();

            return "Đăng ký thành công";
        } catch (SQLException e) {
            return e.toString();
        }

    }

    public static String onDeleteEvent(String username) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(DELACC);
            ps.setString(1, username);

            if (ps.executeUpdate() > 0) {
                return "Xóa tài khoản thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }

    public static String onEditEvent(Account acc) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(EDITACC);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setInt(3, acc.getIsAdmin());
            ps.setLong(4, acc.getAccID());
            if (ps.executeUpdate() > 0) {
                return "Sửa thông tin thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
