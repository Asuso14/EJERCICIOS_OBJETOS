package org.example.RedesSociales;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Streamer extends User{

    private int numStreams;
    private int hoursStreamed;

    public Streamer(String name, int age, String usrName, int followers, int numStreams, int hoursStreamed) {
        super(name, age, usrName, followers);
        this.numStreams = numStreams;
        this.hoursStreamed = hoursStreamed;
    }

    public void getInfo(){
        System.out.println("Información Streamer:");
        super.getInfo();
        System.out.println("Retasmisiones realizadas: " + getNumStreams());
        System.out.println("Horas de directo: " + getHoursStreamed());
    }
}
