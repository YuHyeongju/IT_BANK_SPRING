<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ITBANK</title>
<style>
	a{
		text-decoration: none;
		color: black;
	}
	a:hover{
		text-decoration:underline;
	}
	.menu{
		list-style: none;
		padding: 0;
		display: flex;
		
	}
	.menu > li{
		margin: 0 10px;
	
	}
</style>
</head>
<body>
	<h1>${cpath }</h1>
	

	<ul class="menu">
		<li><a href= "${cpath }">home</a><li>
		 <li><a href= "${cpath }/person/view">person</a></li>
		 <li><a href= "${cpath }/board/view">board</a></li>
	</ul>
	
	<hr>
</body>
</html>