package org.example.StreamingApp;

public class FaminiliarPlan extends Suscripcion{


    public FaminiliarPlan(String planName, double price) {
        super(planName, price);
    }

    @Override
    public void obtainBenefices() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }

    @Override
    public void testPeriod() {
        System.out.println("7 días de prueba para cuentas nuevas.");
    }
}
