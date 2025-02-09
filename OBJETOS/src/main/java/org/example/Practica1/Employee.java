package org.example.Practica1;

public class Employee {

    private final String DEFAULT_CHARGE = "pte";
    private final String [] CHARGE_VALUES = {"director","tecnico","presentador","colaborador"};
    private static int employeeNum;
    private String id;
    private String name;
    private String charge;
    private Employee director;

    public Employee(){}

    public Employee(String name, String charge, Employee director){
        this.id = generateID();
        this.name = name;
        generateCharge(charge);
        this.director = isDirector(director);
    }

    //Genera una id, cuando se hace se suma 1 a la anterior id.
    private String generateID(){
        ++employeeNum;
        return String.format("EP%03d",employeeNum);
    }

    //Aqui recorre el array con los posibles puestos registrados. Si no coincide con
    // ninguno pondra el caracter por defecto.
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

    //Si el cargo es director dejara el director en nulo. Sino pondra el valor que se asigne en el constructor.
    private Employee isDirector(Employee director){
        return charge.equalsIgnoreCase(CHARGE_VALUES[0]) ? null : director;
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

    @Override
    public String toString() {
        return "Employee: [ id=" + id +
                ", name=" + name +
                ", charge=" + charge +
                ", director=" + director +
                "]";
    }
}