package org.example.Practica1;

import java.util.ArrayList;

public class Program {

    private String name;
    private Channel channel;
    private int seasons;
    private ArrayList<Employee> employeesList;
    private ArrayList<Guest> guestsList;
    private Employee director;

    public Program(){}
    public Program(String name){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }

    public void setGuestsList(ArrayList<Guest> guestsList) {
        this.guestsList = guestsList;
    }

    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Program: [" + "name='" + getName() + '\'' + ", channel=" + getChannel() + ", seasons=" + getSeasons() +
                ", employeesList=" + getEmployeesList() + ", guestsList=" + getGuestsList() + ", director=" + getDirector() + ']';
    }
}
