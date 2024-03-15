package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.BorrowBookEntity;
import org.example.model.BorrowBook;
import org.example.service.BorrowBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/borrow-Book")
@Slf4j
public class BorrowBookController {
    final BorrowBookService service;
    @PostMapping("/add")
    public void addBurrowBook(@RequestBody BorrowBook borrowBook){
        log.info(borrowBook.toString());
        service.addBorrowBook(borrowBook);
    }
    @GetMapping("/get")
    public List<BorrowBookEntity> getAll(){
       return service.getBorrowBook();

    }
}
