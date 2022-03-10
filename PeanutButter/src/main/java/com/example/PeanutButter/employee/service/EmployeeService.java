package com.example.PeanutButter.employee.service;

import com.example.PeanutButter.employee.model.Employee;
import com.example.PeanutButter.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee getCurrentEmployee(Long id) {
        Employee editEmployee = employeeRepo.findById(id).orElseThrow( () -> new IllegalStateException("Employee Does not Exit"));

        return editEmployee;
    }

    public List<Employee> listAllEmployees() {
        return employeeRepo.findAll();
    }

    public void addNewEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Transactional
    public void editExisting (Employee employee){
        Employee tempEmployee = employeeRepo.findById(employee.getId()).orElseThrow(() -> new IllegalStateException("Employee Does not Exit"));

        employeeRepo.save(employee);
    }
}
