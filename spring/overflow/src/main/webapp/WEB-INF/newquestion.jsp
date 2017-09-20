<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form:form method="POST" action="/persons/new">
	<form:label path="question">Question:
	<form:errors path="question"/>
	<form:input path="question"/></form:label>

	<form:label path="tags">Tags (please enter only 3, seperated by commas)
		<form:errors path="question"/>
		<form:input path="tags"/>
	</form:label>
	
</form:form>