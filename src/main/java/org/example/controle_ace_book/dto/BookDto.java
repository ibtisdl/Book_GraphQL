package org.example.controle_ace_book.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class BookDto {
    private String titre;
    private String publisher;
    private LocalDate datePublication;
    private double price;
    private String resume;
}