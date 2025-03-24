package com.djccnt15.spring_scheduling.task;

import com.djccnt15.spring_scheduling.annotations.ScheduledTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@ScheduledTask
@ConditionalOnProperty(name = "task.name", havingValue = "fixedDelay")
public class FixedDelayStringTask {
    
    @Scheduled(fixedDelayString = "#{${schedule.fixed-delay}}")
    public void run() {
        log.info("Fixed Delayed String Job");
    }
}
