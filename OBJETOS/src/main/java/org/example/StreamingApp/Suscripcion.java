package org.example.StreamingApp;

abstract class Suscripcion {

    private String planName;
    private double price;

    public void showInfo(){
        System.out.println("Nombre del plan: " + planName + ", Precio: " + price);
    }

    abstract void obtainBenefices();

}
