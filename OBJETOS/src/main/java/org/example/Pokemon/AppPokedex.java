package org.example.Pokemon;

public class AppPokedex {

    public static void main(String[] args) {

        Electric pikachu = new Electric(100,100);
        Pokemon pikachu2 = new Electric(30,21);
        Water squirtle =  new Water(30,21, "yes");
        Pokemon squirtle2 = new Water(15,12,"no");

        pikachu.atack();

    }
}
