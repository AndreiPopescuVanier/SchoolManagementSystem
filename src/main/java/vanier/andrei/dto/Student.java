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

    @Getter @ToString.Exclude Course[] courses;
    @Getter private int courseCount;

    public Student(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.id = "S" + String.format("%03d", nextId++);
        this.courses = new Course[MAX_COURSE_COUNT];
        this.courseCount = 0;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;

        for (int i = 0; i < courses.length; i++) {
            // Because our array is gap-less, first null indicates end
            if (courses[i] == null) {
                courseCount = i + 1;
                return;
            }
        }
    }
}
