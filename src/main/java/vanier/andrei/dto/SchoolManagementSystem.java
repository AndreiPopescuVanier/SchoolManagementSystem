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

    public void addDepartment(String deptName) {

    }

    public void addStudent(String firstName, String lastName, String departmentId) {

    }

    public void addCourse(String name, double credit, String departmentId) {

    }

    public void addTeacher(String firstName, String lastName, String departmentId) {

    }

    public Department findDepartment(String id) {

    }

    public Student findStudent(String id) {

    }

    public Course findCourse(String id) {

    }

    public Teacher findTeacher(String id) {

    }

    public void printDepartments() {

    }

    public void printCourses() {

    }

    public void printStudents() {

    }

    public void printTeachers() {

    }

    public void registerCourse(String studentId, String courseId) {

    }

    public void modifyCourseTeacher(String teacherIdToModify, String newCourseId) {

    }
}
