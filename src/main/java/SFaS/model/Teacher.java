package SFaS.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kritiqual
 */
public class Teacher {

    private int ID;
    private String name, Pos, Tel, Fct;

    public Teacher(int ID, String name, String Pos, String Tel, String Fct) {
        this.ID = ID;
        this.name = name;
        this.Pos = Pos;
        this.Tel = Tel;
        this.Fct = Fct;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return Pos;
    }

    public void setPos(String Pos) {
        this.Pos = Pos;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getFct() {
        return Fct;
    }

    public void setFct(String Fct) {
        this.Fct = Fct;
    }

}
