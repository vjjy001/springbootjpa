package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.Employee;
import com.jpa.service.EmployeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeService eSrvc;
	
	@RequestMapping(value="hello",method=RequestMethod.GET)
	public String hello(){
		return "hello jpa";
	}
	
	@RequestMapping(value="employee",method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		
		return this.eSrvc.findAllEmployee();
		
	}
	
	@RequestMapping(value="employeeid",method=RequestMethod.GET)
	public Employee getOneEmployee(){
		
		return this.eSrvc.findEmployeeByID(20).get();
		
	}
}
