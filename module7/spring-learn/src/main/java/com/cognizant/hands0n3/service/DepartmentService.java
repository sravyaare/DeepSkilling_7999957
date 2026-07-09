package com.cognizant.hands0n3.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hands0n3.dao.DepartmentDao;
import com.cognizant.hands0n3.model.Department;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao dao;

    public ArrayList<Department> getAllDepartments() {

        return dao.getAllDepartments();

    }

}