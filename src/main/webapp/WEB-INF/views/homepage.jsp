<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						value="${party.date}" /></li>
			</c:forEach>
		</ul>


	</div>

</body>
</html>