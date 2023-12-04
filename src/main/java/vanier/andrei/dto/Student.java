package vanier.andrei.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
public class Student {
    public static final int MAX_COURSE_COUNT = 5;

    private static int nextId = 1;

    @Getter private String id;
    private String firstName;
    private String lastName;
    private Department department;

    @Getter @Setter private Course[] courses;
    @Getter private int courseCount;

    public Student(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.id = "S" + String.format("%03d", nextId++);
    }
}
