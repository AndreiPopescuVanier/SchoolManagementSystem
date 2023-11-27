package vanier.andrei.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
public class Student {
    private final int MAX_COURSE_COUNT = 5;

    private static int nextId = 1;

    @Getter private String id;
    private String firstName;
    private String lastName;
    private Department department;

    private Course[] courses;
    private int courseCount;

    public Student(String firstName, String lastName, Department department) {

    }
}
