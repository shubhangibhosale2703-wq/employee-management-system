
package com.example.ems.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.ems.entity.Employee;
import com.example.ems.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
 private final EmployeeService service;
 public EmployeeController(EmployeeService service){this.service=service;}

 @GetMapping
 public List<Employee> all(){ return service.getAll(); }

 @PostMapping
 public Employee create(@RequestBody Employee e){ return service.save(e); }
}
