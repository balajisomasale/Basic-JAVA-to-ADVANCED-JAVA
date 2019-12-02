<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	</head>
<body>
<h2>Newsletter Preference</h2>
<form method="post" action="PreferenceHandlerServlet">
Include Promos and Offers:<input type="checkbox" name="status"<c:if test="${ses.preference }" >checked</c:if>/><br>
<button type="submit" >back</button>

</form>
</body>
</html>