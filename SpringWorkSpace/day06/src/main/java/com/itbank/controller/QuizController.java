package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.dto.AccountDTO;
import com.itbank.service.QuizService;


@Controller
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService qs;
	
	@GetMapping("/ex01")
	public void ex01() {}
	
	@PostMapping("/ex01")
	public ModelAndView ex01(AccountDTO user) {
	    
		ModelAndView mav = new ModelAndView();
		String msg = "로그인 실패";
		
		user = qs.login(user);
		
		if(user != null) {
			msg = user.getNick() + "님 로그인";
		}
		
		mav.addObject("user", user);
		mav.addObject("msg", msg);
		
		mav.setViewName("quiz/ex01_result");
	
	  return mav;
	}
}
