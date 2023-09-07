<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ITBANK</title>
<link href ="${cpath }/resources/css/style.css" rel ="stylesheet">
</head>
<body>
	<h1>${cpath }</h1>
	
	<ul class = "menu">
	
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/person/view">person</a></li>
		<li><a href="${cpath }/board/view">board</a></li>
		<li><a href="${cpath }/account/view">account</a></li>
	</ul>
	
	<hr>