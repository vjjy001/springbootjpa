package com.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.EmployeeDao;
import com.jpa.model.Employee;

@Service
public class EmployeService {

	@Autowired
	private EmployeeDao eDao;
	
	public List<Employee> findAllEmployee(){
		return this.eDao.findAll();
	}
	
	public Optional<Employee> findEmployeeByID(Integer eid){
		return this.eDao.findById(eid);
	}
}
