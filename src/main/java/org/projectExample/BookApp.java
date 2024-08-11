package org.projectExample;

import org.projectExample.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.projectExample");

        BookService service = context.getBean("bookService",BookService.class);

        service.addNewBook("40000 L p v", "Duma");
        service.addNewBook("3 mush", "Duma");
        service.addNewBook("", "Duma");
        service.addNewBook("Drei Freunden", "Remark");
        service.addNewBook("Kolm notsu", "Grimm");

        service.printAllBooks();
    }
}
