package org.example;

public class AplicacionTV {
    public static void main(String[] TVApp){

        TV tv1 = new TV(35,24);
        TV tv2 = new TV(1,56);
        TV tv3 = new TV(10,98);
        TV tv4 = new TV(54,66);

        System.out.println(tv1.getChannel());
        tv1.downChannel();
        tv2.uploadChannel();
        tv3.setChannel(100);
        tv3.setChannel(35);
        System.out.println("Canal cambiado: " + tv3.getChannel());
        tv4.setVolume(13);
    }
}
