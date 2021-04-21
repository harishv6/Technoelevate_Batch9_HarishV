package org.te.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDelegationAllocation {
	
	@GetMapping("/redirect")
	public String redirectRequest() {
		return "redirect:http;//www.youtube.com";
		
	}
	
	@GetMapping("/forward")
	public String forwardRequest() {
		return "forward:employeeLogin";
		
	}
	
	

}
