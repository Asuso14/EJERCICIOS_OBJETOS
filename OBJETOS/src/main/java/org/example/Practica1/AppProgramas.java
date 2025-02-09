package org.example.Practica1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    public void agregarPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    public String toString() {
        return "Cadena: " + nombre + ", Programas: " + listaProgramas;
    }
}

class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.director = new Empleado(nombreDirector, "director", null);
        listaEmpleados.add(director);
        cadena.agregarPrograma(this);
    }

    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }

    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
    }

    public void invitadosTemporada(int temporada) {
        listaInvitados.stream()
                .filter(i -> i.getTemporada() == temporada)
                .forEach(System.out::println);
    }
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public int vecesInvitado(String nombre) {
        return (int) listaInvitados.stream().filter(i -> i.getNombre().equals(nombre)).count();
    }

    public void rastrearInvitado(String nombre) {
        listaInvitados.stream()
                .filter(i -> i.getNombre().equals(nombre))
                .forEach(System.out::println);
    }

    public boolean buscarInvitado(String nombre) {
        return listaInvitados.stream().anyMatch(i -> i.getNombre().equals(nombre));
    }

    public String toString() {
        return "Programa: " + nombre + ", Director: " + director.getNombre();
    }
}

class Empleado {
    private static int contador = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = String.format("EP%03d", contador++);
        this.nombre = nombre;
        setCargo(cargo);
        this.director = cargo.equals("director") ? null : director;
    }

    private void setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Empleado: " + nombre + " (" + cargo + ")";
    }
}

class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fechaVisita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la fecha de visita (YYYY-MM-DD) para " + nombre + ": ");
        String fechaInput = scanner.nextLine();
        this.fechaVisita = LocalDate.parse(fechaInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public String toString() {
        return "Invitado: " + nombre + " (" + profesion + ", Temp: " + temporada + ", Fecha: " + fechaVisita + ")";
    }
}

public class AppProgramas {
    public static void main(String[] args) {
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Programa elHormiguero = new Programa("El Hormiguero", antena3, "Director1");
        System.out.println(elHormiguero);
        System.out.println(antena3);

        elHormiguero.insertarEmpleado("Pablo Motos", "presentador", null);
        elHormiguero.insertarEmpleado("Juan Pérez", "técnico", elHormiguero.getListaEmpleados().getFirst());
        elHormiguero.insertarEmpleado("María López", "colaborador", elHormiguero.getListaEmpleados().getFirst());

        System.out.println(elHormiguero.getListaEmpleados());

        elHormiguero.insertarInvitado("Aitana", "cantante", 1);
        System.out.println(elHormiguero.getListaInvitados());
    }
}
