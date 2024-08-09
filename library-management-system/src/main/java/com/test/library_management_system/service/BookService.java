package com.test.library_management_system.service;

import java.util.List;

import com.test.library_management_system.entity.Book;

public interface BookService {
    List<Book> findAll();
    Book save(Book book);
    Book findById(Long id);
    void deleteById(Long id);
    Book borrowBook(Long bookId, Long userId);  
    Book returnBook(Long bookId);
}
