<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table>
<tr>
	<td>Name</td>
	<td>Creator</td>
	<td>Version</td>
</tr>
<c:forEach items="${languages}" var="language">
	<tr>
		<td><c:out value="${language.name}"/></td>
		<td><c:out value="${language.creator}"/></td>
		<td><c:out value="${language.version}"/></td>
		<td><a href="/languages/update/">Edit</a></td>
	</tr>
</c:forEach>
</table>

<form:form method="POST" action="/languages/new" modelAttribute="language">
	<form:label path="name">Name
	<form:errors path="name"/>
	<form:input path="name"/></form:label>
	
	<form:label path="creator">Creator
	<form:errors path="creator"/>
	<form:input path="creator"/></form:label>
	
	<form:label path="version">Version
	<form:errors path="version"/>
	<form:input path="version"/></form:label>

	<input type="submit" value="Submit"/>
</form:form> 