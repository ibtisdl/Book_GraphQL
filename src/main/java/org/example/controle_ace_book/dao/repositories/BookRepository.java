package org.example.controle_ace_book.dao.repositories;

import org.example.controle_ace_book.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    public List<Book> findByTitre(String titre);

}
