package com.orm.learningorm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.context.annotation.Primary;

@Entity
public class Address {

    @Id
    private int HouseNo;

    private String Street;

    private String city;
    private String country;

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    @ManyToOne
    @JoinColumn(name="student_id")
    private Students students;

    public Address(){

    }

    public Address(int houseNo, String street, String city, String country) {
        HouseNo = houseNo;
        Street = street;
        this.city = city;
        this.country = country;
    }

    public int getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(int houseNo) {
        HouseNo = houseNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
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
