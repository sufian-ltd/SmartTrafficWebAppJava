<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<h3>All Invoice List for User : ${userName}</h3>
		<hr>
		<br/>
		<table class='table table-bordered'>
			<tr>
				<th>Police Notice</th>
				<th>1st Reason</th>
				<th>2nd Reason</th>
				<th>3rd Reason</th>
				<th>4th Reason</th>
				<th>5th Reason</th>
				<th>6th Reason</th>
			</tr>
			<c:forEach var="temp" items="${INVOICE_LIST}">
				<tr>
					<td>${temp.policeNotice}</td>
					<td>${temp.reasonOne}</td>
					<td>${temp.reasonTwo}</td>
					<td>${temp.reasonThree}</td>
					<td>${temp.reasonFour}</td>
					<td>${temp.reasonFive}</td>
					<td>${temp.reasonSix}</td>
				</tr>
			</c:forEach>
		</table>
			<!-- 			<hr> -->
			<%-- 			<h5>User ID : ${id}</h5> --%>
			<%-- 			<h4>The Police Notice : ${temp.policeNotice}</h4> --%>
			<%-- 			<c:if test="${temp.reasonOne!=null}"> --%>
			<%-- 				<h4>First Reason is : ${temp.reasonOne}</h4> --%>
			<%-- 			</c:if> --%>
			<%-- 			<c:if test="${temp.reasonTwo!=null}"> --%>
			<%-- 				<h4>Second Reason is : ${temp.reasonTwo}</h4> --%>
			<%-- 			</c:if> --%>
			<%-- 			<c:if test="${temp.reasonThree!=null}"> --%>
			<%-- 				<h4>Third Reason is : ${temp.reasonThree}</h4> --%>
			<%-- 			</c:if> --%>
			<%-- 			<c:if test="${temp.reasonFour!=null}"> --%>
			<%-- 				<h4>Fourth Reason is : ${temp.reasonFour}</h4> --%>
			<%-- 			</c:if> --%>
			<%-- 			<c:if test="${temp.reasonFive!=null}"> --%>
			<%-- 				<h4>Fifth Reason is : ${temp.reasonFive}</h4> --%>
			<%-- 			</c:if> --%>
			<%-- 			<c:if test="${temp.reasonSix!=null}"> --%>
			<%-- 				<h4>Sixth Reason is : ${temp.reasonSix}</h4> --%>
			<%-- 			</c:if> --%>
	</div>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>