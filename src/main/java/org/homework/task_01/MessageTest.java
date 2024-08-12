package org.homework.task_01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans_HW_04.xml");
        MessageService messageService = context.getBean(MessageService.class);

        messageService.printMessage();
    }
}