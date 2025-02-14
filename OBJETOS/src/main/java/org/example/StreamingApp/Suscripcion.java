package org.example.StreamingApp;

abstract class Suscripcion {

    private String planName;
    private double price;

    public Suscripcion(String planName, double price){
        this.planName = planName;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Nombre del plan: " + planName + ", Precio: " + price + "€");
    }

    public abstract void obtainBenefices();

    public abstract void testPeriod();
}
