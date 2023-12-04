package vanier.andrei.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
public class Course {
    public static final int MAX_STUDENT_COUNT = 5;

    private static int nextId = 1;

    @Getter private String id;
    private String courseName;
    private double credit;

    private Department department;
    @Getter @Setter private Teacher teacher;
    @Getter @Setter private Student[] students;
    @Getter private int studentCount;

    public Course(String name, double credit, Department department) {

    }
}
