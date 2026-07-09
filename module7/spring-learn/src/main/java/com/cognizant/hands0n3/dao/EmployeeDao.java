package com.cognizant.hands0n3.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cognizant.hands0n3.model.Employee;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public EmployeeDao() {

        // Add employees here or load from employee.xml later

    }

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }

}