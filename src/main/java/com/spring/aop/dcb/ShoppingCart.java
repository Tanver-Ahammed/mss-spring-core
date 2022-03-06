package com.spring.aop.dcb;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status) {
        // logging
        // Authentication & Authorization
        // Sanitize the data
        System.out.println("Checkout Method from shopping cart called....");
    }

}
