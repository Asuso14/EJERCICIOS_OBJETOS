package org.example.Equipos;

public class Persona {

    private String name;
    private String surname;
    private String DNI;
    private int weight;
    private int age;
    private String ProvidenceCity;
    private String Profession;

    public Persona(){}

    public Persona(String name, String surname, String DNI, int weight, int age, String providenceCity, String profession){
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.weight = weight;
        this.age = age;
        this.ProvidenceCity = providenceCity;
        this.Profession = profession;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getDNI(){
        return this.DNI;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getAge(){
        return this.age;
    }
    public String getProvidenceCity(){
        return this.ProvidenceCity;
    }
    public String getProfession(){
        return this.Profession;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setProvidenceCity(String providenceCity){
        this.ProvidenceCity = providenceCity;
    }
    public void setProfession(String profession){
        this.Profession = profession;
    }
    public String Concat(){
        return this.name + " " + this.surname;
    }

    @Override
    public String toString(){
        return "Persona: con nombre" + this.name + " y apellido " + this.surname + " y dni: " + this.DNI + " con una edad de " + this.age + " de la provincia de " + this.ProvidenceCity + " y de profesion: " + this.Profession;
    }
}
