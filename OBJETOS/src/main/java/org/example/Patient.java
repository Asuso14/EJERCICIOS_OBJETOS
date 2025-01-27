package org.example;

import java.util.Random;

public class Patient {

    private final static char GENDER_DEFF = 'X';
    public final static int OVERWEIGHT = 1;
    public final static int UNDERWEIGHT = -1;
    public final static int IDEALWEIGHT = 0;
    private final static int OVERAGE = 18;


    private String name;
    private int age;
    private String DNI;
    private char gender;
    private double weight;
    private double height;

    public Patient(){
        this(null,0,GENDER_DEFF,0,0);
    }
    public Patient(String name, int age, char gender, double weight, double height){
        this.name = name;
        this.age = age;
        CheckGender(gender);
        this.weight = weight;
        this.height = height;
        GenerateDNI();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDNI() {
        return this.DNI;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        CheckGender(this.gender);
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Patient(String name, int age, char gender){
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

    public int CalcIMC(){
        double IMC = this.weight / (Math.pow(this.height, 2));
        if (IMC < 20){
            return UNDERWEIGHT;
        }else if(IMC > 25){
            return OVERWEIGHT;
        }else {
            return IDEALWEIGHT;
        }
    }

    public boolean CheckAge(){
        return this.age >= OVERAGE;
    }

    private void CheckGender(char sex){
        if (sex != 'X' && sex != 'M'){
            this.gender = GENDER_DEFF;
        }else {
            this.gender = sex;
        }
    }

    @Override
    public String toString(){

        return "Paciente: con nombre" + this.name + " y " + this.age +" años de edad. Género "+ this.gender + " y dni: " + this.DNI + " con una altura de " + this.height + " y un peso de " + this.weight;

    }
}
