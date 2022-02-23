package com.spring.core.p1.basic;

public class Student {
    private int id;
    private String name;
    private String city;

    public Student() {
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setting student id.....");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setting student name.....");
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String address) {
        System.out.println("setting student address.....");
        this.city = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                ", name: " + name +
                ", address: " + city +
                '}';
    }
}
