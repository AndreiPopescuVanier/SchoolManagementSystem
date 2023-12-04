package vanier.andrei;

// BONUS POINTS ASSIGNED IF:
// 5.n.iv:  If the course has be registered by the student already, it cannot be registered again, print a message.
// 9.f: Student register course failed, student has registered that course

import vanier.andrei.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem();

        // Test adding departments
        sms.addDepartment("Computer Science");
        sms.addDepartment("Social Science");
        sms.addDepartment("Mathematics");
        sms.addDepartment("Computer Technology");
        sms.addDepartment("Music");
        sms.addDepartment("Literature"); // Should give error message

        // Test printing departments
        sms.printDepartments();

        // Test adding students
        sms.addStudent("John", "Doe", "D002");
        sms.addStudent("Jane", "Doe", "D003");

        // Test printing students
        sms.printStudents();

        // Test adding maximum students, should give error message with commented line below
        // int testMaxStudentsLimit = 199;
        int testMaxStudentsLimit = 4; // Needed >= 4 for lower test
        for (int i = 0; i < testMaxStudentsLimit; i++) {
            sms.addStudent(String.format("Test Student #%03d", i), "lname", "D001");
        }

        // Test adding teachers
        sms.addTeacher("John", "Doe", "D003");
        sms.addTeacher("Jane", "Doe", "D005");

        // Test printing teachers
        sms.printTeachers();

        // Test adding maximum teachers, should give error message with commented line below
        // int testMaxTeachersLimit = 19;
        int testMaxTeachersLimit = 0;
        for (int i = 0; i < testMaxTeachersLimit; i++) {
            sms.addTeacher(String.format("Test Teacher #%03d", i), "lname", "D001");
        }

        // Test adding courses
        sms.addCourse("Introduction to Programming", 2.5, "D001");
        sms.addCourse("Advanced Data Structures", 3.0, "D001");

        // Test printing courses
        sms.printCourses();

        // Test adding maximum courses, should give error message with commented line below
        // int testMaxCoursesLimit = 29;
        int testMaxCoursesLimit = 4; // Needed >= 4 for lower test
        for (int i = 0; i < testMaxCoursesLimit; i++) {
            sms.addCourse(String.format("Test Course #%02d", i), 5, "D003");
        }

        // Test modifying course teacher
        sms.modifyCourseTeacher("T001", "C001");

        // Test modifying course teacher, should give error (C999 invalid)
        sms.modifyCourseTeacher("T001", "C999");

        // Test modifying course teacher, should give error (T999 invalid)
        sms.modifyCourseTeacher("T999", "C001");

        // Test registering courses
        sms.registerCourse("S001", "C001");
        sms.registerCourse("S002", "C001");
        sms.registerCourse("S003", "C001");
        sms.registerCourse("S004", "C001");
        sms.registerCourse("S005", "C001");
        sms.registerCourse("S006", "C001"); // Should give error, max students

        // Test registering courses
        sms.registerCourse("S001", "C002");
        sms.registerCourse("S001", "C003");
        sms.registerCourse("S001", "C004");
        sms.registerCourse("S001", "C005");
        sms.registerCourse("S001", "C006"); // Should give error, max courses

        // Test registering courses, should give error (S999 invalid)
        sms.registerCourse("S999", "C001");

        // Test registering courses, should give error (C999 invalid)
        sms.registerCourse("S001", "C999");

        // Test registering courses, should give error (S001 already has C001)
        sms.registerCourse("S001", "C001");
    }
}
