package com.gibin.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {
	
	// Save operation
   /* @PostMapping("/departments")
    public Department saveDepartment(
        @Valid @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }
*/
	// Save operation
    @GetMapping("/")
    public String getHome()
    {
    	System.out.println("REST Controller Home");
        return "aaa";
    }
}
