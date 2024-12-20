package org.example.controle_ace_book.mapper;

import org.example.controle_ace_book.dao.entities.Book;
import org.example.controle_ace_book.dto.BookDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public Book fromBookDtoToBook(BookDto bookDto){
        return modelMapper.map(bookDto, Book.class);
    }
    public BookDto fromBookToBookDto(Book book){
        return  modelMapper.map(book,BookDto.class);
    }
}
