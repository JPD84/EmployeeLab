package com.codeClan.EmployeeLab.EmployeeLab.Controllers;


import com.codeClan.EmployeeLab.EmployeeLab.Models.Project;
import com.codeClan.EmployeeLab.EmployeeLab.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }
}
