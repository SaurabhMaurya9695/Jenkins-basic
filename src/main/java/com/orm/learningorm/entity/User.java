package com.orm.learningorm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_Id")
    private int id;

    @Column(name = "User_name",length = 200)
    private String name;

    @Column(name="User_address")
    private String address;

    @Column(name = "User_city")
    private  String city;

    public User(){

    }
    public User(int id, String name, String address, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
