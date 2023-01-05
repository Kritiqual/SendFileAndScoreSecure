/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SFaS.model;

/**
 *
 * @author kritiqual
 */
public class Account {

    private String Username, Password;
    private int IsAdmin, AccID;

    public Account(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public Account(String Username, String Password, int IsAdmin) {
        this.Username = Username;
        this.Password = Password;
        this.IsAdmin = IsAdmin;
    }

    public Account(String Username, String Password, int IsAdmin, int AccID) {
        this.Username = Username;
        this.Password = Password;
        this.IsAdmin = IsAdmin;
        this.AccID = AccID;
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

    public int getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(int IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public int getAccID() {
        return AccID;
    }

    public void setAccID(int AccID) {
        this.AccID = AccID;
    }
}
