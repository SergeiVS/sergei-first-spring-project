package org.projectExample.service;

import org.projectExample.entity.Book;
import org.projectExample.repository.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addNewBook(String title, String author) {
        if (!title.isBlank() && !author.isBlank()) {
            Book book = new Book(title, author);
            repository.add(book);
            System.out.println("Book was added");
        } else {
            System.out.println("Book adding failed");
        }
    }

    public void printAllBooks() {
        repository.printBooks();
    }
}
