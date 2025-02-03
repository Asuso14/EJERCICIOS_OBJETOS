package org.example.Practica1;

public class Employee {

    private final String DEFAULT_CHARGE = "pte";
    private final String [] CHARGE_VALUES = {"director","tecnico","presentador","colaborador"};
    private int employeeNum;
    private String id;
    private String name;
    private String charge;
    private Employee director;

    public Employee(){};
    public Employee(String name, String charge, Employee director){
        this.name = name;
        this.id = generateID();
        generateCharge(charge);
        generateDirector(director);
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {
        this.director = director;
    }

    private String generateID(){
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

    private void generateDirector(Employee director){
        if (this.charge.equalsIgnoreCase(CHARGE_VALUES[0])){
            this.director = null;
        }else {
            this.director = director;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNum=" + employeeNum +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", charge='" + charge + '\'' +
                ", director=" + director +
                '}';
    }
}
