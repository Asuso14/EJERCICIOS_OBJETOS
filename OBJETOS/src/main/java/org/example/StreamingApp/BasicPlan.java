package org.example.StreamingApp;

public class BasicPlan extends Suscripcion{

    public BasicPlan(String planName, double price) {
        super(planName, price);
    }

    @Override
    public void obtainBenefices() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    public void testPeriod() {
        System.out.println("30 días de prueba gratuita.");
    }
}
