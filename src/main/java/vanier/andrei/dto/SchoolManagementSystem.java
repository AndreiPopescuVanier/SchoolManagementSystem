package vanier.andrei.dto;

import java.util.Arrays;

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
        int indexOfFirstNullDept = 0;

        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                indexOfFirstNullDept = i;
                break;
            }
        }

        if (indexOfFirstNullDept == MAX_DEPARTMENTS - 1) {
            System.out.println("Max department count reached, add a new department failed");
            return;
        }

        Department newDept = new Department(deptName);
        departments[indexOfFirstNullDept] = newDept;
        System.out.printf("Added department %s successfully!\n", newDept);
    }

    /**
     * Creates a student on the school system, with a maximum count of 200.
     * @param firstName First name of student
     * @param lastName Last name of student
     * @param departmentId Department ID of student (Dxxx)
     */
    public void addStudent(String firstName, String lastName, String departmentId) {
        int indexOfFirstNullStudent = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                indexOfFirstNullStudent = i;
                break;
            }
        }

        if (indexOfFirstNullStudent == MAX_STUDENTS - 1) {
            System.out.println("Max student count reached, add a new student failed");
            return;
        }

        Department departmentOfStudent = findDepartment(departmentId);

        if (departmentOfStudent == null) {
            System.out.printf("Could not find department ID %s, add a new student failed\n", departmentId);
            return;
        }

        Student newStudent = new Student(firstName, lastName, departmentOfStudent);
        students[indexOfFirstNullStudent] = newStudent;
        System.out.printf("Added student %s successfull!", newStudent);
    }

    /**
     * Creates a course on the school system, with a maximum count of 30.
     * @param name Name of the course
     * @param credit Credits the course is worth
     * @param departmentId Department ID of the course (Dxxx)
     */
    public void addCourse(String name, double credit, String departmentId) {
        int indexOfFirstNullCourse = 0;

        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                indexOfFirstNullCourse = i;
                break;
            }
        }

        if (indexOfFirstNullCourse == MAX_COURSES - 1) {
            System.out.println("Max course count reached, add a new course failed");
            return;
        }

        Department departmentOfCourse = findDepartment(departmentId);

        if (departmentOfCourse == null) {
            System.out.printf("Could not find department ID %s, add a new course failed\n", departmentId);
            return;
        }

        Course newCourse = new Course(name, credit, departmentOfCourse);
        courses[indexOfFirstNullCourse] = newCourse;
        System.out.printf("Added course %s successfully!\n", newCourse);
    }

    /**
     * Creates a teacher on the school system, with a maximum count of 20.
     * @param firstName First name of teacher
     * @param lastName Last name of teacher
     * @param departmentId Department ID of the teacher (Dxxx)
     */
    public void addTeacher(String firstName, String lastName, String departmentId) {
        int indexOfFirstNullTeacher = 0;

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                indexOfFirstNullTeacher = i;
                break;
            }
        }

        if (indexOfFirstNullTeacher == MAX_TEACHERS - 1) {
            System.out.println("Max teacher count reached, add a new teacher failed");
            return;
        }

        Department departmentOfTeacher = findDepartment(departmentId);

        if (departmentOfTeacher == null) {
            System.out.printf("Could not find department ID %s, add a new teacher failed\n", departmentId);
            return;
        }

        Teacher newTeacher = new Teacher(firstName, lastName, departmentOfTeacher);
        teachers[indexOfFirstNullTeacher] = newTeacher;
        System.out.printf("Added teacher %s successfully!", newTeacher);
    }

    /**
     * Finds department by ID and returns it.
     * @param id ID of department (Dxxx)
     * @return Department with matching ID or Null if not found
     */
    public Department findDepartment(String id) {
        for (Department department : departments) {
            // given our array is filled left to right, and we cannot remove departments,
            // first null indicates the dept does not exist
            if (department == null) {
                return null;
            }

            if (department.getId().equals(id)) {
                return department;
            }
        }

        return null;
    }

    /**
     * Finds student by ID and returns it.
     * @param id ID of student (Sxxx)
     * @return Student with matching ID or Null if not found
     */
    public Student findStudent(String id) {
        for (Student student : students) {
            // given our array is filled left to right, and we cannot remove students,
            // first null indicates the student does not exist
            if (student == null) {
                return null;
            }

            if (student.getId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    /**
     * Finds course by ID and returns it.
     * @param id ID of course (Cxxx)
     * @return Course with matching ID or Null if not found
     */
    public Course findCourse(String id) {
        for (Course course : courses) {
            // given our array is filled left to right, and we cannot remove courses,
            // first null indicates the course does not exist
            if (course == null) {
                return null;
            }

            if (course.getId().equals(id)) {
                return course;
            }
        }

        return null;
    }

    /**
     * Finds Teacher by ID and returns it.
     * @param id ID of teacher (Txxx)
     * @return Teacher with matching ID or Null if not found
     */
    public Teacher findTeacher(String id) {
        for (Teacher teacher : teachers) {
            // given our array is filled left to right, and we cannot remove teachers,
            // first null indicates the teacher does not exist
            if (teacher == null) {
                return null;
            }

            if (teacher.getId().equals(id)) {
                return teacher;
            }
        }

        return null;
    }

    /**
     * Prints all existing departments.
     */
    public void printDepartments() {
        for (Department department : departments) {
            if (department == null) {
                return;
            }

            System.out.println(department);
        }
    }

    /**
     * Prints all existing courses.
     */
    public void printCourses() {
        for (Course course : courses) {
            if (course == null) {
                return;
            }

            System.out.println(course);
        }
    }

    /**
     * Prints all existing students.
     */
    public void printStudents() {
        for (Student student : students) {
            if (student == null) {
                return;
            }

            System.out.println(student);
        }
    }

    /**
     * Prints all existing teachers.
     */
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher == null) {
                return;
            }

            System.out.println(teacher);
        }
    }

    /**
     * Registers a student on a course.
     * @param studentId Student ID (Sxxx) of student to register
     * @param courseId Course ID (Cxxx) of course to register student to
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        if (student == null) {
            System.out.printf("Could not register course, student ID %s does not exist\n", studentId);
            return;
        }

        Course course = findCourse(courseId);
        if (course == null) {
            System.out.printf("Could not register course, course ID %s does not exist\n", courseId);
            return;
        }

        if (student.getCourseCount() == Student.MAX_COURSE_COUNT) {
            System.out.println("Could not register course, student already has maximum course count");
            return;
        }

        if (course.getStudentCount() == Course.MAX_STUDENT_COUNT) {
            System.out.println("Could not register course, course already has maximum student count");
            return;
        }

        Course[] currentCourses = student.getCourses();
        currentCourses[student.getCourseCount()] = course;
        student.setCourses(currentCourses);

        Student[] currentStudents = course.getStudents();
        currentStudents[course.getStudentCount()] = student;
        course.setStudents(currentStudents);

        System.out.println("Registered student with course successfully!");
        System.out.printf("Latest student info: %s\n", student);
        System.out.printf("Latest course info: %s\n", course);
    }

    /**
     * Modify the teacher of a course.
     * @param newTeacherId New teacher ID (Txxx) of course.
     * @param courseId Course ID to modify teacher of.
     */
    public void modifyCourseTeacher(String newTeacherId, String courseId) {
        Teacher teacher = findTeacher(newTeacherId);
        if (teacher == null) {
            System.out.printf("Could not assign teacher, teacher ID %s does not exist\n", newTeacherId);
            return;
        }

        Course course = findCourse(courseId);
        if (course == null) {
            System.out.printf("Could not assign teacher, course ID %s does not exist\n", courseId);
            return;
        }

        course.setTeacher(teacher);
        System.out.printf("%s teacher info updated successfully!\n", course);
    }
}
