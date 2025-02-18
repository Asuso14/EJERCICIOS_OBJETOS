package org.example.Pokemon;

public class Water extends Pokemon implements AtaquesAgua{

    private String canSwim;

    public Water(int level, int ps, String canSwim) {
        super(level, ps);
        this.canSwim = canSwim;
    }

    @Override
    public void atack() {
        System.out.println("Pistola aguaa!!");
    }

    @Override
    public void hidroBomba() {
        System.out.println("HIDROBOOOMBAAA");
    }

    @Override
    public void surf() {
        System.out.println("COJO UNA OLAAA");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("FLUSH FLUSH");
    }

    @Override
    public void salpicadura() {
        System.out.println("PLOP");
    }
}
