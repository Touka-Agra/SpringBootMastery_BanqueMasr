package com.example.demo.di;

public class UserService {
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
