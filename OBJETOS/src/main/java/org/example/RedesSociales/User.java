package org.example.RedesSociales;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
public class User {
    private String name;
    private int age;
    private String usrName;
    private int followers;

    public User(String name, int age, String usrName, int followers){
        this.name = name;
        this.age = age;
        this.usrName = usrName;
        this.followers = followers;
    }

    public void getUserInfo(){
        System.out.println("Información del Usuario: ");
        getInfo();
    }

    public void getInfo(){
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Nombre de usuario: @" + getUsrName());
        System.out.println("Seguidores: " + getFollowers());
    }
}
