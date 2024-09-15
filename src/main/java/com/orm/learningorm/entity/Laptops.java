package com.orm.learningorm.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_Laptops")
public class Laptops {

    @Id
    private String Lapname;
    private int price;
    private String brand;

    @OneToOne
    @JoinColumn(name = "Students_id")
    private Students students;

    public String getLapname() {
        return Lapname;
    }

    public void setLapname(String lapname) {
        Lapname = lapname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStudents(Students students) {
    }
}
