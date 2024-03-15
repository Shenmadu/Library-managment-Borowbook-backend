package org.example.service;

import org.example.entity.BorrowBookEntity;
import org.example.model.BorrowBook;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BorrowBookService {
    void addBorrowBook(BorrowBook borrowBook);
    List<BorrowBookEntity>getBorrowBook();
}
