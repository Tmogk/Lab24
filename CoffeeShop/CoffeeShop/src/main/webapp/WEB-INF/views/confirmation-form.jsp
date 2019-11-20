<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Form</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
</head>
<body>
<a class="btn-primary" href="/"> Home </a>

<h1> WELCOME! ${personInfo.firstName }</h1>

<h5>Thank you for registering!

The following contact information has been recorded:<br></br>

Email: ${personInfo.email } <br></br>
Phone: ${personInfo.phoneNumber }
</h5>

</body>
</html>