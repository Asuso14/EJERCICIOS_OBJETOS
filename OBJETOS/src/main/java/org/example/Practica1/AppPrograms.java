package org.example.Practica1;

public class AppPrograms {

    public static void main(String [] args){

        Channel LaUno = new Channel("LaUno");//Creamos canal
        System.out.println(LaUno);

        Program ElFormiguero = new Program("El Formiguero", LaUno,"PerubianBoss");//Creamos programa con un director
        System.out.println(LaUno);

        ElFormiguero.addEmployee("Pablo Motos","Presentador",null);//Añadimos un empleado con director null.
        System.out.println(ElFormiguero.getEmployeesList());

        Employee PerubianBoss = new Employee("Pablo Motos","director",null);//Creamos a un empleado director.

        ElFormiguero.addEmployee("JosebasElAutentico","Presentador",PerubianBoss);//Añadimos empleados con el empleado creado antes,
        // no encontre la forma de referenciarlo de otra forma que creandolo aqui.
        ElFormiguero.addEmployee("Babilon","colaborador",PerubianBoss);
        ElFormiguero.addEmployee("ElBroncas","tecnico",PerubianBoss);

        ElFormiguero.addGuest("Lit killah", "trapero",1);//Ingresamos invitados.
        ElFormiguero.addGuest("Lit killah", "trapero",3);
        ElFormiguero.addGuest("Lit killah", "trapero",4);
        ElFormiguero.addGuest("Lit killah", "trapero",2);
        System.out.println(ElFormiguero.getGuestsList());

        ElFormiguero.guestedAfter("Lit killah");//Comprobamos si han sido invitados antes.
        ElFormiguero.guestedAfter("Jose Carlos");

        System.out.println(ElFormiguero);//Imprimimos info del programa.
        System.out.println(ElFormiguero.getEmployeesList());
        System.out.println(ElFormiguero.getGuestsList());
    }
}
