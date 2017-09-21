<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>">
<title>Events Page</title>
</head>
<body>
	<h1><c:out value="${event.name}"/> </h1>
	
	<p>Host: <c:out value="${event.user.firstName}"/> <c:out value="${event.user.lastName}"/>
	<p>Date: <c:out value="${event.date}"/></p>
	<p>Location: <c:out value="${event.location}"/>, <c:out value="${event.state.name}"/></p>
	
	<div id="joined">
	<table>
		<tr>
			<td>Name</td>
			<td>Location</td>
		</tr>
		<c:forEach items="${joined}" var="user">
			<tr>
				<td>${user.firstName } ${user.lastName}</td>
				<td>${user.location}</td>
			</tr>
		</c:forEach>

	</table>
	</div>
	<div id="wall">
		<h2>Message Wall:</h2>
		<c:forEach items="${messages}" var="message">
			<div id="message">
				<p>${message.user.firstName }:</p>
				<p>${message.comment}</p>
				<p>---*---*---*---*---*---*</p>
			</div>
		</c:forEach> 
	</div>
	<div id="comment">
		<h5>Add Comment:</h5>
		<form:form method="POST" action="/newMessage/${event.id}" modelAttribute="message">
			<form:textarea path="comment" rows="5" cols="30"/>
			<input type="submit" value="submit"/>
		</form:form>
	</div>
</body>