package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	@Query("select e from Employee e where e.eid=:eid")
	public Employee getEmployeeById(@Param("eid") Integer eID);
}
