package com.cognizant.handon4.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cognizant.handon4.exception.EmployeeNotFoundException;
import com.cognizant.handon4.model.Employee;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }

    public Employee addEmployee(Employee employee) {
        EMPLOYEE_LIST.add(employee);
        return employee;
    }

    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {

        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {

            if (EMPLOYEE_LIST.get(i).getId().equals(employee.getId())) {

                EMPLOYEE_LIST.set(i, employee);
                return;

            }
        }

        throw new EmployeeNotFoundException("Employee not found");

    }

    public void deleteEmployee(Integer id) throws EmployeeNotFoundException {

        for (Employee emp : EMPLOYEE_LIST) {

            if (emp.getId().equals(id)) {

                EMPLOYEE_LIST.remove(emp);
                return;

            }

        }

        throw new EmployeeNotFoundException("Employee not found");

    }

}