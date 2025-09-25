package com.briz.springboot_nit_jira_integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository eerpo;

	

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
    @PostMapping("/save")
    public String save(@RequestBody Employee emp){
        eerpo.save(emp);
        return "Data will be saved";


    }
    @GetMapping("/all")
    public List<Employee>find(){
        return eerpo.findAll();
    }
 @RequestMapping("/test3")
    public String test3(){
        return "this is the testing of jira nad github";
 }


}
