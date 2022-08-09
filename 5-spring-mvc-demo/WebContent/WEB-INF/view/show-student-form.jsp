<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student form</title>
</head>
<body>

<form:form action = "processForm2" modelAttribute="student" >

First Name <form:input path="firstName" placeholder="John"/>
<br/>Last Name <form:input path="lastName" placeholder="Doe"/>
<input type="submit" />
</form:form>
</body>
</html>