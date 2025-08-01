package com.example.demo.spring_core_demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private Printer printer;

    public UserService(Printer printer) {
        this.printer = printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void sendMessage(String msg) {
        printer.print(msg);
    }
}
