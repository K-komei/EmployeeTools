package com.Employee.Apps.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Employee.Apps.Entity.Employee_Entity;
import com.Employee.Apps.From.ExtraFrom;
import com.Employee.Apps.Service.Employee_Service;




@Controller
public class EmployeeController {

	@Autowired
	Employee_Service EService;

	@GetMapping("/")
	public String index(Model model) {
		List <Employee_Entity> employeies = EService.showAllEmployee();

//		List<String> classList = EService.getColumn("employee_class");
//		List<String> departmentList = EService.getColumn("employee_department");

		List<String> classList = EService.getColumn("t");
		List<String> departmentList = EService.getColumn("t");


	    model.addAttribute("classList",classList);
	    model.addAttribute("departmentList",departmentList);
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

	@PostMapping("/classExtration")
	public String classExtration(@ModelAttribute("select") ExtraFrom select ,Model model,String className) {
		List <Employee_Entity> employeies;
		String FlagStr = select.getClassName().toString();
		String All = "ALL"
	;

		if(FlagStr.equalsIgnoreCase(All)) {
			employeies = EService.showAllEmployee();
		}else {
			employeies = EService.ExtraClassName(className);
		}
		model.addAttribute("employeies",employeies);
	    return "index.html";
	    }



}
