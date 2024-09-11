package com.example.demo.repository;


import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Метод для поиска книг по категории
    List<Book> findByCategory(String category);

    // Метод для поиска книг по автору
    List<Book> findByAuthor(String author);
}