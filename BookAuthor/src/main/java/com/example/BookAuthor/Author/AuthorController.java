package com.example.BookAuthor.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    /**
     * adds a new author record
     * @param author
     */
    @RequestMapping(method= RequestMethod.POST,value = "/authors")
    public void addAuthor(@RequestBody Author author){
            authorService.addAuthor(author);
    }

    /**
     * returns all author records
     * @return
     */
    @RequestMapping("/authors")
    public List<Author> getAllAuthors(){

        return authorService.getAllAuthors();
    }
}
