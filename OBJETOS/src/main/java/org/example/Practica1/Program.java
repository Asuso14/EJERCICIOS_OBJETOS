package org.example.Practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    static Scanner entry = new Scanner(System.in);

    private String name;
    private Channel channel;
    private int seasons;
    private ArrayList<Employee> employeesList;
    private ArrayList<Guest> guestsList;
    private Employee director;

    public Program(){}
    public Program(String name, Channel channel, String directorName){

        this.name = name;
        this.channel = channel;
        this.seasons = 0;
        employeesList = new ArrayList<Employee>();
        guestsList = new ArrayList<Guest>();
        this.director = new Employee(directorName, "director", null);
        employeesList.add(director);
        //channel.addProgram(this);

    }

    //Estos son los dos metodos para agregar objetos para las listas.
    public void addEmployee(String name, String charge, Employee director){

        Employee employee = new Employee(name,charge,director);
        employeesList.add(employee);

    }

    public void addGuest(String name, String job, int season){

        Guest guest = new Guest(name,job,season);
        guestsList.add(guest);

    }

    //Este metodo se encarga de imprimir todos los invitados que van a una temporada en especifico
    public void guestSeason(int seasons){
        System.out.println("Invitados que han ido a la temporada: " + seasons);
        int temp = 0;
        for (Guest gue : guestsList){
            if (gue.getSeason() == seasons){
                System.out.println("Nombre: " + gue.getName() + ", Profesion: " + gue.getJob());
                temp++;
            }
        }
        System.out.println("Hay un total de: " + temp);
    }

    //Esta funcion lo que va a devolver va a ser el numero de veces que una persona en
    // especifico ha estado invitado al programa.
    public int timesGuest(String name){
        System.out.println("Veces que se ha invitado a " + name);
        int temp = 0;
        for (Guest gue : guestsList){
            if(name.equals(gue.getName())){
                temp++;
            }
        }
        return temp;
    }

    //Aqui lo que se hace es imprimir la informacion de el invitado que se indica el nombre.
    public void searchGuest(String name, int quantity){
        System.out.println("Veces que ha sido Invitado: " + quantity);
        for (Guest gue : guestsList){
            if(name.equals(gue.getName())){
                System.out.println("Guest: [ Nombre:" + gue.getName() + ", Fecha:" + gue.getVisitDate() + ", Temporada:" + gue.getSeason() + "]");
            }
        }
    }

    //Esta funcion devuelve el resultado de si un invitado ha estado antes o no.
    public boolean searchGuest(String name){
        for (Guest gue : guestsList){
            if (gue.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    //Este metodo imprime (si ha estado alguna vez), la informacion de sus anteriores
    // veces que han sido invitadas, usamos la funcion anterior.
    public void guestedAfter(String name){
        if (searchGuest(name)){
            System.out.println("El invitado " + name + " si ha sido invitado.");
            for (Guest gue : guestsList){
                if(name.equals(gue.getName())){
                    System.out.println("Guest: [ Nombre:" + gue.getName() + ", Fecha:" + gue.getVisitDate() + ", Temporada:" + gue.getSeason() + "]");
                }
            }
        }else {
            System.out.println("El invitado " + name + ", no ha sido invitado antes.");
        }
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

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }

    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Program: [" +
                "name=" + name +
                ", channel=" + channel +
                ", seasons=" + seasons +
                ", employeesList=" + employeesList +
                ", guestsList=" + guestsList +
                ", director=" + director +
                ']';
    }
}