package com.example.BookAuthor.Book;

import com.example.BookAuthor.Author.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * adds a book for an author
     * @param aID
     * @param book
     */
    @RequestMapping(method= RequestMethod.POST,value = "/authors/{id}/books")
    public void addBook(@PathVariable("id") Integer aID,@RequestBody Book book){
        book.setAuthor(new Author(aID,""));
        bookService.addBook(book);
    }

}
