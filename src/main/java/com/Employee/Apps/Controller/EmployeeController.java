package com.Employee.Apps.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Employee.Apps.Entity.Employee_Entity;
import com.Employee.Apps.Service.Employee_Service;




@Controller
public class EmployeeController {

	@Autowired
	Employee_Service EService;

	@GetMapping("/")
	public String index(Model model ) {
//		List <Employee_Entity> employeies = EService.showAllEmployee();

		List <Employee_Entity> employeies = EService.searchUserList();


	    model.addAttribute("employeies",employeies);
		return "index.html";
	}

	@GetMapping("/createuser")
	public String createuser(Model model ) {
		Employee_Entity employee = new Employee_Entity();
	    model.addAttribute("employee",employee);
	    EService.EmployeeGenerator();



		return "createuser.html";
	}



}
