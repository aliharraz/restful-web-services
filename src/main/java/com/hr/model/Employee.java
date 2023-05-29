package com.hr.model;


import jakarta.persistence.Id;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	  @Id
	  @Column(name="employee_id")
      public Long id;
	  @Column(name="first_name")
      public String name;
	  @Column(name="last_name")
      public String last_name;
	  @Column(name="email")
      public String email;
	  @Column(name="phone_number")
      public String phone_number;
	  @Column(name="hire_date")
      public Date hire_date;
	  @Column(name="job_id")
      public String job_id;
	  @Column(name="salary")
	  public double salary;
	  @Column(name="commission_pct")
	  public Double commission_pct;
	  @Column(name="manager_id")
	  public Long manager_id;
	  @Column(name="department_id")
	  public Long department_id;
      
   
	public Employee(Long id, String firstName, String last_name, String email, String phone_number, Date hire_date,
			String job_id, Long salary, Double commission_pct, Long manager_id, Long department_id) {
		super();
		this.id = id;
		this.name = firstName;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.manager_id = manager_id;
		this.department_id = department_id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return name;
	}
	public void setFirst_name(String first_name) {
		this.name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public Employee() {
		super();
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Double  getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(Double  commission_pct) {
		this.commission_pct = commission_pct;
	}
	public Long getManager_id() {
		return manager_id;
	}
	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}
	public Long getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Long department_id) {
		this.department_id = department_id;
	}
}
