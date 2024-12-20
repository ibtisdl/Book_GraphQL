package org.example.controle_ace_book;

import org.example.controle_ace_book.dto.BookDto;
import org.example.controle_ace_book.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ControleAceBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleAceBookApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookService bookService) {
        return args -> {
            List<BookDto> books = List.of(
                    BookDto.builder()
                            .titre("Livre 1")
                            .publisher("Auteur 1")
                            .datePublication(LocalDate.of(2024, 2, 1))
                            .price(125)
                            .resume("Book about Java")
                            .build(),
                    BookDto.builder()
                            .titre("Livre 2")
                            .publisher("Auteur 2")
                            .datePublication(LocalDate.of(2023, 1, 2))
                            .price(140)
                            .resume("Book about PHP")
                            .build(),
                    BookDto.builder()
                            .titre("Livre 3")
                            .publisher("Auteur 3")
                            .datePublication(LocalDate.of(2023, 1, 2))
                            .price(140)
                            .resume("Book about Python")
                            .build()
            );

            books.forEach(bookService::saveBook);
        };
    }
}



