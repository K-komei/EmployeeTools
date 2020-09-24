package com.Employee.Apps.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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

public int EmployeeGenerator() {

	Date createDay = new Date();
    SimpleDateFormat yeerOnlyFormat = new SimpleDateFormat("yyyy");
    String createYear = yeerOnlyFormat.format(createDay);
    System.out.println(createYear);


	return 0;
}

public List<Employee_Entity> ExtraClassName(String className){

	List<Employee_Entity> resultUserList = employeeRepo.ShowAll(className);
	return resultUserList;
}



	}
