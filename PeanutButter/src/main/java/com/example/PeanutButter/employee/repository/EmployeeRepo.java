package com.example.PeanutButter.employee.repository;

import com.example.PeanutButter.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo  extends JpaRepository<Employee, Long> {
}
