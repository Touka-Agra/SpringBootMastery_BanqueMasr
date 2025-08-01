package com.example.demo.springboot_fundamentals.Listners;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedListener {
    @EventListener
    public void onContextClosed(ContextClosedEvent event) {
        System.out.println("Context closed!");
    }
}
