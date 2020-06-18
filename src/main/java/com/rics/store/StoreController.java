package com.rics.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StoreController {
	@GetMapping(value = "/storeadd")
	public ModelAndView storeAddView() {
		ModelAndView modelAndView = new ModelAndView("/store/storeadd");
		return modelAndView;
	}
	
}
