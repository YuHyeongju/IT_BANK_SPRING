<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<fieldset class="inputForm">
		<legend>login</legend>
	
		<form method="POST">
			<p>
				<label>아이디</label>
				<input name="userid" required>
			</p>
			<p>
				<label>패스워드</label>
				<input name="userpw" type="password" required>
			</p>
			
			<ul class ="menu">
				<li><button>로그인</button></li>
				<li><a href="${cpath }/account/find">
					<button type="button">ID/PW찾기</button>
				
				</a>
			
			
			</ul>
			
			
		</form>
	</fieldset>

</body>
</html>