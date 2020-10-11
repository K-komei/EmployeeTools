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

		List<String> classList = EService.getColumn("employee_class");
		List<String> departmentList = EService.getColumn("employee_department");
		List<String> sexList = EService.getColumn("employee_sex");


	    model.addAttribute("sexList",sexList);
	    model.addAttribute("classList",classList);
	    model.addAttribute("departmentList",departmentList);
	    model.addAttribute("employeies",employeies);


	    return "index.html";
	}


	@GetMapping("/createuser")
	public String createuser(Model model ) {
		Employee_Entity employee = new Employee_Entity();
	    model.addAttribute("employee",employee);
		return "createuser.html";
	}

	@PostMapping("/classExtration")
	public String classExtration(@ModelAttribute("select") ExtraFrom select ,Model model,String className) {
		List <Employee_Entity> employeies;
		//selectから値を取り出し、query用のパラメーターを設定する
		employeies = EService.ExtraClassName(select.getClassValue(),select.getDepartmentValue(),select.getSexValue());

		model.addAttribute("employeies",employeies);

		List<String> classList = EService.getColumn("employee_class");
		List<String> departmentList = EService.getColumn("employee_department");
		List<String> sexList = EService.getColumn("employee_sex");

	    model.addAttribute("sexList",sexList);
	    model.addAttribute("classList",classList);
	    model.addAttribute("departmentList",departmentList);

	    return "index.html";
	    }


}
