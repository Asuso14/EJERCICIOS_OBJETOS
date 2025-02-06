package org.example.lombok;

public class InstiMain {
    public static void main(String [] args){

        Instituto ies_mutxamel = new Instituto("IES MUTXAMEL");//Pruebas de creacion de Instituto.
        Instituto ies_berlanga = new Instituto(null);

        Curso programing = new Curso("Programacion",200);//Creacion correcta de Curso.
        Curso dataBase = new Curso("Base de datos", 150);
        Curso dataBaseCopy = new Curso("Base de datos",150);

        Estudiante student2 = new Estudiante("Jose",18,programing);//Creacion de Estudiante.
        try {//Este y los otros try catch son para captar el ingreso de nulls, de los Estudiantes.

            System.out.println(ies_mutxamel);

            Curso operativeSystem = new Curso(null,75);
            Estudiante student1 = new Estudiante("Pablo");
            Estudiante student3 = new Estudiante(null);

        }catch (NullPointerException error){//Si falla lo que hara es pasar este mensaje
            System.out.println("Has introducido un nombre nulo...");
        }

        try {//Este y los otros try catch son para captar el ingreso de nulls, de los add.

            ies_mutxamel.addCurs(null);
            ies_mutxamel.addCurs(programing);
            ies_mutxamel.addStudent(null);
            ies_mutxamel.addStudent(student2);

        }catch (NullPointerException error2){
            System.out.println("Has introducido un nombre nulo...");

        }
        //Aqui lo que voy a probar es cuando ingreso dos objetos iguales.
        ies_mutxamel.addCurs(dataBase);
        ies_mutxamel.addCurs(dataBaseCopy);
        System.out.println(ies_mutxamel);
        System.out.println(ies_berlanga);

        try {//Aqui voy a agregar Estudiantes.
            ies_mutxamel.addStudent(student2);
            ies_mutxamel.addStudent(null);
        }catch (NullPointerException error){
            System.out.println("Has introducido un nombre nulo...");
        }
    }
}
