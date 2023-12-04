package vanier.andrei.dto;


import lombok.*;

@ToString
@EqualsAndHashCode
public class Department {
    private static int nextId = 1;

    private String departmentName;
    @Getter private String id;

    public Department(String name) {
        this.departmentName = name;
        this.id = "D" + String.format("%03d", nextId++);
    }
}
