package org.example.Pokemon;

public class Electric extends Pokemon{

    public Electric(int level, int ps) {
        super(level, ps);

    }

    @Override
    public void atack() {
        System.out.println("Impactruenoo!!");
    }
}
