 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Images/login.css">
<script src="Images/login.js"></script>
</head>
<body>
	<div class="loginbox">
	<form action="accountdetails" method="POST" onSubmit="return validate" >
		<h1>Patient Login</h1><br>
		<label>User Name:-</label><br><div class="textb"><input   type="text" name="uname" id="UN" placeholder="Enter your user Name" required ></div><br>
		<label>Password:-</label><br><div class="textb"><input  type="password" name="pass" id="PW" placeholder="Enter your password" required ></div><br>
		
		<input type="submit" name="submit" Value="Login" class="btnlog" >
		
		

		
	
	</form>
	</div>
</body>
</html>