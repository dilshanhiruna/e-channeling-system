<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Order placed sucesfully</h1><br>
	<h1>Order Status</h1><br>

	<table >

	<c:forEach var="od" items="${ord}">
		
		<c:set var="oid" value="${od.Oid}"/>
		<c:set var="uname" value="${od.Uname}"/>
		<c:set var="id" value="${od.Id}"/>
		<c:set var="add" value="${od.Add}"/>
		<c:set var="mobile" value="${od.Mobile}"/>
		
		<c:set var="details" value="${od.Details}"/>
		
			
		
		
		
		
		<tr>
			<td>
			Order id
			</td>
		
			<td>
			${od.Oid}
			</td>
		
		</tr>	
		
		<tr>
			<td>
			User Name
			</td>
		
			<td>
			${od.Uname}
			</td>
		</tr>	
		
		<tr>
			<td>
			User Name
			</td>
		
			<td>
			${od.Uname}
			</td>
		</tr>	
		
		<tr>
			<td>
			National Id No
			</td>
		
			<td>
			${pat.Id}
			</td>
		</tr>	
		
		<tr>
			<td>
			Address
			</td>
		
			<td>
			${pat.Add}
			</td>
		</tr>	
		
		<tr>
			<td>
			Mobile
			</td>
		
			<td>
			${pat.Mobile}
			</td>
		</tr>
		
		<tr>
			<td>
			Details
			</td>
		
			<td>
			${pat.Details}
			</td>
		</tr>
		
		
		
	</c:forEach>
	</table>
	
	<c:url value="updateorder.jsp" var="Orderupdate">
		<c:param name="oid" value="${oid}"></c:param>
		<c:param name="uid" value="${uname}"></c:param>
		<c:param name="id" value="${id}"></c:param>
		<c:param name="add" value="${add}"></c:param>
		<c:param name="mob" value="${mobile}"></c:param>
		<c:param name="det" value="${details}"></c:param>
		
	</c:url>
	
	
	<a href="${Orderupdate}">
	<input type = "submit" value="Update my order">
	</a>
	
	<br>
	
	<c:url value="canselorder.jsp" var="ordercansel">
	
		<c:param name="oid" value="${oid}"></c:param>
		<c:param name="uid" value="${uname}"></c:param>
		<c:param name="id" value="${id}"></c:param>
		<c:param name="add" value="${add}"></c:param>
		<c:param name="mob" value="${mobile}"></c:param>
		<c:param name="det" value="${details}"></c:param>
	
	
	
	</c:url>
	
	<a href="${ordercansel}">
	<input type="submit" value="Cansel my order">
	</a>
	
</body>
</html>