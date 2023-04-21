package com.hr.services;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Employee;
import com.hr.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
		
	}
	
    
	public void addOne(Employee e) {
		employeeRepository.save(e);
	}
	
	public Employee getEmployeeById(Long id) {
	    return employeeRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Employé introuvable avec l'ID : " + id));
	}
	
	
	public void deleteEmployee(Long id) {
	    Employee employee = employeeRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Employé introuvable avec l'ID : " + id));

	    employeeRepository.delete(employee);
	}
	




	public List<Employee> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return employeeRepository.findByName(firstName);
	}
}
