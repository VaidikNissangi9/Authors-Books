package com.example.BookAuthor.Author;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entity class for author table
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer aID;
    private String aName;

    public  Author(Integer aID,String aName){
        this.aID=aID;
        this.aName=aName;
    }

    public Author() {

    }

    public Integer getEID() {
        return aID;
    }

    public void setEID(Integer e_ID) {
        this.aID = e_ID;
    }

    public String getEName() {
        return aName;
    }

    public void setEName(String aName) {
        this.aName = aName;
    }
}
