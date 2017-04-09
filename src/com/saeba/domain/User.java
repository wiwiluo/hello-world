package com.saeba.domain;

/**
 * Created by wiwil on 2017/4/9.
 */
public class User {

    /**
     * 用户ID
     */
    private int userID;

    /**
     * 用户名
     */
    private String username;

    /**
     * 年龄
     */
    private int age;

    /**
     * 性别
     */
    private String sex;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
