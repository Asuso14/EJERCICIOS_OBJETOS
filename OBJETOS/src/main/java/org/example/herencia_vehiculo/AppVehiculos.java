package org.example.herencia_vehiculo;

public class AppVehiculos {

    public static void main(String[] args){

        Avion airbus = new Avion("Airbus","1234DKF",2);
        Tren ave = new Tren("Ave","R9876FGH",8);
        airbus.printInfo();
        ave.printInfo();
        airbus.ruido();
        ave.ruido();
    }
}
