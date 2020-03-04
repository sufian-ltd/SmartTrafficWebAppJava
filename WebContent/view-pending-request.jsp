<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Pending Request</title>
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
		<h3>Here is the list of all pending request..........!!!!!!</h3>
		<hr>
		<br>
		<h4>${msg}</h4>
		<table class='table table-bordered'>
			
			<tr>
				<th>ID</th>
				<th>User Name</th>
				<th>Password</th>
				<th>Contact</th>
				<th>NID</th>
				<th>Address</th>
				<th>Driving License</th>
				<th>Vehicle License</th>
				<th>Vehicle Type</th>
				<th>Request</th>
				<th>Request</th>
			</tr>
			<c:forEach var="temp" items="${REQUEST_LIST}">
				<c:url var="linkAccept" value="AcceptRequestServlet">
					<c:param name="id" value="${temp.id}"></c:param>
				</c:url>
				<c:url var="linkReject" value="RejectRequestServlet">
					<c:param name="id" value="${temp.id}"></c:param>
				</c:url>
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
					<td><a href="${linkAccept}">Accept</a></td>
					<td><a href="${linkReject}">Reject</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>