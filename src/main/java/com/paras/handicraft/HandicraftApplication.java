package com.paras.handicraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandicraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandicraftApplication.class, args);
        System.out.println("Hello World");
        User user1 = new User("govi", "kmr", "govinda@gmail.com", "ssdfsd", 12);
        System.out.println(user1.toString());
    }

}
