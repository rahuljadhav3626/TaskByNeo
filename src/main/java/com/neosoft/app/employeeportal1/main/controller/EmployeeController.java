package com.neosoft.app.employeeportal1.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.app.employeeportal1.main.entity.Employee;
import com.neosoft.app.employeeportal1.main.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;

	@RequestMapping(value = "/employee/save", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" })
	public Employee saveAllEmployee(@Valid @RequestBody  Employee employee) {
		return employeeService.saveAllEmployee(employee);
	}

	@RequestMapping(value = "/getEmployeeByName", method = RequestMethod.GET, produces = { "application/json",
			" application/xml" })
	public List<Employee> getEmployeeByName() {
		return employeeService.getEmployeeByName();
	}

	@RequestMapping(value = "/deleteByIdEmployee/{id}", method = RequestMethod.DELETE, consumes = { "application/json",
			" application/xml" })
	public String deleteByIdEmployee(@PathVariable Short id) {
		return employeeService.deleteByIdEmployee(id);
	}

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET, consumes = { "application/json",
			" application/xml" })
	public Employee findById(@PathVariable short id) {
		return employeeService.findById(id);
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT, consumes = { "application/json",
			" application/xml" })
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value = "/findByIdForSoftDelete/{id}", method = RequestMethod.DELETE, consumes = { "application/json",
	" application/xml" })
	  public Employee findByIdForSoftDelete(short id) { return
	  employeeService.findByIdForSoftDelete(id);
	  
	  }
	 }
