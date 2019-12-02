<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<table style="borderspacing:10px">
<tr>

<th >Id</th>
<th>Name</th>
<th>Gender</th>
</tr>
<tr>
<td style="text-align:center">${emp.getId()}</td>
<td style="text-align:center">${emp.getName() }</td>
<td style="text-align:center">${emp.getGender()}</td>
</tr>

<tr>
<th>Date of Birth</th>
<th>Fulltime Employee</th>
<th>Department</th>
</tr>
<tr>
<td style="text-align:center"><fmt:formatDate type='date' pattern='dd/MM/yyyy' dateStyle='short' value="${emp.getDate()}"/> </td>
<td style="text-align:center">${emp.getFulltime() }</td>
<td style="text-align:center">${emp.getDepartment()}</td>
</tr>
<tr>
<th>Salary</th>
</tr>
<tr>
<td><fmt:setLocale value="en_IN" /> <fmt:formatNumber value="${emp.getSalary() }" type="currency" minFractionDigits="0"></fmt:formatNumber></td>
</tr>
</table>



</body>
</html>