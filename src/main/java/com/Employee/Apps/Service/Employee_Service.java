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

public List<Employee_Entity> ExtraClassName(String classValue,String departmentValue,String sexValue){


	sexValue = "%" + sexValue.replaceAll("[\r\n]", "") + "%";


	String checkFlag="ALL";
	if(classValue.equals(checkFlag)) {
		classValue="%";
	}

	if(departmentValue.equals(checkFlag)) {
		departmentValue="%";
	}

	if(sexValue.equals(checkFlag)) {
		sexValue="%";
	}

	return employeeRepo.getFilterEmployeeList(classValue,departmentValue,sexValue);
}

public List<String> getColumn(String className) {


	List<String> Result = null;

	//クラス取得
	if(className.equals("employee_class")) {
		Result = employeeRepo.GetClassValue();
	}

	//性別取得
	if(className.equals("employee_sex")) {
		Result = employeeRepo.GetSexValue();
	}

	//部署取得
	if(className.equals("employee_department")) {
		Result = employeeRepo.GetDepartmentValue();
	}


	Result.add(0,"ALL");

	return Result;
}

	}
