package com.cognizant.handon4.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.handon4.dao.EmployeeDao;
import com.cognizant.handon4.exception.EmployeeNotFoundException;
import com.cognizant.handon4.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public ArrayList<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    public Employee addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

    public void updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        employeeDao.updateEmployee(employee);

    }

    public void deleteEmployee(Integer id)
            throws EmployeeNotFoundException {

        employeeDao.deleteEmployee(id);

    }
}