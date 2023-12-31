package com.itbank.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.dto.PersonDTO;
import com.itbank.service.Ex04Service;

@Controller
@RequestMapping("/ex05")
public class Ex05Controller {

	@Autowired
	private Ex04Service es;
	
	@GetMapping("/test")
	public void test() {}
	
	@PostMapping("/test")
	public ModelAndView test(PersonDTO per) {

			//ModelAndView 
			//- Model 객체의 기능과 ViewName을 결정하는 기능을 가진 객체
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("per" , per);
		mav.addObject("adult" , es.isAdult(per)); //addObject:  key와 value를 담아서 보낼수 있는 메서
		//Attribute 추가
		
		mav.setViewName("ex05/test_result");
		//- ViewName을 결정
		
		return mav;
		
		
	}
	
	@GetMapping("/test2")
	public void test2() {}
	
	@PostMapping("/test2")
	public ModelAndView test2(@RequestParam Map<String, Object> per) {
		//MAP : key와 value 로 이루어진 컬렉션
		//- 주로 외부사이트의 파라미터값을 받을 떄 사용
		// - @RequestParam이라고 명시를 해야 받을 수 있음
		
		
		ModelAndView mav = new ModelAndView();
		
		int age = Integer.parseInt((String)per.get("age"));
		
		String adult = (age >= 19) ? "성인" : "미성년자";
		
		
		mav.addObject("per", per);
		mav.addObject("adult", adult);
		
		mav.setViewName("ex05/test2_result");
		
		return mav;
	}
}
