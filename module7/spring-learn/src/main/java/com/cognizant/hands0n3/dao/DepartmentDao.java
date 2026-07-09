package com.cognizant.hands0n3.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cognizant.hands0n3.model.Department;

@Repository
public class DepartmentDao {

    private static final ArrayList<Department> DEPARTMENT_LIST = new ArrayList<>();

    static {

        DEPARTMENT_LIST.add(new Department(1,"IT"));
        DEPARTMENT_LIST.add(new Department(2,"HR"));
        DEPARTMENT_LIST.add(new Department(3,"Finance"));
        DEPARTMENT_LIST.add(new Department(4,"Sales"));

    }

    public ArrayList<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }

}