package org.projectExample.repository;

import org.projectExample.entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookRepository {
    private List<Book> bookList;

    public BookRepository(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void add(Book book) {
        bookList.add(book);
    }
    public void printBooks(){
       bookList.forEach(System.out::println);
    }
}
