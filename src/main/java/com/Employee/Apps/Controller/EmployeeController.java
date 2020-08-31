package com.Employee.Apps.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {
	@GetMapping("/hello")
	public String hello() {
		return "index.html";
	}

}
