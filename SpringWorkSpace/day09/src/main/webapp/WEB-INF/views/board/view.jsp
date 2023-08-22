<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<%--여기에 board 테이블 전체를 출력 --%>
	<h3>board 테이블 목록 </h3> 
	
	<table border ="1" cellspacing="0" cellpadding="10">
		<tr> 
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>	
		<c:forEach var="row" items="${list }">
		<tr>
				<td>${row.idx }</td>
				<td>${row.title }</td>
				<td>${row.writer }</td>
				<td>${row.vcount }</td>
				<td>${row.wdate }</td>
		</tr>	
		</c:forEach>
	</table>
</body>
</html>