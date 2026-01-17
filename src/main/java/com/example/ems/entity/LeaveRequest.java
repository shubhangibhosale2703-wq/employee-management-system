
package com.example.ems.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
public class LeaveRequest {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private LocalDate startDate;
 private LocalDate endDate;
 private String status;
 private String reason;

 @ManyToOne
 private Employee employee;
}
