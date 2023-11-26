package vanier.andrei.dto;

import lombok.*;

@AllArgsConstructor
public class Department {
    private static int nextId = 1;

    private String departmentName;
    private String id;

    // Not sure if we can use lombok here
    @Override
    public String toString() {
        return "";
    }
}
