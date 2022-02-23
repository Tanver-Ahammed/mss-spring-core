package com.spring.core.p10.withoutXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("19016")
    private int id;
    @Value("Tanver")
    private String name;
    @Value("Joypyrhat")
    private String city;

    @Autowired
    private Address address;

    public Student() {
    }

    public Student(int id, String name, String city, Address address) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                ", name: " + name +
                ", city: " + city +
                "\naddress: " + address +
                '}';
    }
}
