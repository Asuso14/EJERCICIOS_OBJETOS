package org.example.StreamingApp;

public class StreamingApp {

    public static void main(String[] args) {

        Suscripcion[] plans = { new FreePlan("Gratis",0.0),
                new BasicPlan("Básico",9.99),
                new PremiumPlan("Premium",14.99),
                new FaminiliarPlan("Familiar",19.99)};

        for (Suscripcion sus : plans){
            sus.showInfo();
            sus.obtainBenefices();
            sus.testPeriod();
        }
    }
}
