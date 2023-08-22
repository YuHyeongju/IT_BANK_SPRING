package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("view")
	public ModelAndView view() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", bs.getList());
		
		return mav;
	}
}
//컨트롤러 역할 들어온 요청에 attribute 넣어서 보내줌