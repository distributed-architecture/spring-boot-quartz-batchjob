package com.openmind.bc.quartz.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpleJob {

    private final static Logger logger = LoggerFactory.getLogger(SimpleJob.class);

    @Scheduled(cron = "0/2 * * * * ?")
    public void handleTasks() {

        logger.info("... start to handle batch jobs ...");

        try {
            //concurrent default false
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            logger.error("error occurred: ", e);
        }
    }

}
