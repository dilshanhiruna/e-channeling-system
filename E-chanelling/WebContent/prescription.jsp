<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prescription</title>
<link rel="stylesheet" href="Images/Register.css">

</head>
<body>

	<div class="registerbox">
	<h1>Fill this form to make an order</h1><br>
	
	<form action="pcServlet" method="get" id="form" >
	
		<label>Username</label><br><input type ="text" name="uname" id="UN" ><br>
		<label>ID or Licene No</label><br><input type ="text" name="lid" id="ID" ><br>
		<label>Address</label><br><input type ="text" name="address" id="ADD" ><br>
		<label>Mobile No</label><br><input type ="text" name="mobile" id="MOB" ><br>
		<label>Special details</label><br><input type = "text" name="medicine" placeholder="No any specilal details you can keep this blank" id="DET" ><br>
		
		<h6>Note:-Please enter your correct user name otherwise we will not ship your order<br>You can add any special details about location in special details field</h6><br>
	
		<div class=btnr><input type="submit" value="Submit"></div>

	</form>
	
	</div>
</body>
</html>