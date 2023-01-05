/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.controller;

import SFaS.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kritiqual
 */
public class StudentController {

    private static final String FINDUSER = "SELECT COUNT(*) FROM Student WHERE StuName = ?";
    private static final String ADDSTU = "INSERT INTO Student VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String DELSTU = "DELETE FROM Student WHERE StuName = ?";
    private static final String EDITSTU = "UPDATE Student SET StuName = ?, StuTel = ?, StuDoB = ?, StuHome = ?, StuClass = ?, StuFaculty = ?, StuGPA = ? WHERE StuID = ?";

    public static String onAddEvent(Student stu) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps = conn.prepareStatement(FINDUSER);
            ps.setString(1, stu.getTenSV());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                return "Tài khoản đã tồn tại!";
            }

            ps = conn.prepareStatement(ADDSTU);
            ps.setString(1, stu.getTenSV());
            ps.setString(2, stu.getSdt());
            ps.setString(3, stu.getNgaySinh());
            ps.setString(4, stu.getQueQuan());
            ps.setString(5, stu.getLop());
            ps.setString(6, stu.getKhoaSV());
            ps.setFloat(7, stu.getGpa());
            ps.executeUpdate();

            return "Đăng ký thành công";
        } catch (SQLException e) {
            return e.toString();
        }

    }

    public static String onDeleteEvent(String stuname) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(DELSTU);
            ps.setString(1, stuname);

            if (ps.executeUpdate() > 0) {
                return "Xóa sinh viên thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }

    public static String onEditEvent(Student stu) {
        try {
            Connection conn = ConnectDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(EDITSTU);
            ps.setString(1, stu.getTenSV());
            ps.setString(2, stu.getSdt());
            ps.setString(3, stu.getNgaySinh());
            ps.setString(4, stu.getQueQuan());
            ps.setString(5, stu.getLop());
            ps.setString(6, stu.getKhoaSV());
            ps.setFloat(7, stu.getGpa());
            ps.setInt(8, stu.getStuID());
            if (ps.executeUpdate() > 0) {
                return "Sửa thông tin thành công";
            }
            return null;
        } catch (SQLException e) {
            return e.toString();
        }
    }
}
