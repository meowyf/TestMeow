package com.meowyf.java.bean;

import java.io.Serializable;

/**
 * Persion Bean
 */
public class Persion implements Serializable {

    private int age;

    private String name;

    private String address;

    private String like;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
