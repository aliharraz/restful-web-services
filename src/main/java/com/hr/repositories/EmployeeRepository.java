package com.hr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hr.model.Employee;


@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
   public List<Employee> findByName(String name);
   

}
