<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz.jsp</title>
<style>
	input: {width:60px;}

</style>
</head>
<body>
	<%--
	
	
	  두정수를 입력받을 form을 작성 
		QuizController.java	form의 action은 작성하지않고 method는 POST로 전송
					1. GET으로 요청시 quiz.jsp로 포워드
					2.POST로 요청시 전달 받은 두 정수의 합계를 Attribute에 저장후 quiz_result.jsp로 포워드
		
		quiz.jsp	 두 정수를 입력 받을 form을 작성 
					form의 action 부분은 작성하지않고 method는 POST로 전송
		
			
		quiz_result.jsp   전달받은 두 정수의 합계를 화면에 출력			
	
	
	
	
	 --%>
	 <form  method = "post">
	 	<input name = "num1" type = "number" required>
	 	+
	 	<input name = "num2" type = "number" required>
	 	
	 	<button>=</button>
	 </form>
</body>
</html>