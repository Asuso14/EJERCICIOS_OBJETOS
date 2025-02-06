package org.example.Practica1;

import org.example.Casa.Habitacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    static Scanner entry = new Scanner(System.in);

    private String name;
    private Channel channel;
    private int seasons = 0;
    private ArrayList<Employee> employeesList;
    private ArrayList<Guest> guestsList;
    private Employee director;

    public Program(){}
    public Program(String name, Channel channel, int seasons){

        this.name = name;
        this.channel = channel;
        this.seasons = seasons;
        employeesList = new ArrayList<Employee>();
        guestsList = new ArrayList<Guest>();

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

    public void addDirector(String name) {
        Employee employee = new Employee(name);
        employeesList.add(employee);
    }

    public void addEmployee(){

    }

    @Override
    public String toString() {
        return "Program: [" + "name='" + getName() + '\'' + ", channel=" + getChannel() + ", seasons=" + getSeasons() +
                ", employeesList=" + getEmployeesList() + ", guestsList=" + getGuestsList() + ", director=" + getDirector() + ']';
    }
}
