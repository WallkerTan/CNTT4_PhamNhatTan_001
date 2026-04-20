package com.example.pnt_hackathon_001.service;

import com.example.pnt_hackathon_001.dto.BookDto;
import com.example.pnt_hackathon_001.model.Book;
import com.example.pnt_hackathon_001.repository.BookRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRes bookRes;

    public List<Book> getAll() {
        return bookRes.getAll();
    }
    public Book findById(long id) {
        return bookRes.findById(id);
    }
    public boolean updateBook(Book book) {
        return bookRes.updateBook(book);
    }
    public boolean deleteBook(long id) {
        return bookRes.deleteById(id);
    }
    public boolean addBook(BookDto bookDto)
    {
        return bookRes.addBook(bookDto);
    }
}
