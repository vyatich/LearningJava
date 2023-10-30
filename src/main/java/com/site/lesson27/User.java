package com.site.lesson27;

public class User {

    private String name;
    private String lastName;
    private int age;

    public User(String name) {
        this.name = name;
    }

    public User(int age) {
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
