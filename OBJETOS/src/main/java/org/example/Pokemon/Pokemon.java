package org.example.Pokemon;

abstract class Pokemon {

    private int level;
    private int ps;

    public Pokemon(int level, int ps){

        this.level = level;
        this.ps = ps;

    }

    public abstract void atack();

    public void pokemonInfo(){
        System.out.println("Nivel = " + level + ", vida = " + ps);
    }
}
