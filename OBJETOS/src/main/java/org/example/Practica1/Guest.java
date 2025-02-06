package org.example.Practica1;

import java.time.LocalDate;

public class Guest {

    private final LocalDate DEFAULT_DATA = LocalDate.now();
    private String name;
    private String job;
    private LocalDate visitDate;
    private int season;

    public Guest(){}
    public Guest(String name, String job, int season){
        this.name = name;
        this.job = job;
        this.season = season;
        this.visitDate = DEFAULT_DATA;
    }
    public Guest(String name, String job, LocalDate date, int season){

        this.name = name;
        this.job = job;
        this.season = season;
        checkDate(date);

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
    private void checkDate(LocalDate date){
        this.visitDate = date == null ? DEFAULT_DATA : date;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", visitDate=" + visitDate +
                ", season=" + season +
                '}';
    }
}
