package org.example.lombok;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@AllArgsConstructor
@Getter
@ToString
public class Instituto {

    @NonNull
    private String name;
    @Setter
    String population;
    @Setter
    private String address;
    @Setter
    private ArrayList<Curso> cursList;
    @Setter
    private ArrayList<Estudiante> studentList;

    public Instituto(String name){

        this.name = Objects.requireNonNullElse(name,"Instituto sin nombre");
        this.cursList = new ArrayList<>();
        this.studentList = new ArrayList<>();

    }

    @NonNull
    public void addCurs(Curso curs){

        if (curs != null ||  checkCurs(curs.getName(),curs.getHours())){
            cursList.add(curs);
        }else {
            System.out.println("Formato incorrecto, ya existe el curso o es nulo...");
        }

    }

    public void addStudent(Estudiante student){

        if (student != null){
            studentList.add(student);
        }else {
            System.out.println("No puede ser nulo...");
        }

    }

    private boolean checkCurs(String name, int hours){

        boolean status = true;
        for (Curso cur : cursList){
            if (name.equalsIgnoreCase(cur.getName()) && hours == cur.getHours()) {
                status = false;
                break;
            }
        }
        return status;

    }
}
