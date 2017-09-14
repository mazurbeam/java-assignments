<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>New Person</h1>

<form:form method="POST" action="/persons/new" modelAttribute="person">
	<form:label path="person">First Name:
	<form:errors path="person"/>
	<form:input path="person"/></form:label>
	
	<form:label path="lastName">Last Name:
	<form:errors path="lastName"/>
	<form:input path="lastName"/></form:label>
	
	<input type="submit" value="Submit"/>
</form:form>