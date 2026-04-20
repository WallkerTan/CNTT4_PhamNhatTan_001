package com.example.pnt_hackathon_001.controller;

import com.example.pnt_hackathon_001.dto.BookDto;
import com.example.pnt_hackathon_001.model.Book;
import com.example.pnt_hackathon_001.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    private BookService service;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("books", service.getAll());
        return "home";
    }

    @GetMapping("/book/detail/{id}")
    public String deltail(@PathVariable("id") long id, Model model) {
        Book book = service.findById(id);
        if(book != null) {
            model.addAttribute("book", book);
            return "detail";
        }
        return "home";
    }
    @PostMapping("/book/detail/{id}")
    public String update(@ModelAttribute Book book, Model model) {
        service.updateBook(book);
        return "redirect:/";
    }
    @GetMapping("/book/delete/{id}")
    public String delete(@PathVariable("id") long id, Model model) {
        Book book = service.findById(id);
        if(book != null) {
            service.deleteBook(book.getId());
            return "redirect:/";
        }
        return "home";
    }
    @GetMapping("/book/add")
    public String addBook(Model model) {
        model.addAttribute("book", new BookDto());
        return "add";
    }
    @PostMapping("/book/add")
    public String addBook(@ModelAttribute BookDto bookDto) {
        service.addBook(bookDto);
        return "redirect:/";
    }
}
