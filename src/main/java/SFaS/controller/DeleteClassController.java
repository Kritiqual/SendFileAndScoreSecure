package SFaS.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class DeleteClassController {

    private static final String DELCLASS = "DELETE FROM ClassMDL WHERE ClassName = ?";

    public static String onDeleteEvent(String username) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(DELCLASS);
            ps.setString(1, username);
            int rs = ps.executeUpdate();

            if (rs > 0) {
                return "Xóa lớp thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
