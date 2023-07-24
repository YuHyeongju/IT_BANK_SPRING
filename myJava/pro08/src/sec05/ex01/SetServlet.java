package sec05.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetServlet
 */
@WebServlet("/cset")
public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext();
		// �ּҰ� ����Ǿ�����
		
		List member = new ArrayList();		
		member.add("�̼���");
		member.add(30);
		context.setAttribute("member",member);
		
		out.print("<html><body>");
		out.print("�̼��Ű� 30 ����");
		out.print("</body></html>");
		
		
	}

}