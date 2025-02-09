package org.example.Practica1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Guest {

    static Scanner entry = new Scanner(System.in);

    private final LocalDate DEFAULT_DATA = LocalDate.now();
    private String name;
    private String job;
    private LocalDate visitDate;
    private int season;

    public Guest(){}
    //Contructor para los invitados, en el que se le indica al usuario que ingrese la fecha con un formato en especifico.
    public Guest(String name, String job ,int season){
        this.name = name;
        this.job = job;
        this.season = season;
        System.out.println("Introduce una fecha de visita (YYYY-MM-DD) para " + name + ":");
        this. visitDate = LocalDate.parse(entry.next(),DateTimeFormatter.ofPattern(("yyyy-MM-dd")));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Guest: [" +
                "name=" + name +
                ", job=" + job +
                ", visitDate=" + visitDate +
                ", season=" + season +
                "]";
    }
}