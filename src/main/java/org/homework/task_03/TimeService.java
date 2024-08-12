package org.homework.task_03;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component("timeService")
public class TimeService {
    public String getCurrentTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.getHour() + ":" + currentTime.getMinute();
    }
}
