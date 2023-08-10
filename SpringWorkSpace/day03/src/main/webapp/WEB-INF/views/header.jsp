<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INBANK</title>
<style>
a {
	text-decoration: none;
	color: black;
}

ul {
	list-style: none;
	padding: 0;
	disply: flex;
}

ul>li {
	margin: 0 10px;
}
</style>

</head>
<body>
	<h1>${cpath }</h1>

	<ul>
		<li>
			<a href="${cpath }">home</a>
			<a href="${cpath }/ex01">ex01</a>
			<a href="${cpath }/ex02">ex02</a>
		</li>
	</ul>
	
	<hr>
</body>
</html>