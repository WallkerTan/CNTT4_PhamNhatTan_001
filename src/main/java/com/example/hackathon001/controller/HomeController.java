package com.example.hackathon001.controller;

import com.example.hackathon001.model.Book;
import com.example.hackathon001.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@ComponentScan

public class HomeController {
    @Autowired
    private BookService Service;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("books",Service.getBooks());
        return "/home";
    }

    @GetMapping("/book/update/id")
    public String updateBook(@RequestParam("id") int id, Model model) {
        Book book = Service.getBookById(id);
        model.addAttribute("book",book);
        return "/UpdateBook";

    }
//    @PostMapping("/book/update/id")
//    public String updateBook(@ModelAttribute("book") Book book) {
//        Service.updateBook(book);
//        return "redirect:/";
//    }
}
