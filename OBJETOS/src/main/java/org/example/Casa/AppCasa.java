package org.example.Casa;

public class AppCasa {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio",40);
        casa.agregarHabitacion("Cocina",34.3);
        casa.agregarHabitacion("Baño",10);
        casa.mostrarHabitaciones();

    }
}
