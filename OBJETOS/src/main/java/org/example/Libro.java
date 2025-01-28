package org.example;

public class Libro {

    public static int count_books = 0;
    public static int available_books = 0;
    private boolean available = true;
    private String title;
    private String author;
    private String id;
    private Estudiante loan_student;
    private Editorial editorial;

    public Libro(){}
    public Libro(String title, String author, Editorial editorial){
        ++count_books;
        ++available_books;
        this.author = author;
        this.title = title;
        loan_student = null;
        this.id = calc_id();
        this.editorial  = editorial;
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

    public Estudiante getLoan_student() {return loan_student;}

    public void setLoan_student(Estudiante loan_student) {this.loan_student = loan_student;}

    private String calc_id(){
        if (count_books < 10){
            return "LIB00" + count_books;
        } else if (count_books < 100) {
            return "LIB0" + count_books;
        }else {
            return "LIB" + count_books;
        }
    }

    public Prestamo lend_book(Estudiante student) {
        if (available && student.getBorrowed_book() == null){
            available = false;
            System.out.println("El libro" + this.title + "ha sido prestado a " + student.getName());
            available_books--;
            loan_student = student;
            student.setBorrowed_book(this);
            return new Prestamo(student,this);
        } else if (student.getBorrowed_book() != null) {
            System.out.println("El estudiante " + student.getName() + " ya tiene un libro prestado");
        } else {
            System.out.println("El libro" + this.title + "ya esta prestado...");
        }
        return null;
    }

    public Prestamo getLoan(Prestamo loan){
        return loan;
    }

    public void return_book(Estudiante student){
        if (!available){
            available = true;
            available_books++;
            System.out.println("El libro" + this.title + "ha sido devuelto por" + loan_student.getName());
            loan_student = null;
            student.setBorrowed_book(null);
        }else {
            System.out.println("El libro" + this.title + "ya esta devuelto...");
        }
    }

    @Override
    public String toString(){
        return "El libro " + this.title + " del autor " + this.author + " con el id " + this.id + " con el estado: "+ this.available + " de prestamo.";
    }
}