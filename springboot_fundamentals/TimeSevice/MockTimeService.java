package com.example.demo.springboot_fundamentals.TimeSevice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("mock")
public class MockTimeService implements TimeService {
    @Override
    public String getTime() {
        return "12:34:56";
    }
}
