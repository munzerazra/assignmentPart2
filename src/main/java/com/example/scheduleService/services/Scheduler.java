package com.example.scheduleService.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.example.scheduleService.Constants.Constants.CRON_JOB_COUNTER_MILLI_SECONDS;
import static com.example.scheduleService.Constants.Constants.URL_ENDPOINT;


@Component
public class Scheduler {

    private static final Logger log = LoggerFactory.getLogger(Scheduler.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    @Scheduled(fixedRate = CRON_JOB_COUNTER_MILLI_SECONDS)
    public void ScheduledMetarServiceRetrieveAndSave() throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        Object res = restTemplate.getForObject(URL_ENDPOINT, Object.class);

        log.info("Scheduler is running {}", dateFormat.format(new Date()));
    }
}

