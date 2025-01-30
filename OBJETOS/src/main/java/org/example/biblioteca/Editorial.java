package org.example.biblioteca;

import java.util.ArrayList;

public class Editorial {
    private String name;
    private String country;
    private ArrayList<Libro> booksList;

    public Editorial(){}
    public Editorial(String name, String country){
        this.name = name;
        this.country = country;
        booksList = new ArrayList<>();
    }

    public void addBook(Libro book){
        booksList.add(book);
    }

    public void deleteBook(Libro book){
        booksList.remove(book);
    }

    public ArrayList<Libro> getBooksList() {
        return booksList;
    }

    public void setBooksList(ArrayList<Libro> booksList) {
        this.booksList = booksList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return "Editorial: [" + "nombre=" +this.name + "país=" + this.country + "ListaLibros=" + booksList + "]";
    }
}
