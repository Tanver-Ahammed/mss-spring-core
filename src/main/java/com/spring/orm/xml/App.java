package com.spring.orm.xml;

import com.spring.orm.xml.dao.ProductDaoImplements;
import com.spring.orm.xml.entities.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c11/orm/orm.config.xml");

        ProductDaoImplements dao = context.getBean("productDaoImplements", ProductDaoImplements.class);

        Scanner scanner = new Scanner(System.in);

//        Product product;
        int affectedRow = 0;


        //------------------------------------------------------------------------------------------------
        aa:
        while (true) {
            try {
                System.out.println("1. Insert Student");
                System.out.println("2. Get Single Student by ID");
                System.out.println("3. Get All Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Update Student");
                System.out.println("6. Terminate The App");
                System.out.print("Enter Your Input: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    // insert
                    case 1: {
                        System.out.print("Enter Product Name: ");
                        String name = scanner.nextLine();
                        if (name.isEmpty())
                            name = scanner.nextLine();
                        System.out.print("Enter Product Type: ");
                        String type = scanner.nextLine();
                        if (type.isEmpty())
                            type = scanner.nextLine();
                        System.out.print("Enter Product Price: ");
                        double price = scanner.nextDouble();
                        affectedRow = dao.insertProduct(new Product(name, type, price));
                        if (affectedRow > 0) {
                            System.out.println("Student Inserted Successfully......");
                        } else {
                            System.out.println("Student isn't Inserted!!!!!");
                        }
                        break;
                    }
                    // get student by id
                    case 2: {
                        System.out.print("Enter Product ID: ");
                        int id = scanner.nextInt();
                        Product product = dao.getSingleProduct(id);
                        System.out.println(product);
                        break;
                    }
                    // get all student
                    case 3:
                        List<Product> products = dao.getAllProduct();
                        for (Product product : products) {
                            System.out.println(product);
                        }
                        break;
                    // delete student
                    case 4: {
                        System.out.print("Enter Product ID: ");
                        int id = scanner.nextInt();
                        dao.deleteProduct(id);
                        break;
                    }
                    case 5: {
                        System.out.print("Enter Product ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Product Name: ");
                        String name = scanner.nextLine();
                        if (name.isEmpty())
                            name = scanner.nextLine();
                        System.out.print("Enter Product Type: ");
                        String type = scanner.nextLine();
                        if (type.isEmpty())
                            type = scanner.nextLine();
                        System.out.print("Enter Product Price: ");
                        double price = scanner.nextDouble();
                        dao.updateProduct(new Product(id, name, type, price));
                        break;
                    }
                    // terminate
                    case 6: {
                        break aa;
                    }
                    default:
                        System.out.println("Wrong Input. Please, Try Again!!");
                }
            } catch (Exception e) {
                System.out.println("Some thing Error. Please, Try Again!!");
                e.printStackTrace();
            }
            System.out.println();
        }
        scanner.close();
        context.close();
//------------------------------------------------------------------------------------------------


    }
}
