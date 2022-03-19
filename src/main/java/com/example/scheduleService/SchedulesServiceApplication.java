package com.example.scheduleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulesServiceApplication.class, args);
    }

}
