/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.controller;

import SFaS.model.ClassMdl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class ClassController {

    private static final String FINDCLASS = "SELECT COUNT(*) FROM ClassMDL WHERE ClassName = ?";
    private static final String ADDCLASS = "INSERT INTO ClassMDL VALUES (?, ?)";
    private static final String DELCLASS = "DELETE FROM ClassMDL WHERE ClassName = ?";
    private static final String EDITCLASS = "UPDATE ClassMDL SET ClassName = ?, TeacherName = ? WHERE ClassID = ?";

    public static String onAddEvent(ClassMdl classmdl) {
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

    public static String onDeleteEvent(String classname) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(DELCLASS);
            ps.setString(1, classname);

            if (ps.executeUpdate() > 0) {
                return "Xóa lớp thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }

    public static String onEditEvent(ClassMdl classmdl) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(EDITCLASS);
            ps.setString(1, classmdl.getClassname());
            ps.setString(2, classmdl.getTeachername());
            ps.setInt(3, classmdl.getClassid());
            if (ps.executeUpdate() > 0) {
                return "Sửa thông tin thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
