package org.example.Equipos;

import java.util.ArrayList;

public class Equipo {

    private String name;
    private ArrayList<Persona> comps;

    public Equipo(){}
    public Equipo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Persona> getComps() {
        return comps;
    }

    public void setComps(ArrayList<Persona> comps) {
        this.comps = comps;
    }

    public void addPerson(Persona person){
        this.comps.add(person);
    }

    public void removePerson(Persona person){
        this.comps.remove(person);
    }

    @Override
    public String toString(){
        return "Equipo: [ nombre=" + this.name + ", componente=" + this.comps +"]";
    }

}
