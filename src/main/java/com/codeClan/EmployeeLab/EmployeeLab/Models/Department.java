package com.codeClan.EmployeeLab.EmployeeLab.Models;

import javax.persistence.*;

@Entity
@Table(name = "Departments")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
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
}
