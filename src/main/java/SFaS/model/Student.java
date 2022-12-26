/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.model;

/**
 *
 * @author kritiqual
 */
public class Student extends BaseModel {

    private String maSV;
    private String hotenSV;
    private String Lop;
    private float[] diem;

    public Student(String maSV, String hotenSV, String Lop, float[] diem) {
        this.maSV = maSV;
        this.hotenSV = hotenSV;
        this.Lop = Lop;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHotenSV() {
        return hotenSV;
    }

    public void setHotenSV(String hotenSV) {
        this.hotenSV = hotenSV;
    }

    public float[] getDiem() {
        return diem;
    }

    public void setDiem(float[] diem) {
        this.diem = diem;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[4];
        answer[0] = maSV;
        answer[1] = hotenSV;
        answer[2] = Lop;
        answer[3] = diem;
        return answer;
    }
}
