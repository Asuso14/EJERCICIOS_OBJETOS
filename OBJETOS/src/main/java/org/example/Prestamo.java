package org.example;

import java.security.PrivilegedAction;
import java.time.LocalDate;

public class Prestamo {
    private Estudiante student;
    private Libro book;
    private LocalDate date;


    public Prestamo(Estudiante student, Libro book){
        this.student = student;
        this.book = book;
        date = LocalDate.now();
    }

    public Estudiante getStudent() {
        return student;
    }

    public void setStudent(Estudiante student) {
        this.student = student;
    }

    public Libro getBook() {
        return book;
    }

    public void setBook(Libro book) {
        this.book = book;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
