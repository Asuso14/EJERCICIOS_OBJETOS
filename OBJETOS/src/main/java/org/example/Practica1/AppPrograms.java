package org.example.Practica1;

public class AppPrograms {

    public void main(String [] args){

        Channel LaUno = new Channel("LaUno");
        Channel MediaSer = new Channel("MediaSer");
        Program ElFormiguero = new Program("ElFormiguero",LaUno,15);
        Program LaRebelion = new Program("LaRebelion",MediaSer,8);
    }

}
