package com.hr.controller;

import java.util.*; 
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
import org.springframework.stereotype.Controller;
>>>>>>> 60687724245db2f96609bac2836d5b99de854072
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Employee;
import com.hr.services.EmployeeService;

import org.springframework.ui.Model;


@Controller
public class EmployeeController {

	
	@Autowired 
	private EmployeeService empService;
	
	@GetMapping("/emps")
<<<<<<< HEAD
	/*public List<Employee> getAllEmployees(){
	    return empService.getAllEmployees();
	}*/
	public String ListEmployee(Model model) {
		List<Employee> employee=empService.getAllEmployees();
		model.addAttribute("employee",employee);
		return "vue";
=======
	public String emps(Model model){
		 List<Employee> employees = empService.getAllEmployees();
	     model.addAttribute("employees", employees);
	     return "emps";
>>>>>>> 60687724245db2f96609bac2836d5b99de854072
	}
	
	

	@GetMapping("/emps/{id}")
	public String getOneEmployee(@PathVariable Long id,Model model) {
	    model.addAttribute("employee", empService.getEmployeeById(id));
	    return "profil";
	}
	/*@GetMapping("/emps/byFirstName/{firstName}")
	public List<Employee> getEmpByFirstName(@PathVariable String firstName){
	    return empService.findByFirstName(firstName);
<<<<<<< HEAD
	}
=======
	}*/
>>>>>>> 60687724245db2f96609bac2836d5b99de854072
	@PostMapping("/emps/addEmployee")
	public void addEmployee(@RequestBody Employee e) {
		empService.addOne(e);
	}
	@GetMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Long id) {
	     empService.deleteEmployee(id);
	}
}
