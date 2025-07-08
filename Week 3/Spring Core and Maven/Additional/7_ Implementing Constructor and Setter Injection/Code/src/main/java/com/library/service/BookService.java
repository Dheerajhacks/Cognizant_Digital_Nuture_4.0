package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String title;
    private BookRepository bookRepository;

    public BookService(String title) {
        this.title = title;
        System.out.println("Constructor injected title: " + title);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("📚 " + title + " - Adding book: " + bookName);
        bookRepository.save(bookName);
    }
}
    