package com.djccnt15.spring_scheduling.task;

import com.djccnt15.spring_scheduling.annotations.ScheduledTask;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Slf4j
@ScheduledTask
@RequiredArgsConstructor
@ConditionalOnProperty(name = "task.name", havingValue = "executor")
public class ExecutorTask {

    private final ThreadPoolTaskScheduler task1Executor;
    private final ThreadPoolTaskScheduler task2Executor;
    
    @Scheduled(fixedDelayString = "#{${schedule.fixed-delay}}")
    public void task1() {
        task1Executor.execute(() -> {
            log.info("Task1 Job run");
        });
    }
    
    @Scheduled(fixedDelayString = "#{${schedule.fixed-delay}}")
    public void task2() {
        task2Executor.execute(() -> {
            log.info("Task2 Job run");
        });
    }
}
