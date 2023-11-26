package vanier.andrei.dto;

public class Course {
    private final int MAX_STUDENT_NUM = 5;

    private static int nextId = 1;

    private String id;
    private String courseName;
    private double credit;

    private Department department;
    private Teacher teacher;
    private Student[] students;
    private int studentCount;

    public Course(String name, double credit, Department department) {

    }

    // Not sure if we can use lombok here
    @Override
    public String toString() {
        return "";
    }
}
