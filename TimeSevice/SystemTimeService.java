package com.example.demo.springboot_fundamentals.TimeSevice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
@Primary
public class SystemTimeService implements TimeService {
    @Override
    public String getTime(){
        return LocalTime.now().toString();
    }
}
