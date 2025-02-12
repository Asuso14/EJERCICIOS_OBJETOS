package org.example.Festival;

public class Asistente extends Persona{

    protected String entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, String entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de entrada: " + entrada);
    }

    public

}
