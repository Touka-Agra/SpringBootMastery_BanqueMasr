package com.example.demo.spring_core_demo;

import org.springframework.stereotype.Component;

@Component
public class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
