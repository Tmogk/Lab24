<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
</head>
<body>

	<a class="btn-primary" href="/"> Home </a>

	<h1>Please fill in the form to register!</h1>



	<form action="register-user" method="post">
		First Name: <input type="text" name="firstName" placeholder= "First Name" required> <br> Last
		Name: <input type="text" name="lastName" placeholder= "Last Name" required> <br> Email: <input
			type="text" name="email" placeholder="Email Address" required> <br> Phone number: <input
			type="text" name=phoneNumber placeholder="Phone Number" required> <br> Address: <input
			type="text" name="address" placeholder="Address" required> <br> <input type="submit"
			value="Submit">
	</form>
	
	

</body>
</html>