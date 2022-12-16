package com.mahesh.crudjdbc.CRUDJDBC.entity;


public class UserInfo {

    private int id;
    private String name;
    private int age;
    private String email;
    private String city;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public UserInfo() {
        super();
    }

    public UserInfo(int id, String name, int age,String email, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email=email;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
