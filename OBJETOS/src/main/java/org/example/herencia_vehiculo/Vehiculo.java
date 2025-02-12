package org.example.herencia_vehiculo;

public class Vehiculo {
    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
    }

    public void printInfo(){
        System.out.println("Vehiculo [marca=" + this.marca + ", matricula=" + this.matricula + "]");
    }

    public void ruido(){
        System.out.println("Piiii piii");
    }
}
