<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
     <h1>Parties</h1>
     
     <a href="/votes"> Votes</a>
     <a href="/review">Review Options</a>
     
</div>

 <ul>
 			<c:forEach var="partytype" items ="${party}" >
 				<li><c:out value="${partytype.name}"/> -
 				<c:out value="${partytype.date}"/>
 				<a href="<c:url value="${partytype.id}"/>">See Details</a>
 				</li>
 			</c:forEach>
     
     </ul>
</body>
</html>