package vanier.andrei.dto;

public class Student {
    private final int MAX_COURSE_COUNT = 5;

    private static int nextId = 1;

    private String id;
    private String firstName;
    private String lastName;
    private Department department;

    private Course[] courses;
    private int courseCount;

    // Not sure if we can use lombok here
    @Override
    public String toString() {
        return "";
    }
}
