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
	private PersonService ps; //->객체가없는 상태 : null 상태 쓸려고하면 null pointer err 출력
							  //D.I를 사용해서 객체를 주입받음
	@GetMapping("/view")
	public ModelAndView view() {
		
	ModelAndView mav = new ModelAndView();
	//--viewName을 지정하지 않으면 void와 동일하게 작동
	
	mav.addObject("list", ps.getList()); //Autowired때문에 객체를 안만들어도 객체가있음
										 
	return mav;
	}
}
