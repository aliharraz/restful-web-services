package com.hr.controller;

import java.util.*;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Employee;
import com.hr.services.EmployeeService;


@RestController
public class EmployeeController {

	
	@Autowired 
	private EmployeeService empService;
	
	@GetMapping("/emps")
	public List<Employee> getAllEmployees(){	    
	    return empService.getAllEmployees();
	}
	@GetMapping("/emps/{id}")
	public Employee getOneEmployee(@PathVariable Long id) {
	    return empService.getEmployeeById(id);
	}
	@GetMapping("/emps/byFirstName/{firstName}")
	public List<Employee> getEmpByFirstName(@PathVariable String firstName){
	    return empService.findByFirstName(firstName);
	}
	@PostMapping("/emps/addEmp")
	public void addEmployee(@RequestBody Employee e) {
		empService.addOne(e);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Long id) {
	     empService.deleteEmployee(id);
	}
}
