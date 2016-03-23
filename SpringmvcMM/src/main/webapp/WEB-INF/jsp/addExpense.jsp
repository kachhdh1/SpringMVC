<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Expense</title>
</head>
<body>
	<h1>Add Expenses</h1>
	<form:form commandName="expense">
		<table>
			<tr>
				<td>Add Expense for today :</td>
				<td>
					<form:input path="amount"/> <form:input path="person"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Enter Expense"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>