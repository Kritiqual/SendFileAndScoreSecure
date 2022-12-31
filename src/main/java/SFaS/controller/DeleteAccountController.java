package SFaS.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class DeleteAccountController {

    private static final String DELACC = "DELETE FROM Account WHERE Username = ?";

    public static String onDeleteEvent(String username) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(DELACC);
            ps.setString(1, username);
            int rs = ps.executeUpdate();

            if (rs > 0) {
                return "Xóa tài khoản thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
