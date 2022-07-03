package com.gibin.server.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorControllerImpl implements ErrorController{
	
	// Save operation
   /* @PostMapping("/departments")
    public Department saveDepartment(
        @Valid @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }
*/
	// Save operation
	@RequestMapping("/error")
	public String getError(HttpServletRequest request) {
		
		System.out.println("Controller Error "+request.getRemoteAddr());
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

		/*if (status != null) {
			Integer statusCode = Integer.valueOf(status.toString());

			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				return "error-404";
			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				return "error-500";
			}
		}*/
		return "error";
	}
}
