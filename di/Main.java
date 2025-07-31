package com.example.demo.di;

public class Main {
    public static void main(String[] args) {
        // via Constructor
        Printer printer = new Printer();
        UserService userService = new UserService(printer);
        userService.sendMessage("Hello from Constructor!");

        // via Setter
        UserService userService2 = new UserService(null);
        userService2.setPrinter(new Printer());
        userService2.sendMessage("Hello from Setter!");
    }
}
