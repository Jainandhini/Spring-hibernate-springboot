<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student form</title>
</head>
<body>

<form:form action = "dropDownSubmit" modelAttribute="student" >

First Name <form:input path="firstName" placeholder="John"/>
<br/>Last Name <form:input path="lastName" placeholder="Doe"/>
<br/>
<form:select path="country">
	<form:options items="${student.countryOptions}" />
</form:select>
<input type="submit" />
</form:form>
</body>
</html>