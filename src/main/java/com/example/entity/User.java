package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 14:21 2019/6/11
 * @Modified By:
 */
@Entity
public class User implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String userName;
    @Column
    private String passWord;

    @Column
    private String email;
    @Column
    private String nickName;
    @Column
    private String regTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String id,String userName, String passWord, String email, String nickName, String regTime) {
        this.id=id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.regTime = regTime;
    }

    public User() {
    }
}
