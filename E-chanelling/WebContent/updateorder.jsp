<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
		String OID = request.getParameter("oid");
		String UNAME = request.getParameter("uid");
		String ID = request.getParameter("id");
		String ADD =  request.getParameter("add");
		String MOB = request.getParameter("mob");
		String DET = request.getParameter("det");
	
	%>
	
	
	
	<form action="updateordercontroller" method="post">
		Order Id<input type="text" name="oid" value="<%=OID %>" readonly><br>
		User name<input type="text" name="uid" value="<%=UNAME %>"><br>
		National Id<input type="text" name="id" value="<%=ID %>"><br>
		Address<input type="text" name="add" value="<%=ADD %>"><br>
		Mobile No<input type="text" name="mob" value="<%=MOB %>"><br>
		Details<input type="text" name="det" value="<%=DET %>"><br>
		
		<input type="submit" value="Update my order">
	
	
	
	</form>
</body>
</html>