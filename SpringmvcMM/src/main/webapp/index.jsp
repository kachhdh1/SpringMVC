<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h2>Welcome to SpringMVC (index)</h2>

<a href="${contextPath}/addExpense.html">Add Expense</a></br>
<a href="${contextPath}/pdfs/kes.pdf">Spring JPA Pdf</a>
</body>
</html>
