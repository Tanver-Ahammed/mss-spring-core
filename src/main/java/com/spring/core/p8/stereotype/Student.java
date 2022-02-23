package com.spring.core.p8.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "student")
//@Scope("prototype")
public class Student {
    @Value("19016")
    private int id;
    @Value("Md. Tanver Ahammed")
    private String name;
    @Value("Joypurhat")
    private String city;

    @Autowired
    private Address address;

    @Value("#{phones}")
    private List<String> phones;

    public Student() {
    }

    public Student(int id, String name, String city, List<String> phones, Address address) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.phones = phones;
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

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
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
                "\nphones: " + phones +
                "\n" + phones.getClass() +
                '}';
    }
}
