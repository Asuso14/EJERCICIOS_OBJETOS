package org.example.StreamingApp;

public class PremiumPlan extends Suscripcion{


    public PremiumPlan(String planName, double price) {
        super(planName, price);
    }

    @Override
    public void obtainBenefices() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
    }

    @Override
    public void testPeriod() {
        System.out.println("14 días de prueba gratuita.");
    }
}
