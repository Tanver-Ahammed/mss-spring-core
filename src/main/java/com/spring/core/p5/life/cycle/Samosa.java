package com.spring.core.p5.life.cycle;

public class Samosa {
    private double price;

    public Samosa() {
    }

    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting property.........");
        this.price = price;
    }

    public void hey(){
        System.out.println("inside init() method: hey how are you?");
    }

    public void bye(){
        System.out.println("inside destroy() method: bye bye i'll die.....");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price: " + price +
                '}';
    }
}
