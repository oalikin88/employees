package ru.aos.employees.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department department;
    private String name;
    private String surname;
    private String patronymic;
    private String username;
    private int phone;
    private String email;

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", department=" + department + ", name=" 
                + name + ", surname=" + surname + ", patronymic=" + patronymic 
                + ", username=" + username + ", phone=" + phone + ", email=" + email + '}';
    }

    
    
    
}
