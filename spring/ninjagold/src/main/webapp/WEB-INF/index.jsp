<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h3>Your Gold: <c:out value="${game.gold}"/></h3>

<h3>Farm</h3>
<h4>(Earns 10-20 gold)</h4>
<form action="/findGold" method="post">
	<input type="hidden" name="building" value="farm">
	<input type="submit" value="Find Gold!">
</form>

<h3>Cave</h3>
<h4>(Earns 5-10 gold)</h4>
<form action="/findGold" method="post">
	<input type="hidden" name="building" value="cave">
	<input type="submit" value="Find Gold!">
</form>

<h3>House</h3>
<h4>(Earns 2-5 gold)</h4>
<form action="/findGold" method="post">
	<input type="hidden" name="building" value="house">
	<input type="submit" value="Find Gold!">
</form>

<h3>Casino</h3>
<h4>(Earns/takes 0-50 gold)</h4>
<form action="/findGold" method="post">
	<input type="hidden" name="building" value="casino">
	<input type="submit" value="Find Gold!">
</form>

<div id="activities" style="border: 1px solid black">
	<% for(int i = 0; i<game.getActivitiesSize(); i++) { %>
		<p><%= game.getActivity %>></p>
	<% } %>
</div>