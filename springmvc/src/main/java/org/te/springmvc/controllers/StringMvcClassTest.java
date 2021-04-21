package org.te.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StringMvcClassTest {
	
	@RequestMapping(path = "/springclass", method = RequestMethod.GET)
	public ModelAndView getSpringClass() {
		ModelAndView view = new ModelAndView();
		view.setViewName("/WEB-INF/views/springmvcpage.jsp");
		return view;
	}

}
