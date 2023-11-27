package vanier.andrei.dto;

public class SchoolManagementSystem {
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    private final static int MAX_DEPARTMENTS = 5;
    private final static int MAX_STUDENTS = 200;
    private final static int MAX_TEACHERS = 20;
    private final static int MAX_COURSES = 30;

    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENTS];
        this.students = new Student[MAX_STUDENTS];
        this.teachers = new Teacher[MAX_TEACHERS];
        this.courses = new Course[MAX_COURSES];
    }

    /**
     * Creates a department on the school system, with a maximum count of 5.
     * @param deptName Name of the new department to create
     */
    public void addDepartment(String deptName) {

    }

    /**
     * Creates a student on the school system, with a maximum count of 200.
     * @param firstName First name of student
     * @param lastName Last name of student
     * @param departmentId Department ID of student (Dxxx)
     */
    public void addStudent(String firstName, String lastName, String departmentId) {

    }

    /**
     * Creates a course on the school system, with a maximum count of 30.
     * @param name Name of the course
     * @param credit Credits the course is worth
     * @param departmentId Department ID of the course (Dxxx)
     */
    public void addCourse(String name, double credit, String departmentId) {

    }

    /**
     * Creates a teacher on the school system, with a maximum count of 20.
     * @param firstName First name of teacher
     * @param lastName Last name of teacher
     * @param departmentId Department ID of the teacher (Dxxx)
     */
    public void addTeacher(String firstName, String lastName, String departmentId) {

    }

    /**
     * Finds department by ID and returns it.
     * @param id ID of department (Dxxx)
     * @return Department with matching ID or Null if not found
     */
    public Department findDepartment(String id) {

    }

    /**
     * Finds student by ID and returns it.
     * @param id ID of student (Sxxx)
     * @return Student with matching ID or Null if not found
     */
    public Student findStudent(String id) {

    }

    /**
     * Finds course by ID and returns it.
     * @param id ID of course (Cxxx)
     * @return Course with matching ID or Null if not found
     */
    public Course findCourse(String id) {

    }

    /**
     * Finds Teacher by ID and returns it.
     * @param id ID of teacher (Txxx)
     * @return Teacher with matching ID or Null if not found
     */
    public Teacher findTeacher(String id) {

    }

    /**
     * Prints all existing departments.
     */
    public void printDepartments() {

    }

    /**
     * Prints all existing courses.
     */
    public void printCourses() {

    }

    /**
     * Prints all existing students.
     */
    public void printStudents() {

    }

    /**
     * Prints all existing teachers.
     */
    public void printTeachers() {

    }

    /**
     * Registers a student on a course.
     * @param studentId Student ID (Sxxx) of student to register
     * @param courseId Course ID (Cxxx) of course to register student to
     */
    public void registerCourse(String studentId, String courseId) {

    }

    /**
     * Modify the teacher of a course.
     * @param newTeacherId New teacher ID (Txxx) of course.
     * @param courseId Course ID to modify teacher of.
     */
    public void modifyCourseTeacher(String newTeacherId, String courseId) {

    }
}
