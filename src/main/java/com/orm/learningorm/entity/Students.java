package com.orm.learningorm.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "jpa_Students")
public class Students {

    @Id
    private int rollno;
    private String Sname;
    private String address;
    private String city;

    @OneToOne(mappedBy = "students",cascade = CascadeType.ALL)
    private Laptops laptops;

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @OneToMany(mappedBy = "students")
    private List<Address> addressList=new ArrayList<>();

    public Students() {
    }

    public Students(int rollno, String sname, String address, String city) {
        this.rollno = rollno;
        Sname = sname;
        this.address = address;
        this.city = city;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
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

    public void setLaptops(Laptops laptops) {
    }
}
