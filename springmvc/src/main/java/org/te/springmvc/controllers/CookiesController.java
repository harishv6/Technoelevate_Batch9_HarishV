package org.te.springmvc.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookiesController {
	
	@GetMapping("./cookiespage")
	public String getCookies() {
		return  "cookiespage" ;
		
	}
	
	@GetMapping("./createcookies")
	
	public String name(HttpServletResponse response, ModelMap map) {
		Cookie cookie= new Cookie("Employee","Hari");
		response.addCookie(cookie);
		map.addAttribute("msg","created cookies");
		return "cookiespage";
		
	}
	
	@GetMapping("./showcookies")
	
	public String showCookies(HttpServletResponse response1, ModelMap map1 ) {
		return "cookiespage" ;
		
	}
	
	

}
