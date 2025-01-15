package org.example.bookstore.domain.book.controller;


import lombok.RequiredArgsConstructor;
import org.example.bookstore.domain.book.entity.Book;
import org.example.bookstore.domain.book.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;


    @PostMapping("")
    public String createBook(@ModelAttribute Book book  ) {
        bookService.saveBook(book);
        return "redirect:/book";
    }

    @GetMapping("")
    public String showBook(Model model) {
        List<Book> all = bookService.findAll();
        model.addAttribute("books", all);
        return "book";
    }





}
