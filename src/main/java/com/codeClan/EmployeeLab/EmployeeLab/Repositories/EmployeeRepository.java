package com.codeClan.EmployeeLab.EmployeeLab.Repositories;


import com.codeClan.EmployeeLab.EmployeeLab.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
