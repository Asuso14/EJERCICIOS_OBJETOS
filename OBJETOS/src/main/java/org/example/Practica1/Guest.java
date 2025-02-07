package org.example.Practica1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter @Setter
@ToString
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
    private void checkDate(LocalDate date){
        this.visitDate = date == null ? DEFAULT_DATA : date;
    }
}
