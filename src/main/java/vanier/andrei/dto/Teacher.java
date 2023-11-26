package vanier.andrei.dto;

public class Teacher {
    private static int nextId = 1;

    private String id;
    private String firstName;
    private String lastName;
    private Department department;

    // Not sure if we can use lombok here
    @Override
    public String toString() {
        return "";
    }
}
