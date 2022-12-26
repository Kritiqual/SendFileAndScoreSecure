/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.model;

/**
 *
 * @author kritiqual
 */
public class Account extends BaseModel {

    private String Username, Password;
    private int AccType;

    public Account(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public Account(String Username, String Password, int AccType) {
        this.Username = Username;
        this.Password = Password;
        this.AccType = AccType;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAccType() {
        return AccType;
    }

    public void setAccType(int AccType) {
        this.AccType = AccType;
    }

    @Override
    public Object[] toObjectArrayData() {
        Object[] answer = new Object[3];
        String[] AccTypes = {"Admin", "Teacher", "Student"};
        answer[0] = Username;
        answer[1] = Password;
        answer[2] = AccTypes[AccType];
        return answer;
    }
}
