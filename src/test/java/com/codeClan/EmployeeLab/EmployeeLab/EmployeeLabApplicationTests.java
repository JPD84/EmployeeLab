package com.codeClan.EmployeeLab.EmployeeLab;

import com.codeClan.EmployeeLab.EmployeeLab.Models.Department;
import com.codeClan.EmployeeLab.EmployeeLab.Models.Employee;
import com.codeClan.EmployeeLab.EmployeeLab.Models.Project;
import com.codeClan.EmployeeLab.EmployeeLab.Repositories.DepartmentRepository;
import com.codeClan.EmployeeLab.EmployeeLab.Repositories.EmployeeRepository;
import com.codeClan.EmployeeLab.EmployeeLab.Repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSetupEmployeeDepartmentProject(){
		Employee employee = new Employee("Clark", "Kent", 7632);
		employeeRepository.save(employee);
		Department department = new Department("SuperConductorsDept");
		departmentRepository.save(department);
		Project project = new Project("New semiConductor", 45);
		projectRepository.save(project);
		employee.addProject(project);
		employeeRepository.save(employee);
	}

}
