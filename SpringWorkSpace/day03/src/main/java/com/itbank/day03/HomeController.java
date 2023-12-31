package com.itbank.day03;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {// 상속 불필요

	// @RequestMapping(value = "/" ,method = RequestMethod.GET)
	// -위의 구분은 spring 3버전에서 사용하는 구문

	@GetMapping("/") // 4버전부터 사용 가능 위의 @RequestMApping과 동일한 효과
	public String home() {
		return "home"; // WEB-INF/views/home.jsp로 간다.
	}
	
	@GetMapping("/ex01")
	public String test() {
		//String 반환형: return 하는 문자열이 viewName이된다.
		return "ex01";
	}
	@PostMapping("/ex01")
	public String test(HttpServletRequest request) {
		
		//request.setCharacterEncoding("utf-8");
		//이 코드는 web.xml 에서 작성된 필터로 대체되었습니다.
		
		String sAge  = request.getParameter("age");
		int age =Integer.parseInt(sAge);
		
		String msg = (age >= 20) ? "성인" : "미성년자";
		msg += " 입니다.~";
		
		request.setAttribute("msg", msg );
		return "ex01_result";
		
	}
	@GetMapping("/ex02")
	public void ex02() {}
	//void 반환형 : 요청하는 url 자체가 viewName이 된다.
	
	@PostMapping("/ex02")
	public String ex02(String name, int age, Model model) {
		//1.매개변수의 파라미터의 이름과 동일하게 작성해두면 저장된다.
		//2.medel은 request를 대체하기 위한 객체
		
		String msg = (age >= 20) ? "성인" : "미성년자";
		msg += "입니다.~";
		
		model.addAttribute("msg" ,msg);
		// - request.setAttribute() 와 동일하게 사용한다.
		// - 참고로 수명도 동일하다.
		
		return "ex02_result";
	}
}
