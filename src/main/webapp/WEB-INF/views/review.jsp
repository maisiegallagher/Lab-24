<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<p>Navigation:
     <a href="/">Parties</a>
     <a href="/votes">Votes</a></p>
     
     <h1>Pizza Options</h1>
<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Votes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="sortByVotes" items="${pizza}">
				<c:if test="${sortByVotes.votes >0}">
					<tr>
						<td>${sortByVotes.name}</td>
						<td>${sortByVotes.description}</td>
						<td>${sortByVotes.votes}</td>
						
					</tr>
					</c:if>
				</c:forEach>
			</tbody>
		</table>
		</div>

</body>
</html>