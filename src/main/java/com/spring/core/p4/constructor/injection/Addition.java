package com.spring.core.p4.constructor.injection;

public class Addition {
    private int a;
    private int b;

    public Addition() {
    }

    public Addition(double a, double b) {
        System.out.println("constructor: double, double");
        this.a = (int) a;
        this.b = (int) b;
    }

    public Addition(int a, int b) {
        System.out.println("constructor: int, int");
        this.a = a;
        this.b = b;
    }

    public Addition(String a, String b) {
        System.out.println("constructor: String, String");
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }

    public void doSum() {
        System.out.println("sum is: " + (this.a + this.b));
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a: " + a +
                ", b: " + b +
                '}';
    }
}
