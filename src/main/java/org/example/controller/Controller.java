package org.example.controller;

import org.example.model.Book;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Book> lisBook;
    public Controller(){
        lisBook = new ArrayList<>();
    }

    public ArrayList<Book> getLisBook() {
        return lisBook;
    }

    public Book registryBook(String title, String author, String category, int year){
        //Declarando a variável
        Book book;
        //inicializando a variável
        book = new Book(title, author,category,year);
        lisBook.add(book);
        return book;
    }
    public void printBook(){
        String answear = "";
        for (int i = 0;i< lisBook.size();i++){
            Book book = lisBook.get(i);
            answear += "Livro: " + (i+1) + "\n";
            answear += "Nome: " + book.getTitle() + "\n";
            answear += "Author: "+ book.getAuthor() + "\n";
            answear += "Categoria: " + book.getCategory() + "\n";
            answear += "Ano: " + book.getYear() + "\n";
            answear += "------------------------------------------ \n";
        }
        System.out.println(answear);
    }
}
