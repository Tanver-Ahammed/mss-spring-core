package com.spring.jdbc.xml;

import com.spring.jdbc.xml.dao.StudentDaoImplement;
import com.spring.jdbc.xml.entities.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("c10/jdbc/jdbc.config.xml");

        StudentDaoImplement dao = context.getBean("dao", StudentDaoImplement.class);
        Scanner scanner = new Scanner(System.in);

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
                        System.out.print("Enter Your ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Your Name: ");
                        String name = scanner.nextLine();
                        if (name.isEmpty())
                            name = scanner.nextLine();
                        System.out.print("Enter Your City: ");
                        String city = scanner.nextLine();
                        if (city.isEmpty())
                            city = scanner.nextLine();
                        int affectedRow = dao.insertStudent(new Student(id, name, city));
                        if (affectedRow > 0) {
                            System.out.println("Student Inserted Successfully......");
                        } else {
                            System.out.println("Student isn't Inserted!!!!!");
                        }
                        break;
                    }
                    // get student by id
                    case 2: {
                        System.out.print("Enter Your ID: ");
                        int id = scanner.nextInt();
                        Student student = dao.getSingleStudent(id);
                        System.out.println(student);
                        break;
                    }
                    // get all student
                    case 3:
                        List<Student> students = dao.getAllStudent();
                        for (Student student : students) {
                            System.out.println(student);
                        }
                        break;
                    // delete student
                    case 4: {
                        System.out.print("Enter Your ID: ");
                        int id = scanner.nextInt();
                        dao.deleteStudent(id);
                        break;
                    }
                    case 5: {
                        System.out.print("Enter Your ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Your Name: ");
                        String name = scanner.nextLine();
                        if (name.isEmpty())
                            name = scanner.nextLine();
                        System.out.print("Enter Your City: ");
                        String city = scanner.nextLine();
                        if (city.isEmpty())
                            city = scanner.nextLine();
                        dao.updateStudent(new Student(id, name, city));
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
            }
            System.out.println();
        }
        scanner.close();
        context.close();

//------------------------------------------------------------------------------------------------


    }
}
