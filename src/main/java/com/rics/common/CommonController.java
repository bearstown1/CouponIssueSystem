package com.rics.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CommonController {
	
	@GetMapping(value = "/login")
	public ModelAndView showLoginView() {
		ModelAndView modelAndView = new ModelAndView("/common/login");
		return modelAndView;
	}
	
	@GetMapping(value = "/main")
	public ModelAndView showMainView() {
		ModelAndView modelAndView = new ModelAndView("/common/Mainview");
		return modelAndView;
		
	}
	
	
}
