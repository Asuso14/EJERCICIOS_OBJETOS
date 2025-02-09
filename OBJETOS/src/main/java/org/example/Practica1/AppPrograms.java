package org.example.Practica1;

public class AppPrograms {

    public static void main(String [] args){

        Channel LaUno = new Channel("LaUno");
        System.out.println(LaUno);

        Program ElFormiguero = new Program("El Formiguero", LaUno,"PerubianBoss");
        System.out.println(LaUno);

        ElFormiguero.addEmployee("Pablo Motos","Presentador",null);
        System.out.println(ElFormiguero.getEmployeesList());

        Employee PerubianBoss = new Employee("Pablo Motos","director",null);

        ElFormiguero.addEmployee("JosebasElAutentico","Presentador",PerubianBoss);
        ElFormiguero.addEmployee("Babilon","colaborador",PerubianBoss);
        ElFormiguero.addEmployee("ElBroncas","tecnico",PerubianBoss);

        ElFormiguero.addGuest("Lit killah", "trapero",1);
        ElFormiguero.addGuest("Lit killah", "trapero",3);
        ElFormiguero.addGuest("Lit killah", "trapero",4);
        ElFormiguero.addGuest("Lit killah", "trapero",2);
        System.out.println(ElFormiguero.getGuestsList());

        ElFormiguero.guestedAfter("Lit killah");
        ElFormiguero.guestedAfter("Jose Carlos");

        System.out.println(ElFormiguero);
        System.out.println(ElFormiguero.getEmployeesList());
        System.out.println(ElFormiguero.getGuestsList());
    }
}
