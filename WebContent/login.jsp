<%@ page import="java.time.LocalDateTime"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<%= LocalDateTime.now()  %>

<form action="./validateDetails" method="post">
Username <input type="text" name="username"/>
Password <input type="password" name="password"/> 
<input type="submit"/>
</form>
</body>
</html>