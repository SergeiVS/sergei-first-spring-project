package org.homework.task_01;

public class MessageService {
    private MessageRepository repository;

//    public MessageService(){};
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public void printMessage() {
        System.out.println(repository.getMessage());
    }
}
