<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student form</title>
</head>
<body>

<form:form action = "radiobuttonSubmit" modelAttribute="student" >

First Name <form:input path="firstName" placeholder="John"/>
<br/>Last Name <form:input path="lastName" placeholder="Doe"/>
<br/>
<form:select path="country">
	<form:option value="India" name="India"/>
	<form:option value="Canada" name="Canada"/>
	<form:option value="USA" name="USA"/>
</form:select>
<br/>Favourite Language<br/>
<form:radiobutton path="favouriteLanguage" value="Java"/>Java 
<form:radiobutton path="favouriteLanguage" value="C#"/>C# 
<form:radiobutton path="favouriteLanguage" value="JS"/>Javascript 
<input type="submit" />
</form:form>
</body>
</html>