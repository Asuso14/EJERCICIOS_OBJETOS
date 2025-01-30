package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {

    private final static String MAIL_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    public static int StudentCount = 0;
    private String name;
    private String curs;
    private int nia;
    private String email;
    private ArrayList <Libro> borrowed_books;

    public Estudiante(String name){
        this.name = name;
        this.nia = GenerateNIA();
        borrowed_books = new ArrayList<>();
    }

    public Estudiante(String name, String curs, String email){
        this.name = name;
        this.curs = curs;
        this.email = email;
        this.nia = GenerateNIA();
        borrowed_books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getNia() {
        return nia;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Libro> getBorrowed_books() {return borrowed_books;}

    public void setBorrowed_books(ArrayList<Libro> borrowed_books) {
        this.borrowed_books = borrowed_books;
    }

    public void addBook (Libro book){
        borrowed_books.add(book);
    }

    public void deleteBook (Libro book){
        borrowed_books.remove(book);
    }

    public void setEmail(String email) {
        if (CheckEmail(email)){
            this.email = email;
        }else {
            this.email = "";
        }
    }

    private int GenerateNIA(){
        return this.nia = ++StudentCount;
    }

    public static int TotalStudents(){
        return StudentCount;
    }

    private boolean CheckEmail(String email){
        return this.email.matches(MAIL_FORMAT);
    }

    @Override
    public String toString(){
        if (!borrowed_books.isEmpty()){
            return "Estudiante: [ NIA=" + this.nia + ", nombre="+ this.name + ", curso=" + this.curs + ", email=" + this.email + ", LibrosPrestados=" + borrowed_books + "]";
        }else {
            return "Estudiante: [ NIA=" + this.nia + ", nombre="+ this.name + ", curso=" + this.curs + ", email=" + this.email + "]";
        }
    }
}
