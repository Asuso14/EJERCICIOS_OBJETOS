package org.example.lombok;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Curso {

    @NonNull
    private String name;
    private int hours;


}
