package com.cognizant.handon4.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.cognizant.handon4.exception.EmployeeNotFoundException;
import com.cognizant.handon4.model.Employee;
import com.cognizant.handon4.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ArrayList<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();

    }

    @PostMapping
    public Employee addEmployee(@RequestBody @Valid Employee employee) {

        return employeeService.addEmployee(employee);

    }

    @PutMapping
    public void updateEmployee(@RequestBody @Valid Employee employee)
            throws EmployeeNotFoundException {

        employeeService.updateEmployee(employee);

    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id)
            throws EmployeeNotFoundException {

        employeeService.deleteEmployee(id);

    }

}