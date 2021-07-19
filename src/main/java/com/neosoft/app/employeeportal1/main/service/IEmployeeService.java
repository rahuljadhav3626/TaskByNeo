package com.neosoft.app.employeeportal1.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neosoft.app.employeeportal1.main.entity.Employee;
@Service
public interface IEmployeeService {

	public Employee saveAllEmployee(Employee employee) ;

	public List <Employee> getEmployeeByName();

	public String deleteByIdEmployee(Short id);

	public Employee updateEmployee(Employee employee);
	
	public Employee findById(short id);

	public Employee findByIdForSoftDelete(short id);
}
