package com.example.annotations.model;

import org.springframework.stereotype.Component;

public class User {

    private String name;
    private int age;
    private String city;
    private String country;
    public String getName() {
        return name;
    }

    public User(){}

    public User(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
