package com.rics.coupon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CouponController {
	
	@GetMapping(value = "/couponadd")
	public ModelAndView couponAddView() {
		ModelAndView modelAndView = new ModelAndView("/coupon/couponadd");
		return modelAndView;
	}
	
	@GetMapping(value = "/couponlist")
	public ModelAndView couponListView() {
		ModelAndView modelAndView = new ModelAndView("/coupon/couponlist");
		return modelAndView;
	}
	
	

}
