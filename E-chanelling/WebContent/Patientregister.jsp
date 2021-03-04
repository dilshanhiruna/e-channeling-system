<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Images/Register.css">
</head>
<body>
	<div class="registerbox">
	<form action="Addpatient" method="post">
		<h1>Patient Register page</h1><br>
		<label>First Name:-</label><br><input type="text" name="fname" required><br>
		<label>Last Name:-</label><br><input type="text" name="lname" required><br>
		<label>E-mail:-</label><br><input type="text" name="email" required><br>
		<label>Mobile No:-</label><br><input type ="text" name="mobile" required><br>
		<label>User Name:-</label><br><input type ="text" name="uname" required><br>
		<label>password:-</label><br><input type="password" name = "pass" required><br>
		
		<h3>Note:-Please remind your User name and Password for Future login</h3><br>
		
		<div class=btnr><input  type="submit" name="register" value="Register" ></div>
		
		<h3><a href="Patientlogin.jsp">Already a member</a></h3><br>
	</form>
	</div>
</body>
</html>