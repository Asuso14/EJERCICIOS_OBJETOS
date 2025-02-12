package org.example.RedesSociales;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

@Setter @Getter
@ToString
public class Influencer extends User{

    private ArrayList<String> collaborators;

    public Influencer(String name, int age, String usrName, int followers) {
        super(name, age, usrName, followers);
        collaborators = new ArrayList<>();
    }

    public void addCollaborator(String ... colaborator){
        collaborators.addAll(Arrays.asList(colaborator));
    }

    public void getInfo(){
        System.out.println("Información Influencer:");
        super.getInfo();
        System.out.println("Colaboradores: " + collaborators.toString());
    }
}
