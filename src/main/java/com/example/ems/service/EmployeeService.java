
package com.example.ems.service;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.ems.repository.EmployeeRepository;
import com.example.ems.entity.Employee;

@Service
public class EmployeeService {
 private final EmployeeRepository repo;
 public EmployeeService(EmployeeRepository repo){this.repo=repo;}
 public List<Employee> getAll(){return repo.findAll();}
 public Employee save(Employee e){return repo.save(e);}
}
