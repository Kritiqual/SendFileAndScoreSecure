/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.model;

/**
 *
 * @author kritiqual
 */
public class ClassMdl {

    private String classname;
    private String teachername;
    private int classid;

    public ClassMdl(String classname, String teachername) {
        this.classname = classname;
        this.teachername = teachername;
    }

    public ClassMdl(String classname, String teachername, int classid) {
        this.classname = classname;
        this.teachername = teachername;
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
