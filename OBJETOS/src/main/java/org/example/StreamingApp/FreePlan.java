package org.example.StreamingApp;

public class FreePlan extends Suscripcion{


    public FreePlan(String planName, double price) {
        super(planName, price);
    }

    @Override
    public void obtainBenefices() {
        System.out.println("Acceso limitado con anuncios.");
    }

    @Override
    public void testPeriod() {
        System.out.println("Sin periodo de prueba");
    }
}
