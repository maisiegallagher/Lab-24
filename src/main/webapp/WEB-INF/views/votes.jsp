<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vote Page</title>
</head>
<body>

<div class="container">
 <p>Navigation:
     <a href="/">Parties</a>
     <a href="/review">Review Options</a></p>
     
     <div>
		<h1>Pizza Options</h1>
		</div>
		<div>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Votes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pizza" items="${leListOfOptions}">
					<tr>
						<td>${pizza.name}</td>
						<td>${pizza.description}</td>
						<td>${pizza.votes}</td>
						<td><a href="/addMoreVotes?id=${pizza.id}">Vote!</a></td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<form action="/addNewPizza" method="post">
	<h2>Add on option</h2>
	<label>Name:</label>
	<input type="text" name="name"/>
	<input type="text" name="description"/>
	<button type="submit">Add</button>
	</form>
	</div>

</body>
</html>