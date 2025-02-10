package org.example.PreExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    static Scanner entry = new Scanner(System.in);
    int count;
    private int id;
    private String name;
    private String surnames;
    private ArrayList<Cliente> clientList;

    public Cliente(){
        this.id = generateID();
        getAttributes();
        this.clientList = new ArrayList<>();
        clientList.add(this);
    }

    private int generateID(){
        return ++count;
    }

    public void getAttributes(){
        System.out.println("Introduce tu nombre:");
        this.name = entry.next();
        System.out.println("Introduce tu apellido:");
        this.surnames = entry.next();
    }

    public void addClient(Cliente cliente){
        clientList.add(cliente);
    }

    public void removeClient(String name, String surnames){
        Cliente client = searchClient(name,surnames);
        if ( client == null){
            System.out.println("El cliente no existe");
        }else {
            clientList.remove(client);
        }
    }

    public Cliente searchClient(String name, String surnames){
        for (Cliente cli : clientList){
            if (cli.getName().equalsIgnoreCase(name) && cli.getSurnames().equalsIgnoreCase(surnames)){
                return cli;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                '}';
    }
}
