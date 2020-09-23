package com.Employee.Apps.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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

public List<Employee_Entity> searchUserList(){

	Employee_Entity sample = new Employee_Entity();

	sample.setEmployee_sex("男");

	Example <Employee_Entity> Esample =Example.of(sample);

	List<Employee_Entity> resultUserList = employeeRepo.findAll(Esample);
	return resultUserList;
}



	}
