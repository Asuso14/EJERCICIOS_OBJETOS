package org.example;

public class Editorial {
    private String name;
    private String country;

    public Editorial(){}
    public Editorial(String name, String country){
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return "[Editorial: " + "nombre=" +this.name + "país=" + this.country + "]";
    }
}
