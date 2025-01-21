package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Nacho","Gamallo","48670809A",90,21,"Alicante","Soporte Técnico");
        Persona persona2 = new Persona();
        Pacient paciente_fit = new Pacient("Llados",35,'M',130.0,169.2);
        Pacient paciente_fit2 = new Pacient();
        paciente_fit.GetPacientInfo();
        paciente_fit2.GetPacientInfo();
    }
}