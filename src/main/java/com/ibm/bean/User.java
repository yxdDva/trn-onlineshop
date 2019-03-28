package com.ibm.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author dva
 * @create 2019-03-14 16:59
 */
//@Table(name = "USER")
//@Entity
public class User{

//    @Id
//    @GeneratedValue
    private int id;

//    @Column
    private String email;
//    @Column
    private String userName;
//    @Column
    private String passWord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
