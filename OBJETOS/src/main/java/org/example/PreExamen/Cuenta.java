package org.example.PreExamen;

import java.util.ArrayList;

public class Cuenta {
    int count;
    private String iban;
    Cliente holder;
    double amount;
    private ArrayList<Cuenta> countsList;

    public Cuenta(){

        this.iban = generateIban();
        this.holder = null;
        this.amount = 0;
        this.countsList = new ArrayList<>();
        countsList.add(this);
    }

    private String generateIban(){
        ++count;
        return String.format("ES%X3d",count);
    }


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Cliente getHolder() {
        return holder;
    }

    public void setHolder(Cliente holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", amount=" + amount +
                '}';
    }
}
