package org.example.RedesSociales;

public class AppRS {

    public static void main(String [] args){

        User u1 = new User("Jose",18,"Joselito19",150);
        Basic b1 = new Basic("Josebas",21,"JosebasElAutentico",12);
        Influencer i1 = new Influencer("Raul Delgado",18,"NanoLover",350);
        i1.addCollaborator("Casinos.com","PokerStart","CasinoCampello");
        Streamer s1 = new Streamer("Nacho",21,"Asuso14",100,10,100);

        u1.getInfo();
        System.out.println("\n");
        b1.getInfo();
        System.out.println("\n");
        i1.getInfo();
        System.out.println("\n");
        s1.getInfo();
    }

}
