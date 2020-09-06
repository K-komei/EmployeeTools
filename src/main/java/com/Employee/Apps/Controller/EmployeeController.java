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
	public String hello(Model model ) {
		List <Employee_Entity> employeies = EService.showAllEmployee();
	    model.addAttribute("employeies",employeies);
		return "index.html";
	}


}
