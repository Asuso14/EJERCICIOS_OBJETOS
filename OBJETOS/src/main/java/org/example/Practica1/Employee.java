package org.example.Practica1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Employee {

    private final String DEFAULT_CHARGE = "pte";
    private final String [] CHARGE_VALUES = {"director","tecnico","presentador","colaborador"};
    private int employeeNum;
    private String id;
    private String name;
    private String charge;
    private Employee director;

    public Employee(){};
    public Employee(String name){
        this.name = name;
        this.id = generateID();

    }
    public Employee(String name, String charge, Employee director){
        this.name = name;
        this.id = generateID();
        generateCharge(charge);
        setDirector(director);
    }

    public void setDirector(Employee director) {
        if (isDirector(this.charge)){
            this.director = null;
        }else {
            this.director = director;
        }
    }

    private String generateID(){
        ++employeeNum;
        if(employeeNum < 10){
            return "EP00" + employeeNum;
        } else if (employeeNum < 100) {
            return "EP0" + employeeNum;
        }else {
            return "EP" + employeeNum;
        }
    }

    private void generateCharge(String charge){
        boolean temp = false;
        for (String cha : CHARGE_VALUES){
            if (cha.equalsIgnoreCase(charge)){
                temp = true;
                this.charge = cha;
            }
        }
        if (!temp){
            this.charge = DEFAULT_CHARGE;
        }
    }

    private boolean isDirector(String charge){
        return charge.equalsIgnoreCase(CHARGE_VALUES[0]);
    }
}
