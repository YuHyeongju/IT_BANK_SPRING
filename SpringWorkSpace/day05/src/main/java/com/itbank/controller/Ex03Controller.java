package com.itbank.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.dto.PersonDTO;

@Controller
@RequestMapping("/ex03") //     /ex03의 URL아래만 매핑해서 처리
public class Ex03Controller {

	@GetMapping("/test") //즉 여기는 /ex03/test으로의 요청만 처리
	public void ex03() {  //따라서 viewName은 /WEB-INF/views/ex03/test.jsp이다
		
	}
	@PostMapping("/test")
	public String ex03(Model model, PersonDTO per) {
		//주고받는 파라미터가 많은경우 변수를 일일이 다 작성시 불편
		//이때 , DTO를 만들어서 한번에 받아 처리가 가능
		
		//디버깅
		System.out.println("name = " + per.getName());
		System.out.println("age = " + per.getAge());
		
		String adult = "미성년자";
		
		if(per.getAge() >= 20) {
			adult = "성인";
		}
		
		model.addAttribute("per",per);//person 그자체
		model.addAttribute("adult", adult);
		
		return "ex03/test_result";
		
	}
}
