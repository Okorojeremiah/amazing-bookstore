package com.book.amazingbookseller.repository;

import com.book.amazingbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
