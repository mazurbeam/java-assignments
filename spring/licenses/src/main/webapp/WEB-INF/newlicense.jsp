<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>New License</h1>

<form:form method="POST" action="/licenses/new" modelAttribute="license">
	<form:label path="person">Person:
	<form:select path="person">
	<form:option value="0" label="Select"/>
	<form:options items="${people}" itemValue="id" itemLabel="firstName"/>
	</form:select>
	</form:label>
	
	<form:label path="state">State:
	<form:errors path="state"/>
	<form:input path="state"/></form:label>
	
	<form:label path="expirationDate">Expiration Date:
	<form:input type="date" path="expirationDate"/>
	</form:label>
	
	<input type="submit" value="Submit"/>
</form:form>