package org.example.Casa;
import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    static Scanner entry = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private Propietario owner;

    public Casa(){}
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setOwner();

    }

    public Propietario getOwner() {
        return owner;
    }

    public void setOwner(Propietario owner) {
        this.owner = owner;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static Scanner getEntry() {
        return entry;
    }

    public static void setEntry(Scanner entry) {
        Casa.entry = entry;
    }

    public void agregarHabitacion(String nombre, double m2) {
        for (Habitacion hab : habitaciones){
            if (hab.getNombre().equals(nombre)){
                System.out.println("La habitación ya existe");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, m2); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void setOwner(){
        System.out.println("Inserte Propietario/a");
        String name = entry.next();
        System.out.println("Inserte edad:");
        int age = entry.nextInt();
        owner = new Propietario(name,age);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene" + habitaciones.size() +"habitaciones");
        for (Habitacion hab : habitaciones){
            System.out.println("Nombre=" + hab.getNombre() + "( " + hab.getM2() + " )m2");
        }
    }

    public Habitacion getBiggerRom(){
        Habitacion bigger = habitaciones.get(0);
        for (Habitacion hab : habitaciones){
            if (hab.getM2() > bigger.getM2()){
                bigger = hab;
            }
        }
        return bigger;
    }

    public void deleteRoom(String name){
        for (Habitacion hab : habitaciones){
            if(hab.getNombre().equals(name)){
                habitaciones.remove(hab);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Casa: [" + "direccion='" + getDireccion() + '\'' + ", habitaciones=" + getDireccion() + ", owner=" + getOwner() + ']';
    }
}
