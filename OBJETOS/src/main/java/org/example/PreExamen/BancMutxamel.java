package org.example.PreExamen;

import org.example.Practica1.Employee;

import java.util.Scanner;

public class BancMutxamel {

    public static void main(String[] args) {
        do {

        }while (Banc.principalMenu());
    }

public class Banc{
    static Scanner entry = new Scanner(System.in);

    public static boolean principalMenu(){

        System.out.println("MENU PRINCIPAL: ");
        System.out.println("[1] Mantenimiento de Clientes");
        System.out.println("[2] Mantenimiento de Cuentas");
        System.out.println("[X] Salir");
        String election = entry.next();

        switch (election){
            //case :
                //clientMenu();
                //break;
            //case :
                //break;
            case "X":
                System.out.println("Saliendo del programa...");
                return false;
            default:
                System.out.println("Has introducido un valor no valido");
                return false;
        }
        //return true;
    }

    public static void clientMenu(){
        System.out.println("CLIENTES:");
        System.out.println("[1]");
        System.out.println("[2]");
        System.out.println("[3]");
        System.out.println("[4]");
        System.out.println("[X]");
        String election = entry.next();

        switch (election){
            case "1" :

                break;
            case "2":

                break;
            case "X":
                System.out.println("Saliendo del la opcion...");
                principalMenu();
            break;
            default:
                System.out.println("Has introducido un valor no valido, volviendo al menu");
                principalMenu();
            break;
        }
    }

    public static String setName(){
        System.out.println("Introduce el nombre:");
        return entry.next();
    }

    public static String setSurname(){
        System.out.println("Introduce el nombre:");
        return entry.next();
    }
}
}
