package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SupermarketList{

    static Scanner entry = new Scanner(System.in);

    private ArrayList <String> marketList = new ArrayList<>();

    public SupermarketList(){}
    public SupermarketList(String value){
        marketList.add(value);
    }

    public ArrayList<String> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<String> marketList) {
        this.marketList = marketList;
    }

    public void emptyList(){
        if(checkList()){
            System.out.println("Introduce un producto de la lista: ");
            marketList.add(entry.next());
        }else {
            System.out.println("La lista no esta vacia...");
        }
    }

    public boolean checkList (){
        return marketList.isEmpty();
    }

    public static void main (String[] args){

        SupermarketList list1 = new SupermarketList();
        list1.emptyList();
        list1.emptyList();
    }
}
