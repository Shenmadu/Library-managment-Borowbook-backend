package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.config.BookConfig;
import org.example.entity.BorrowBookEntity;
import org.example.model.BorrowBook;
import org.example.repository.BorrowBookRepository;
import org.example.service.BorrowBookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BorrowBookServiceImpl implements BorrowBookService {
    final BorrowBookRepository repository;
    final ModelMapper modelMapper;
    @Override
    public void addBorrowBook(BorrowBook borrowBook) {
        repository.save(modelMapper.map(borrowBook, BorrowBookEntity.class));
    }

    @Override
    public List<BorrowBookEntity> getBorrowBook() {
        return repository.findAll();
    }
}
