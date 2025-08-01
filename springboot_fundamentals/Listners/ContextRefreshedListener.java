package com.example.demo.springboot_fundamentals.Listners;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshedListener {
    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event) {
        System.out.println("Context refreshed!");
    }
}
