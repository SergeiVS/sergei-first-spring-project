package org.homework.task_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TimeServiceApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.homework.task_03");

        TimePrinter printer = context.getBean(TimePrinter.class);
        printer.printCurrentTime();
    }
}
