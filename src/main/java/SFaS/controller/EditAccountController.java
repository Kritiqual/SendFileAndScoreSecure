package SFaS.controller;

import SFaS.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class EditAccountController {

    public static String onEditEvent(Account acc, String edit) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(edit);
            int rs = ps.executeUpdate();
            if (rs > 0) {
                return "Sửa thông tin thành công";
            }
            return null;
        } catch (SQLException e) {
            return "Sửa thông tin thành công";
        }
    }
}
