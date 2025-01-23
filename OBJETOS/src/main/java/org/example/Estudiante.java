package org.example;

public class Estudiante {

    private final static String MAIL_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    public static int StudentCount = 0;
    private String name;
    private String curs;
    private int nia;
    private String email;

    public Estudiante(String name){
        this.name = name;
        this.nia = GenerateNIA();
    }

    public Estudiante(String name, String curs, String email){
        this.name = name;
        this.curs = curs;
        this.email = email;
        this.nia = GenerateNIA();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getNia() {
        return nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int GenerateNIA(){
        return this.nia = ++StudentCount;
    }

    public static int TotalStudents(){
        return StudentCount;
    }

    private boolean CheckEmail(){
        return this.email.matches(MAIL_FORMAT);
    }

    @Override
    public String toString(){
        return "Estudiante con NIA: " + this.nia + " con nombre "+ this.name + " en el curso " + this.curs + " con el email: " + this.email;
    }

}
