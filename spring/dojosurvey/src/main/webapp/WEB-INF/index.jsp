<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<form method="POST" action="/processSurvey">
	<label>Your Name: <input type="text" name="name"></label>
	<label>Dojo Location<select name="location">
        <option value="seattle">Seattle</option>
        <option value="chicago">Chicago</option>
      </select>
     </label>
     <label> Favorite Language: 
     	<select name="favoriteLanguage">
        		<option value="python">Python</option>
        		<option value="javascript">JavaScript</option>
        		<option value="c#">C#</option>
        		<option value="java">Java</option>
      	</select>
     </label>
     <input type="submit" value="Submit">
</form>