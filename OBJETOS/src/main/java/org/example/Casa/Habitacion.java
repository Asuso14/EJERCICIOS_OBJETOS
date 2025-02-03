package org.example.Casa;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double m2;
    private ArrayList<Electrodomestico> appliance;

    public Habitacion(String nombre, double m2) {
        this.nombre = nombre;
        this.m2 = m2;
        this.appliance = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public void addAppliance(String name, double kWh) {
        for (Electrodomestico ele : appliance){
            if (ele.getName().equals(name)){
                System.out.println("La habitación ya existe");
                return;
            }
        }
        Electrodomestico appliance = new Electrodomestico(name, kWh);
        this.appliance.add(appliance);
    }

    @Override
    public String toString() {
        return "Habitación: [ nombre=" + this.nombre + ", MetrosCuadrados " + this.m2 + "]";
    }
}
