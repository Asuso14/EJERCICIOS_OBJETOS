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

    public void getMarketList() {
        if (checkList()){
            System.out.println("La lista esta vacia, no puedo mostrar nada");
        }else {
            StringBuilder temp;
            temp = new StringBuilder();
            for (String list : marketList) temp.append(list).append(",");
            System.out.println(temp);
        }
    }

    private boolean searchProduct(String product){
        return marketList.contains(product);
    }

    public void checkProduct(String product){
        if (searchProduct(product)){
            System.out.println("El producto esta dado de alta.");
        }else {
            System.out.println("El producto no esta dado de alta.");
        }
    }

    public void getPosMarketList(int pos){
        System.out.println(this.marketList.get(pos));
    }

    public void changeValueOfList(int pos, String value){
        if (searchProduct(value)){
            System.out.println("El producto ya esta dado de alta.");
        }else {
            this.marketList.add(pos, value);
        }
    }

    public int numOfProducts(){
        return this.marketList.size();
    }

    public void setMarketList(String product) {
        if (searchProduct(product)){
            System.out.println("El producto ya esta dado de alta.");
        }else {
            this.marketList.add(product);
        }
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

    public void numToAdd(int num){
        if (num > 0){
            System.out.println("Introduce producto: ");
            setMarketList(entry.next());
            numToAdd(--num);
        }
    }

    public void listSimiles(SupermarketList list){
        if (checkSimile(list)){
            System.out.println("Las dos listas son iguales.");
        }else {
            System.out.println("Las dos listas no son iguales.");
        }
    }

    private boolean checkSimile(SupermarketList list){
        return this.marketList.equals(list);
    }

    public void cleanList(){
        this.marketList.clear();
    }

    public void cloneList(){
       Object temp = this.marketList.clone();
       return temp;
    }

    public static void main (String[] args) throws CloneNotSupportedException {

        SupermarketList list1 = new SupermarketList();
        list1.emptyList();
        list1.emptyList();
        SupermarketList list2 = new SupermarketList();
        list2.numToAdd(2);
        list2.getMarketList();
        list1.getMarketList();
        System.out.println(list2.numOfProducts());
        System.out.println(list1.numOfProducts());
        SupermarketList list3 = new SupermarketList();

    }
}