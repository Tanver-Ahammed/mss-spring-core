package com.spring.core.p6.autowire.xml;

public class Employee {
    private Address address;

    public Employee() {
    }

    public Employee(Address address) {
        System.out.println("setting constructor............");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setting value..........");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address: " + address +
                '}';
    }
}
