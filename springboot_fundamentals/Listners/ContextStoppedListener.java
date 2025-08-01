package com.example.demo.springboot_fundamentals.Listners;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextStoppedListener {
    @EventListener
    public void onContextStopped(ContextStoppedEvent event) {
        System.out.println("Context stopped!");
    }
}
