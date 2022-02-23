package com.spring.core.p4.constructor.injection;

public class Certificate {
    private int id;
    private String name;

    public Certificate() {
    }

    public Certificate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "id: " + id +
                ", name: " + name +
                '}';
    }
}
