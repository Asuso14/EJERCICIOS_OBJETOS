package org.example.Festival;

import lombok.Getter;
import lombok.Setter;

public class Persona {

    private static final int MIN_AGE = 18;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setAge(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento...");
    }

    public void setAge(int age) throws MinAgeException{

        this.edad = age;
        if (edad < MIN_AGE){
            throw new MinAgeException();

        }
    }
}