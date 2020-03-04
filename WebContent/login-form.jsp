<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Smart Traffic Web App</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<body style="background: black;color: #fff;font-family: serif;font-size: 16px">
	<jsp:include page="navhome.jsp"></jsp:include>
	<div class="container" align="center">
		<h3>Admin Login</h3>
		<hr>
		<br>
		<form action="LoginServlet" method="post" style="width: 500px">
			<div class="form-group">
				<label for="email1">Enter Valid Email address</label> <input type="email"
					class="form-control" name="email" id="email1" placeholder="Enter Valid Email address" />
			</div>
			<div class="form-group">
				<label for="password1">Enter Valid Password</label> <input type="password"
					class="form-control" name="password" id="password1"
					placeholder="Enter Valid Password" />
			</div>
			<button style="background: #00007d;width: 500px;font-size: 17px" type="submit" class="btn btn-primary">Click here to Login</button>
		</form>
		<br></br>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>