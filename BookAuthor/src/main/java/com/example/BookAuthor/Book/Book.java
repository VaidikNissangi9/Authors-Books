package com.example.BookAuthor.Book;

import com.example.BookAuthor.Author.Author;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//Entity class for book table
@Entity
    public class Book {
        @Id
        private Integer bID;

        private String bName;

    @ManyToOne
    @JoinColumn
        private Author author;
        public  Book(Integer bID,String bName,Author author){
            this.bID=bID;
            this.bName=bName;
            this.author=author;
        }

        public Book() {

        }
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
        public Integer getPID() {
            return bID;
        }

        public void setPID(Integer p_ID) {
            this.bID = p_ID;
        }

        public String getPName() {
            return bName;
        }

        public void setPName(String bName) {
            this.bName = bName;
        }
    }


