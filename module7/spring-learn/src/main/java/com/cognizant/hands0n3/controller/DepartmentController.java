package com.cognizant.hands0n3.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.hands0n3.model.Department;
import com.cognizant.hands0n3.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/departments")
    public ArrayList<Department> getAllDepartments() {

        return service.getAllDepartments();

    }

}