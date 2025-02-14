package org.example.Pokemon;

public class Water extends Pokemon{

    private byte canSwim;

    public Water(int level, int ps, byte canSwim) {
        super(level, ps);
        this.canSwim = canSwim;
    }


    @Override
    public void atack() {
        System.out.println("Pistola aguaa!!");
    }
}
