package org.example.bookstore.domain.book.service;

import lombok.RequiredArgsConstructor;
import org.example.bookstore.domain.book.entity.Book;
import org.example.bookstore.domain.book.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public void saveBook(Book book) {

        bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }


}
