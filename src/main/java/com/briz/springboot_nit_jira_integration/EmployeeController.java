package com.briz.springboot_nit_jira_integration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	

    @RequestMapping("/test")
    public String test(){
        return "This is the testing ";

    }
    @RequestMapping("/test1")
    public String test1(){
        return "this is the testing of github ";
    }
    @RequestMapping("/hello")
    public String hello()
    {
    	return "hello test";
    }


}
