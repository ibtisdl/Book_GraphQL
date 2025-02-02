package org.example.controle_ace_book.web;

import lombok.AllArgsConstructor;
import org.example.controle_ace_book.dto.BookDto;
import org.example.controle_ace_book.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphQLController {
    private BookService bookService;

    @MutationMapping
    public BookDto saveBook(@Argument BookDto book){
        return bookService.saveBook(book);
    }

    @QueryMapping
    public List<BookDto> getBookByTitle(@Argument String titre){
        return bookService.getBookByTitle(titre);
    }


}




