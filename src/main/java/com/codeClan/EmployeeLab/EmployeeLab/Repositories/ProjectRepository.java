package com.codeClan.EmployeeLab.EmployeeLab.Repositories;


import com.codeClan.EmployeeLab.EmployeeLab.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
