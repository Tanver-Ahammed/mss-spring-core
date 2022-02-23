package com.spring.core.p10.withoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.p10.withoutXML")
public class JavaConfig {

    @Bean
    public Address getAddress() {
        return new Address("Kagmari Street", "Tangail");
    }

    @Bean("student")
    public Student getStudent() {
        Student student = new Student();
        student.setAddress(getAddress());
        return student;
    }

}
