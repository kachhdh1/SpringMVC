<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Expense</title>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(document).ready(
			
		function(){
			$.getJSON('http://localhost:8080/SpringmvcMM/categories.json',{
				ajax:true
			},function(data){
				var html = '<option value="">--Please Select--</option>';
				var len = data.length;
				for(var i=0;i<len;i++){
					html+='<option value="'+data[i].name+'">'
					+data[i].name+'</option>';
				}
				html+='</option>';
				
				$("#category").html(html);
			});
		}
		
	);
</script>

</head>
<body>
	<h1>Add Expenses</h1>
	<form:form commandName="expense">
		<table>
			<tr>
				<td>Add Expense for today :</td>
				<td>
					<form:input path="amount"/> <%-- <form:input path="person"/> --%>
				</td>
				<td>
					<form:select id="category" path="category"/>
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