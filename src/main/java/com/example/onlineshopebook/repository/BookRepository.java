package com.example.onlineshopebook.repository;

import com.example.onlineshopebook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book,Long> {
}
