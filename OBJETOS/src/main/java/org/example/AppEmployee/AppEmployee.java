
package org.example.AppEmployee;

import java.util.ArrayList;

public class AppEmployee {

    private ArrayList<Employee> employeesList;

    public AppEmployee(){
        employeesList = new ArrayList<>();
        employeesList.add(new Programmer());
        employeesList.add(new Designer());
        employeesList.add(new Manager());
        printInfo();
    }

    public void assignEmployee(Employee employee){

        System.out.println("=== Usando el método asignarTarea() ===");
        System.out.println("Asignando tarea al empleado...");
        employee.doTask();
    }

    public void printInfo(){

        System.out.println("=== Usando el método array polimórfico");
        for (Employee emp : employeesList){
            emp.doTask();
        }

    }

    public static void main(String[] args) {


        AppEmployee app = new AppEmployee();

        Employee d1 = new Designer();
        Employee p1 = new Programmer();
        app.assignEmployee(d1);
        app.assignEmployee(p1);

    }

}
