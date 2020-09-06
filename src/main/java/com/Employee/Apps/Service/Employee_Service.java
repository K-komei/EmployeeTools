package com.Employee.Apps.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Apps.Entity.Employee_Entity;
import com.Employee.Apps.Repository.Employee_Repository;

@Service
public class Employee_Service {
@Autowired
private Employee_Repository employeeRepo;

public List<Employee_Entity> showAllEmployee () {

	return employeeRepo.findAll();

}


	}
