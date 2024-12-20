package org.example.controle_ace_book.service;

import org.example.controle_ace_book.dao.entities.Book;
import org.example.controle_ace_book.dto.BookDto;

import java.util.List;

public interface BookService {
    public BookDto saveBook (BookDto book);
    public List<BookDto> getBookByTitle(String title);

}
