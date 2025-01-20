package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Nacho","Gamallo","48670809A",90,21,"Alicante","Soporte Técnico");
        Persona persona2 = new Persona();
        persona1.printInfo();
        System.out.println(persona1.Concat());
        System.out.println("Antes: " + persona1.getName());
        persona1.setName("Nashe");
        System.out.println("Despues: " + persona1.getName());
    }
}