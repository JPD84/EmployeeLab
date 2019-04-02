package com.codeClan.EmployeeLab.EmployeeLab.Controllers;


import com.codeClan.EmployeeLab.EmployeeLab.Models.Department;
import com.codeClan.EmployeeLab.EmployeeLab.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/")
    public List<Department>getAllDepartment(){
        return departmentRepository.findAll();
    }
}
