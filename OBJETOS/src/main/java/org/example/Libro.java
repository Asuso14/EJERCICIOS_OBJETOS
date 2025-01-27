package org.example;

public class Libro {

    public static int count_books = 0;
    public static int available_books = 0;
    private boolean available = true;
    private String title;
    private String author;
    private String id;

    public Libro(){}
    public Libro(String title, String author){
        ++count_books;
        ++available_books;
        this.author = author;
        this.title = title;
        this.id = calc_id();
    }

    public static String getCount_books() {
        return "Total de libros creados: " + count_books;
    }

    public static String getAvailable_books() {
        return "Libros disponibles: : " + available_books;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return this.id;
    }

    private String calc_id(){
        if (count_books < 10){
            return "LIB00" + count_books;
        } else if (count_books < 100) {
            return "LIB0" + count_books;
        }else {
            return "LIB" + count_books;
        }
    }

    public void lend_book() {
        if (available){
            available = false;
            available_books--;
            System.out.println("El libro" + this.title + "ha sido prestado con exito");
        }else {
            System.out.println("El libro" + this.title + "ya esta prestado...");
        }
    }

    public void return_book(){
        if (!available){
            available = true;
            available_books++;
            System.out.println("El libro" + this.title + "ha sido devuelto con exito");
        }else {
            System.out.println("El libro" + this.title + "ya esta devuelto...");
        }
    }

    @Override
    public String toString(){
        return "El libro " + this.title + " del autor " + this.author + " con el id " + this.id + " con el estado: "+ this.available + " de prestamo.";
    }
}