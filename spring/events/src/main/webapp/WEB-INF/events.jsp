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
	<h1>Welcome <c:out value="${currentUser.firstName}"></c:out></h1>
	
	
	<h4>Here are some of the events in your state (<c:out value="${currentUser.state.name}"/>):</h4>
	<table>
		<tr>
			<td>Name</td>
			<td>Date</td>
			<td>Location</td>
			<td>Host</td>
			<td>Action/Status</td>
		</tr>
		<c:forEach items="${localEvents}" var="event">
			<tr>
				<td><a href="/events/${event.id}"><c:out value="${event.name}"/></a></td>
				<td><c:out value="${event.date}"/></td>
				<td><c:out value="${event.location}"/></td>		
				<td><c:out value="${event.user.firstName}"/></td>
				<td>
					<c:if test="${event.user.id == currentUser.id }">
						<a href="/events/${event.id}/edit">Edit</a>
					</c:if>
					<c:if test="${event.user.id != currentUser.id }">
						<a href="/events/${event.id}/join">Join</a>
					</c:if>
				</td>
			</tr>
		
		</c:forEach>
	</table>
	
	
	<h4>Here are some events in other States</h4>
	<table>
		<tr>
			<td>Name</td>
			<td>Date</td>
			<td>Location</td>
			<td>State</td>
			<td>Host</td>
			<td>Action/Status</td>
		</tr>
		<c:forEach items="${events}" var="event">
			<tr>
				<td><a href="/events/${event.id}"><c:out value="${event.name}"/></a></td>
				<td><c:out value="${event.date}"/></td>
				<td><c:out value="${event.location}"/></td>
				<td><c:out value="${event.state.name}"/></td>			
				<td><c:out value="${event.user.firstName}"/></td>
				<td>
					<c:if test="${event.user.id == currentUser.id }">
						<a href="/events/${event.id}/edit">Edit</a>
					</c:if>
					<c:if test="${event.user.id != currentUser.id }">
						<a href="/events/${event.id}/join">Join</a>
					</c:if>
				</td>
			</tr>
		
		</c:forEach>
	</table>
	
	<p><form:errors path="event.*"/></p>
	<form:form method="POST" action="/newEvent" modelAttribute="event">
		<p>
			<form:label path="name">Name:</form:label>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="date">Date:</form:label>
			<form:input type="date" path="date"/>
		</p>
		<p>
            <form:label path="location">Location:</form:label>
            <form:input path="location"/>
        </p>
        <p>
        		<form:label path="state">State:
        		<form:select path="state" items="${states}" itemValue="id" itemLabel="name">
        		</form:select></form:label>
        </p>
        <p>
        		<input type="submit" value="Add Event"/>
        </p>
	</form:form>
	
	<form id="logoutForm" method="POST" action="/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Logout!" />
    </form>
</body>
