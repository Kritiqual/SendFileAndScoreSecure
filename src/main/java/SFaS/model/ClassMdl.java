/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.model;

/**
 *
 * @author kritiqual
 */
public class ClassMdl extends BaseModel {
    private String classname;
    private String teachername;

    public ClassMdl(String classname, String teachername) {
        this.classname = classname;
        this.teachername = teachername;
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

    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[2];
        answer[0] = classname;
        answer[1] = teachername;
        return answer;
    }

}
