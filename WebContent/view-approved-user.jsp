<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Approved User</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<body
	style="font-family: serif; font-size: 16px; background: #000; color: #fff;">
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); //HTTP 1.1
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		response.setHeader("Expires", "0"); //proxies
		if (session.getAttribute("admin") == null) {
			response.sendRedirect("login-form.jsp");
		}
	%>
	<jsp:include page="navadmin.jsp"></jsp:include>
	<div class='container' align="center">
		<h3>All Available Approved Users</h3>
		<hr>
		<br>
		<table class='table table-bordered'>
			<tr>
				<th>ID</th>
				<th style="font-weight: bold;">User Name</th>
				<th>Password</th>
				<th>Contact</th>
				<th>NID</th>
				<th>Address</th>
				<th>Driving License</th>
				<th>Vehicle License</th>
				<th>Vehicle Type</th>
				<th>Valid/Invalid</th>
			</tr>
			<c:forEach var="temp" items="${APPROVED_LIST}">
				<tr>
					<td>${temp.id}</td>
					<td>${temp.userName}</td>
					<td>${temp.password}</td>
					<td>${temp.contact}</td>
					<td>${temp.nid}</td>
					<td>${temp.address}</td>
					<td>${temp.drivingLicense}</td>
					<td>${temp.vehicleLicense}</td>
					<td>${temp.vehicle}</td>
					<td>Valid User</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>