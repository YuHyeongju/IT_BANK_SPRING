<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h2>MVC2</h2>
	<hr>
	<h4>${time }</h4>
	<ul>

		<li>mvc 패턴 2는 MODEL, View, Controller 를 나누어서 처리하는 패턴</li>
		<li>MODEL은 DB 관련 작업을 처리</li>
		<li>View는 사용자에게 보여줄 화면을 처리</li>
		<li>Controller는 사용자의 요철을 처리</li>
		<li>WEB-INF라는 폴더는 외부에서 직접 접근이 불가능하게 막혀있다.</li>
		<li>WEB-INF 위치를 접근하려면 웹 서버에서 포워드로 전송해야만 접근 가능</li>
	</ul>
	
	<form method="POST"> <!-- dopost가 없어서 오류발생,  action이없으면 자기자신 페이지를 호출-->
	
		<p>이름:<input name = "name" type = "text" palceholder = "이름" required></p>
		<p>나이:<input name = "age" type = "number" palceholder = "나이" required></p>
		<button>전송</button>
 	</form>
</body>
</html>