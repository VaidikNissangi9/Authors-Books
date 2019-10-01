package com.example.BookAuthor.Book;

import com.example.BookAuthor.Author.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
   public List<Book> findByAuthor(Author author);

}
