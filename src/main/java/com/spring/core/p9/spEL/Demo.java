package com.spring.core.p9.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{10 + 20}")
    private int x;
    @Value("#{20 * 5}")
    private int y;

    @Value("#{T(Math).sqrt(144)}")
    private double z;

    @Value("#{T(java.lang.Math).PI}")
    private double PI;

    @Value("#{new java.lang.String('Md. Tanver Ahammed')}")
    private String name;

    @Value("#{8>3}")
    private boolean isActive;

    public Demo() {
    }

    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x: " + x +
                ", y: " + y +
                ", z: " + z +
                ", PI: " + PI +
                "\nName: " + name +
                "\nisActive: " + isActive +
                '}';
    }
}
