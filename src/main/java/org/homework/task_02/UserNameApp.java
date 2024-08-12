package org.homework.task_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserNameApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserAppConfig.class);
//        UserRepository userRepository = context.getBean(UserRepository.class, "John");
        UserService userService = context.getBean(UserService.class);

        userService.printGreeting();

    }
}
