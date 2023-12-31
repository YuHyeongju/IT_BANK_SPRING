package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/quiz")
public class QuizController extends HttpServlet {

	private static final long serialVersionUID = -6074042048828957059L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/quiz.jsp");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		request.setAttribute("sum",num1 + num2);
		/* 내가 짠 코드
		 int sum = num1 + num2 
		 
		 request.setAttribute("sum",sum);
		  
		 이걸 한 줄로 통합
		 */
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/quiz_result.jsp");
		rd.forward(request, response);
		
		
	}	
}
