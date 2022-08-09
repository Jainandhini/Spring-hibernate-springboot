<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome student</title>
</head>
<body>
Hello Student!- checkbox test
<br/>
Student name: ${student.firstName} ${student.lastName}<br/>
Favourite OS:
<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
<li>${temp}</li>
</c:forEach>
</ul>
 
</body>
</html>