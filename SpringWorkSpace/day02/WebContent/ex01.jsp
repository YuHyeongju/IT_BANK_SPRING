<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<%
	
		Date date = new Date();	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss E요일");
		
		String time  = sdf.format(date);
		%>




	<h1>MVC1</h1>
	<hr>
	<h4><%=date %></h4>
	<ul>
		<li>MVC란 웹서버 페이지를 작성하는 디자인 패턴을 의미함.</li>
		<li>M은 Model, V는 View, C는 Controller를 의미</li>
		<li>MVC 패턴1은 MVC를 구분하지 않고 하나의 jsp에서 모두 처리하는 패턴</li>
		<li>따라서, 구현 난이도는 쉬우나 유지보수에 매우 부적합하다.</li>
	</ul>


	<%-- 
 	jstl
 	<% for(int i = 1; i <=5; i++){ %>
 		<p><%=pageContext.getAttribute("i") %> : HELLO JSP!!!!!</p>
 		
 	<% } %> --%>
	<!-- el -->
	<c:forEach var="i" begin="1" end="5">
		<p>${i }: Hello JSP!!</p>
	</c:forEach>

	%>
	<!-- 상반된 언어를 사용해서 가독성이 떨어짐  -> jstl을 사용하여 가독성확보-->
</body>
</html>