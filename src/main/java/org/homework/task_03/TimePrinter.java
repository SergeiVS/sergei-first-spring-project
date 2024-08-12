package org.homework.task_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("timeService")
public class TimePrinter {
    private final TimeService timeService;

    public TimePrinter(TimeService timeService) {
        this.timeService = timeService;
    }

    public void printCurrentTime() {
        System.out.println("Current time is: " + timeService.getCurrentTime());
    }
}
