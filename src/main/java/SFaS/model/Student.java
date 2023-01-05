package SFaS.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kritiqual
 */
public class Student {

    private int StuID;
    private float gpa;
    private String Sdt, tenSV, khoaSV, ngaySinh, queQuan, lop;

    public Student(String Sdt, String tenSV, String khoaSV, String ngaySinh, String queQuan, String lop, float gpa) {
        this.Sdt = Sdt;
        this.tenSV = tenSV;
        this.khoaSV = khoaSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.lop = lop;
        this.gpa = gpa;
    }

    public Student(int StuID, String Sdt, String tenSV, String khoaSV, String ngaySinh, String queQuan, String lop, float gpa) {
        this.StuID = StuID;
        this.Sdt = Sdt;
        this.tenSV = tenSV;
        this.khoaSV = khoaSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.lop = lop;
        this.gpa = gpa;
    }

    public int getStuID() {
        return StuID;
    }

    public void setStuID(int StuID) {
        this.StuID = StuID;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getKhoaSV() {
        return khoaSV;
    }

    public void setKhoaSV(String khoaSV) {
        this.khoaSV = khoaSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

}
