package org.example;

import java.util.Random;

public class Pacient {

    private final static char GENDER_DEFF = 'X';

    private String name;
    private int age;
    private String DNI;
    private char gender;
    private double weight;
    private double height;

    public Pacient(){
        this(null,0,GENDER_DEFF,0,0);
    }
    public Pacient(String name, int age, char gender, double weight, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        GenerateDNI();
    }

    public Pacient(String name, int age, char gender){
        this(name,age,gender,0,0);
    }

    private void GenerateDNI(){
        Random random = new Random();
        int num = random.nextInt(10000000,99999999);

        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        this.DNI = Integer.toString(num)+letters[num%23];
    }

    public void GetPacientInfo(){
        System.out.println("Paciente: " + this.name);
        System.out.println("Edad: " + this.age);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Genero: " + this.gender);
        System.out.println("Peso: " + this.weight);
        System.out.println("Altura: " + this.height);
    }


}
