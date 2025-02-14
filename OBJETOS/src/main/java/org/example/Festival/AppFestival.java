package org.example.Festival;

public class AppFestival {
    public static void main(String[] args){

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");
        Organizador or1 = new Organizador("Jose Fernandez",21,"Staff");
        Persona a2 = new Asistente("Joser",24,"VIP");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();
        a2.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println("Información del Organizador:");
        or1.mostrarInfo();

        Persona artista = new Artista("Sofía", 25, "Rock Alternativo");
        Persona asistente = new Asistente("Lucas", 18, "VIP");
        Persona organizador = new Organizador("Martín", 30, "Producción");

        mostrarAcceso(artista);
        mostrarAcceso(asistente);
        mostrarAcceso(organizador);
    }

    public static void mostrarAcceso(Persona persona){
        persona.accederEvento();
    }
}
