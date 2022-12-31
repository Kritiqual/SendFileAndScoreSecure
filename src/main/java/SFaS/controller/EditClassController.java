package SFaS.controller;

import SFaS.model.ClassMdl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class EditClassController {

    public static String onEditEvent(ClassMdl classmdl, String edit) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(edit);
            int rs = ps.executeUpdate();
            if (rs > 0) {
                return "Sửa thông tin thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
