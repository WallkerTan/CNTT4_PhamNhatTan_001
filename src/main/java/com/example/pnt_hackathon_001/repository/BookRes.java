package com.example.pnt_hackathon_001.repository;

import com.example.pnt_hackathon_001.dto.BookDto;
import com.example.pnt_hackathon_001.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookRes {
    private List<Book> books =  new ArrayList<>(Arrays.asList(
            new Book("book1","tan",5,"//"),
            new Book("book2","tan1",5,"//"),
            new Book("book3","tan2",5,"//"),
            new Book("book4","tan3",5,"//"),
            new Book("book5","tan4",5,"//")

    ));
    public List<Book> getAll() {
        return new ArrayList<>(books);
    }
    public Book findById(long id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    public boolean updateBook(Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == updatedBook.getId()) {
                books.set(i, updatedBook);
                return true;
            }
        }
        return false;
    }

    public boolean deleteById(long id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean addBook(BookDto bookDto) {
        if(bookDto==null){
            return false;
        }

        Book newBook = new Book();
        newBook.setId(bookDto.getId());
        newBook.setTitle(bookDto.getTitle());
        newBook.setAuthor(bookDto.getAuthor());
        newBook.setQuantity(bookDto.getQuantity());
        books.add(newBook);
        return true;
    }


}
