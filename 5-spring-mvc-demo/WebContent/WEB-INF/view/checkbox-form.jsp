<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student form</title>
</head>
<body>

<form:form action = "checkboxSubmit" modelAttribute="student" >

First Name <form:input path="firstName" placeholder="John"/>
<br/>Last Name <form:input path="lastName" placeholder="Doe"/>
<br/>
<br/>Favourite Os<br/>
<form:checkbox path="operatingSystems" value="MS Windows"/>MS Windows 
<form:checkbox path="operatingSystems" value="Linux"/>Linux 
<form:checkbox path="operatingSystems" value="Mac"/>Mac 
<input type="submit" />
</form:form>
</body>
</html>