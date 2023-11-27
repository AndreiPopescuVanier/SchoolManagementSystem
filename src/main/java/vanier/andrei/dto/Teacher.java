package vanier.andrei.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
public class Teacher {
    private static int nextId = 1;

    @Getter private String id;
    private String firstName;
    private String lastName;
    private Department department;

    public Teacher(String firstName, String lastName, Department department) {

    }
}
