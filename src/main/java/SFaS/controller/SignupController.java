package SFaS.controller;

import SFaS.gui.*;
import SFaS.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class SignupController {

    private static final String FINDUSER = "SELECT COUNT(*) FROM Account WHERE Username = ?";
    private static final String ADDACC = "INSERT INTO Account VALUES (?, ?, ?)";

    public static String onSignupEvent(Account acc) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps = conn.prepareStatement(FINDUSER);
            ps.setString(1, acc.getUsername());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                new SignupUI().setVisible(true);
                return "Tài khoản đã tồn tại!";
            }

            ps = conn.prepareStatement(ADDACC);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setInt(3, acc.getAccType());
            ps.executeUpdate();

            return "Đăng ký thành công";
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
