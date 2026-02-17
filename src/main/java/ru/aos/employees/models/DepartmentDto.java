package ru.aos.employees.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author oalikin88
 */
@NoArgsConstructor
@Getter
@Setter
public class DepartmentDto {

    private Long id;
    private String name;
    private String code;

    @Override
    public String toString() {
        return "DepartmentDto{" + "id=" + id + ", name=" + name + ", code=" + code + '}';
    }
    
    
    
    
}
