package org.example.Practica1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.Casa.Habitacion;

import java.util.ArrayList;
import java.util.Scanner;

@Setter @Getter
@ToString
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

    public void addDirector(String name) {
        Employee employee = new Employee(name);
        employeesList.add(employee);
    }

    public void addEmployee(){

    }
}
