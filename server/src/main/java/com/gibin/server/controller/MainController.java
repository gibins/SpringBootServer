package com.gibin.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	// Save operation
   /* @PostMapping("/departments")
    public Department saveDepartment(
        @Valid @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }
*/
	// Save operation
    @GetMapping("/home")
    public String getHome(HttpServletRequest httpServletRequest,Model model)
    {
    	System.out.println("Controller Home");
        return "home";
    }
    @PostMapping("/home")
    public String saveRegistration(HttpServletRequest httpServletRequest,Model model)
    {
    	System.out.println("Controller Home post save");
        return "home";
    }
}
