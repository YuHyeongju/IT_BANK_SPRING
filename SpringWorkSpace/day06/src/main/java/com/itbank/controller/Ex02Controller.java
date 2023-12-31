package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex02Controller {
	@GetMapping("/ex02")
	public void ex02() {}
	
	@PostMapping("/ex02")
	public String ex02(Model model, String name, int age) {
		//1.Model은 request를 대체할 객체이다.
		//2.매개변수 name, age는 파라미터를 받을 변수이다.
		//-파라미터명과 같아야 채워짐
		
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		String adult = (age > 20) ? "성인" : "미성년자";
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("result", adult);
		
		
		
		
		return "ex02_result";
	}
}
