<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<center><h1>Customer List </h1></center>

<script type="text/javascript">
function addUser() {
	
	document.fn.action="Registration.html";
	document.fn.submit();
}
function deleteUser() {
	
	document.fn.action="delete";
	document.fn.submit();
}
function editUser() {

	document.fn.action="edit.html";
	document.fn.submit();
}
</script>
</head>
<body>
	<form name="fn">


		<table border="1" align="center">
		    <th> Sr No </th>
			<th>First Name </th>
			<th>Address</th>
			<th>Email Id</th>
			<th>Last Name </th>
			<th>Mobile Number</th>
			<th>Password</th>
	
			
			
			<tr>
				<c:forEach items="${data}" var="user">
					<br>
					<td><input type="radio" name="fname" value="${user.fname}"></td>
					<td>${user.fname}</td>
					<td>${user.address}</td>
					<td>${user.email}</td>
					<td>${user.lname}</td>
					<td>${user.mobile}</td>
					<td>${user.pass}</td>
					
					
					<!-- <td><input type="button" value="EDIT" onclick="editUser()"></td>
					<td><input type="button" value="DELETE" onclick="deleteUser()"><td> -->
			</tr>
			</c:forEach>

		</table>

<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

</tr>
</table>
	</form>
</body>
</html>