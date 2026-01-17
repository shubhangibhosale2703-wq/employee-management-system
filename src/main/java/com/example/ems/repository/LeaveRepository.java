
package com.example.ems.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ems.entity.LeaveRequest;
import java.util.List;

public interface LeaveRepository extends JpaRepository<LeaveRequest, Long> {
 List<LeaveRequest> findByEmployeeId(Long empId);
}
