package org.example.Practica1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter  @Setter
@ToString
public class Channel {

    private String name;
    private ArrayList <Program> programList;

    public Channel(){}
    public Channel(String name){
        this.name = name;
        this.programList = new ArrayList<>();
    }
}
