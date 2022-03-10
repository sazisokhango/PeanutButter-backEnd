package com.example.PeanutButter.employee.controller;

import com.example.PeanutButter.employee.model.Employee;
import com.example.PeanutButter.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.listAllEmployees();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public void SaveNewEmployee(@RequestBody Employee employee) {
        employeeService.addNewEmployee(employee);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping
    public ResponseEntity<Employee> EditCurrentEmployee(@RequestBody Employee employee){
        employeeService.editExisting(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
