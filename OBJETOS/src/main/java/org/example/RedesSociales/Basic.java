package org.example.RedesSociales;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Basic extends User{

    public Basic(String name, int age, String usrName, int followers) {
        super(name, age, usrName, followers);
    }

    public void getInfo(){
        System.out.println("Información Persona Normal:");
        super.getInfo();
    }
}
