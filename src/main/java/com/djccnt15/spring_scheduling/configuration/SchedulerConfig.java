package com.djccnt15.spring_scheduling.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class SchedulerConfig {
    
    @Bean
    public ThreadPoolTaskScheduler task1Executor() {
        var scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(1);  // Ensures one dedicated thread
        scheduler.setThreadNamePrefix("Task1-");
        scheduler.initialize();
        return scheduler;
    }

    @Bean
    public ThreadPoolTaskScheduler task2Executor() {
        var scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(1);  // Ensures one dedicated thread
        scheduler.setThreadNamePrefix("Task2-");
        scheduler.initialize();
        return scheduler;
    }
}
