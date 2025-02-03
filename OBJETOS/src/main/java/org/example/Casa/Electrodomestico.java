package org.example.Casa;

public class Electrodomestico {

    private String name;
    private double kWhConsume;

    public Electrodomestico(){}
    public Electrodomestico(String name, double kWhConsume){
        this.name = name;
        this.kWhConsume = kWhConsume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, double kwh) {
        this.name = name;
        this.kWhConsume = kwh;
    }

    public double getkWhConsume() {
        return kWhConsume;
    }

    public void setkWhConsume(double kWhConsume) {
        this.kWhConsume = kWhConsume;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "name='" + name + '\'' +
                ", kWhConsume=" + kWhConsume +
                '}';
    }

}
