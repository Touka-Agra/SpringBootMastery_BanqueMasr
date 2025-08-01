package com.example.demo.springboot_fundamentals.Listners;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppFailedListener {
    @EventListener
    public void onAppFailed(ApplicationFailedEvent event) {
        System.out.println("Application failed to start!");
        Throwable ex = event.getException();
        ex.printStackTrace();
    }
}
