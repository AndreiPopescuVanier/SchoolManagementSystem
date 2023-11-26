package vanier.andrei.dto;

public class SchoolManagementSystem {
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    public SchoolManagementSystem() {
        // TODO: move these somewhere better?
        final int maxDepartments = 5;
        final int maxStudents = 200;
        final int maxTeachers = 20;
        final int maxCourses = 30;

        this.departments = new Department[maxDepartments];
        this.students = new Student[maxStudents];
        this.teachers = new Teacher[maxTeachers];
        this.courses = new Course[maxCourses];
    }
}
