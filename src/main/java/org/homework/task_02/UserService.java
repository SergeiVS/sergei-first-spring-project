package org.homework.task_02;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printGreeting() {
        System.out.println("Hi! " + userRepository.getUserName() + "!");
    }
}
