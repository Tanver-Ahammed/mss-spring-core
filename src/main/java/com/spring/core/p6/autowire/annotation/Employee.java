package com.spring.core.p6.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Employee {

    @Autowired
    @Qualifier("address4")
    private Address address;

    public Employee() {
    }


    public Employee(Address address) {
        System.out.println("setting using constructor............");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("setting value using setter..........");
        this.address = address;
    }


    public String toString() {
        return "Employee{" +
                "address: " + address +
                '}';
    }
}
