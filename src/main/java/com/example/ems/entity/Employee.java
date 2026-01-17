
package com.example.ems.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String fullName;
 private String email;
 private Double salary;
 private LocalDate joiningDate;

 @ManyToOne
 private Department department;
}
