package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http를 상속받은 자바 -> 서블릿

public class FirstServlet extends HttpServlet {//FirstServlet 서블릿 생성

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//클라이언트가 요청 할 때 마다 실행
		System.out.println("doGet 메소드 호출됨");
		
		
	}

	@Override
	public void destroy() {
		System.out.println("distroy 메소드 호출됨");
	}

	@Override
	public void init() throws ServletException {// 최초 요청시 한번만 실행
		System.out.println("init 메소드 호출됨");
	}

	public static void main(String[] args) {
		

	}

}
