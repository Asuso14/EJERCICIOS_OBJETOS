package org.example.Practica1;

import java.util.ArrayList;

public class Channel {

    private String name;
    private ArrayList <Program> programList;

    public Channel(){}
    public Channel(String name){
        this.name = name;
        this.programList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Program> getProgramList() {
        return programList;
    }

    public void setProgramList(ArrayList<Program> programList) {
        this.programList = programList;
    }

    @Override
    public String toString() {
        return "Channel: [" +
                "name='" + name + '\'' +
                ", programList=" + programList +
                ']';
    }
}
