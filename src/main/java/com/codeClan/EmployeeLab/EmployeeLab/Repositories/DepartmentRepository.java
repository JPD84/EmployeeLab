package com.codeClan.EmployeeLab.EmployeeLab.Repositories;

import com.codeClan.EmployeeLab.EmployeeLab.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
