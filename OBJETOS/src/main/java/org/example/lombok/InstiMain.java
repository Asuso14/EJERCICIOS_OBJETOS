package org.example.lombok;

public class InstiMain {
    public static void main(String [] args){

        Instituto ies_alluser = new Instituto("IES ALLUSER","MUTXAMEL");
        ies_alluser.getName();
        ies_alluser.getPopulation();
        System.out.println(ies_alluser.toString());
        try {
            Instituto ies_mutxamel = new Instituto(null);
        }catch (NullPointerException e){
            System.out.println("El nombre no puede ser nulo...");
        }

    }
}
