package org.example.model;

public class Book {
    private String title;
    private String author;
    private String category;
    private int year;

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getCategory(){
        return category;
    }

    public int getYear(){
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setYear(int year) {
        this.year = year;
    }
public Book (){

}
public Book(String title, String author, String category, int year){
        this.title=title;
        this.author=author;
        this.category=category;
        this.year=year;
}
}

