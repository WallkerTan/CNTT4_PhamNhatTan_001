package com.example.hackathon001.repository;

import com.example.hackathon001.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookReponsitory {
    private List<Book> books =  new ArrayList<>(Arrays.asList(
            new Book("book1","tan",5,"//"),
            new Book("book2","tan1",5,"//"),
            new Book("book3","tan2",5,"//"),
            new Book("book4","tan3",5,"//"),
            new Book("book5","tan4",5,"//")

    ));

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
    public Book getBookById(long book_id) {
        return books.stream().filter(book -> book.getId() == book_id).findFirst().orElse(null);
    }
}
