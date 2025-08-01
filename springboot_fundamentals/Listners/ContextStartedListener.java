package com.example.demo.springboot_fundamentals.Listners;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextStartedListener {
    @EventListener
    public void onContextStarted(ContextStartedEvent event) {
        System.out.println("Context started!");
    }
}

