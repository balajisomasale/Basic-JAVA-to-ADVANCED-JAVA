<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<form name="employeeForm" action="DisplayEmployeeServlet" method="Post">
	<c:out value="${'Employee Details'}" />
	<br />

	<table>

		<tr>
			<td>Id</td>
			<td>:<c:out value="${emp.getId()}" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td>:<input type="text" name="name"
				value="<c:out value="${emp.getName() }"/>" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>:<input type="radio" name="gender" value="male"
				<c:if test="${emp.getGender() eq 'male'}">checked</c:if>>Male<input
				type="radio" name="gender" value="female">Female
			</td>
		</tr>



		<tr>
			<td>Date Of Birth</td>
			<td>:<input type="text" name="dateOfLaunch"
				value="<fmt:formatDate type='date' pattern='dd/MM/yyyy' dateStyle='short' value="${emp.getDate()}"/>" /></td>
		</tr>
		<tr>
			<td>Fulltime Employee</td>
			<td><input type="checkbox" name="fulltime" value="fulltime"
				<c:if test="${emp.getFulltime() eq 'fulltime'}">checked</c:if>></td>
		</tr>
		<tr>
			<td>Department</td>
			<td>:<select name="department">



					<c:forEach var="i" items="${arr }">
						<option value="${i}"
							<c:if test="${i eq emp.getDepartment()}" >Selected</c:if>>${i}
						</option>

					</c:forEach>
			</select>

			</td>
		</tr>
		
		<tr>
			<td>Salary</td>
			<td>:<input type="text" name="salary"
				value="<c:out value="${emp.getSalary() }"/>" /></td>
		</tr>
		<input type="hidden" name="id" value="${emp.getId() }"/>
	</table>
	
		<input type="submit" value="submit">
		</form>
</body>
</html>