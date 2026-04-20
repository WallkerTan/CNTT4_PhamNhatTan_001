package com.example.hackathon001.service;

import com.example.hackathon001.model.Book;
import com.example.hackathon001.repository.BookReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookReponsitory bookReponsitory;

    public List<Book> getBooks(){
        return bookReponsitory.getBooks();
    }
    public Book getBookById(long id){
        return bookReponsitory.getBookById(id);
    }

}
