package org.example.lombok;

import lombok.*;

@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Estudiante {

    @NonNull
    private String name;
    private int age;
    private Curso curs;

}
