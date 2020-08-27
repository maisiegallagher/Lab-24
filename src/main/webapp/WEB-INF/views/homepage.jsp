<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>

	<div class="container">

		<a>Navigation: </a> <a href="/partyoption">Options & Votes</a> <a
			href="/review">Review Options</a>

	</div>

	<div>
		<h1>Parties</h1>

		<ul>
			<c:forEach var="party" items="${leListOfParties}">
				<li><c:out value="${party.name}" /> - <c:out
						value="${party.date}" /><a href="<c:url value="${party.id}"/>"> See Details</a><br></li>
						<p>RSVPs: ${fn:length(party.rsvps)}</p>
			</c:forEach>
		</ul>
	</div>

	<br>
	<h1>RSVP</h1>
	<div>
		<form action="/save-rsvp">
			<label>Party</label> <select name="party">
				<c:forEach var="party" items="${leListOfParties}">
					<option value="${party.id}">
						<c:out value="${party.name}" />
					</option>
				</c:forEach>
			</select><br>
			<br> <label>Attendee</label> <input type="text" name="attendee" /><br>
			<br> <label>Comment</label>
			<textarea name="comment" rows="4" cols="30">
     	</textarea>
			<button type="submit">Submit</button>
		</form>
	</div>

</body>
</html>