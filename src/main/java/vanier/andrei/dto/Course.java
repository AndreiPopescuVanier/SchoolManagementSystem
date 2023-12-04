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
    @Getter private Student[] students;
    @Getter private int studentCount;

    public Course(String name, double credit, Department department) {
        this.courseName = name;
        this.credit = credit;
        this.department = department;
        this.id = "C" + String.format("%03d", nextId++);
    }

    public void setStudents(Student[] students) {
        this.students = students;

        for (int i = 0; i < students.length; i++) {
            // Because our array is gap-less, first null indicates end
            if (students[i] == null) {
                studentCount = i + 1;
                return;
            }
        }
    }
}
