package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.PersonService;

@Controller
@RequestMapping(("/person"))
public class PersonController {
	
	@Autowired
	private PersonService ps;
	
	@GetMapping("/view")
	public ModelAndView view() {
		
	ModelAndView mav = new ModelAndView();
	//--viewName을 지정하지 않으면 void와 동일하게 작동
	
	mav.addObject("list", ps.getList());
		
	return mav;
	}
}
