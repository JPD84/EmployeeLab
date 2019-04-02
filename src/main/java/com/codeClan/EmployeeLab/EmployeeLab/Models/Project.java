package com.codeClan.EmployeeLab.EmployeeLab.Models;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int projectDuration;

    public Project(Long id, String name, int projectDuration) {
        this.id = id;
        this.name = name;
        this.projectDuration = projectDuration;
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }
}
