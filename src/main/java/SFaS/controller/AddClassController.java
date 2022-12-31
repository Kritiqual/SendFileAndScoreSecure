package SFaS.controller;

import SFaS.model.Account;
import SFaS.model.ClassMdl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class AddClassController {

    private static final String FINDCLASS = "SELECT COUNT(*) FROM ClassMDL WHERE ClassName = ?";
    private static final String ADDCLASS = "INSERT INTO ClassMDL VALUES (?, ?)";

    public static String onSignupEvent(ClassMdl classmdl) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps = conn.prepareStatement(FINDCLASS);
            ps.setString(1, classmdl.getClassname());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                return "Lớp đã tồn tại!";
            }

            ps = conn.prepareStatement(ADDCLASS);
            ps.setString(1, classmdl.getClassname());
            ps.setString(2, classmdl.getTeachername());
            ps.executeUpdate();

            return "Thêm lớp thành công";
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
