package org.example;

import java.util.Scanner;

public class Patients_App {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
//        Persona persona1 = new Persona("Nacho","Gamallo","48670809A",90,21,"Alicante","Soporte Técnico");
//        Persona persona2 = new Persona();
//        Pacient paciente_fit = new Pacient("Llados",35,'M',130.0,169.2);
//        Pacient paciente_fit2 = new Pacient();
//        paciente_fit.GetPacientInfo();
//        paciente_fit2.GetPacientInfo();

        System.out.println("Introduce un nombre:");
        String name = entry.next();
        System.out.println("Introduce la edad:");
        int age = entry.nextInt();
        System.out.println("Introduce el Genero:");
        char gender = entry.next().charAt(0);
        System.out.println("Introduce peso:");
        double weight = entry.nextDouble();
        System.out.println("Introduce altura:");
        double height = entry.nextDouble();
        Patient paciente1 = new Patient();
        Patient paciente2 = new Patient(name,age,gender);
        Patient paciente3 = new Patient(name,age,gender,weight,height);
        paciente1.setName("Paco");
        paciente1.setAge(25);
        paciente1.setGender('M');
        paciente1.setWeight(90.2);
        paciente1.setHeight(195);

        CheckWeight(paciente1);
        CheckWeight(paciente2);
        CheckWeight(paciente3);
    }

    public static void CheckWeight(Patient pacient){
        int imc = pacient.CalcIMC();

        switch (imc){
            case Patient.UNDERWEIGHT:
                System.out.println("La persona "+ pacient.getName()+ " tiene menos del peso ideal");
                break;
            case Patient.OVERWEIGHT:
                System.out.println("La persona "+ pacient.getName()+ "tiene mas del peso ideal");
                break;
            case Patient.IDEALWEIGHT:
                System.out.println("La persona "+ pacient.getName()+ "tiene el peso ideal");
                break;
        }
    }

    public static void CheckAge(Patient pacient){
        if(pacient.CheckAge()){
            System.out.println("El paciente es mayor de edad.");
        }else {
            System.out.println("El paciente es menor de edad.");
        }
    }
}