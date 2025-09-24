package com.briz.springboot_nit_jira_integration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/test")
	public String test() {
		return "This is the Test";
	}

}
