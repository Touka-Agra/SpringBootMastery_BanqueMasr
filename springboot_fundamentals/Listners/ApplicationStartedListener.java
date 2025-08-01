package com.example.demo.springboot_fundamentals.Listners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartedListener {
    @EventListener
    public void onAppStarted(ApplicationStartedEvent event) {
        System.out.println("Application started (before runners)!");
    }
}
