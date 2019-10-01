package com.example.BookAuthor.Book;

import com.example.BookAuthor.Author.Author;
import com.example.BookAuthor.Author.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @PostConstruct
    public void postConstruct(){
        Author emp = new Author(1,"First Author");
        authorRepository.save(emp);
       // Book proj = new Book(1,"Book Hank",new Author(1,""));
        //   emp.setEID(1);
        // emp.setEName("First Book");

     //      bookRepository.save(proj);
    }

    public List<Book> getAllBooks(Integer aID){
        Author author=new Author(aID,"");
        List<Book> authors=new ArrayList<>();
        bookRepository.findByAuthor(author)
                .forEach(authors::add);
        return authors;
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public Optional<Book> getBook(Integer bID) {
        return   bookRepository.findById(bID);

    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Integer bID) {
        bookRepository.deleteById(bID);
    }

}
