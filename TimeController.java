package com.example.demo.springboot_fundamentals;

import com.example.demo.springboot_fundamentals.TimeSevice.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String time() {
        return timeService.getTime();
    }
}
