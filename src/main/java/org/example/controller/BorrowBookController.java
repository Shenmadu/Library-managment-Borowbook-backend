package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.BorrowBook;
import org.example.service.BorrowBookService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/borrow-Book")
public class BorrowBookController {
    final BorrowBookService service;
    @PostMapping("/add")
    public void addBurrowBook(@RequestBody BorrowBook borrowBook){
        service.addBorrowBook(borrowBook);
    }
}
