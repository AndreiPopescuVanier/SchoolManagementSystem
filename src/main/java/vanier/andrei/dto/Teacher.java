package vanier.andrei.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
public class Teacher {
    private static int nextId = 1;

    @Getter private String id;
    private String firstName;
    private String lastName;
    @Getter private Department department;

    public Teacher(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.id = "T" + String.format("%03d", nextId++);
    }
}
