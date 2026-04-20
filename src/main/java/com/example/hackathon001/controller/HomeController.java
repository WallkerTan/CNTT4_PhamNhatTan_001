package com.example.hackathon001.controller;

import com.example.hackathon001.model.Book;
import com.example.hackathon001.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ComponentScan("/")

public class HomeController {
    @Autowired
    private BookService Service;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("books",Service.getBooks());
        return "home";
    }

    @GetMapping("/book/update/{id}")
    public String showUpdate(@PathVariable Long id, Model model) {
        model.addAttribute("book", Service.getBookById(id));
        return "/UpdateBook";
    }
}
