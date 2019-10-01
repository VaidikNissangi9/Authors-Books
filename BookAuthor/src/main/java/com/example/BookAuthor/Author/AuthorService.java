package com.example.BookAuthor.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
//
//    @PostConstruct
//    public void postConstruct(){
//        Author emp = new Author(1,"First Author");
//     //   emp.setAID(1);
//       // emp.setEName("First Author");
//        authorRepository.save(emp);
//    }

    public List<Author> getAllAuthors(){
        List<Author> authors=new ArrayList<>();
        authorRepository.findAll()
        .forEach(authors::add);
        return authors;
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public Optional<Author> getAuthor(Integer aID) {
   return   authorRepository.findById(aID);

    }

    public void updateAuthor(Author author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(Integer aID) {
        authorRepository.deleteById(aID);
    }

}
