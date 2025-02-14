package org.example.Festival;

public class Artista extends Persona{

    String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    public void accederEvento(){
        System.out.println("Accediendo como artista: Preparando el show");
    }

}
