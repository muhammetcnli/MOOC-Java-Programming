/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Book {

    private String author;
    private String title;
    private int page;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.title = name;
        this.page = pages;
    }

    public String getAuthor() {

        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.page;
    }
    
    public String toString(){
        return this.author + ", " + this.title + ", " + this.page + " pages";
    }

}
