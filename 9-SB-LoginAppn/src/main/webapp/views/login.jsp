<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
</head>
 
<body>
    <h2 style="color:green">Customer Login Page</h2>
 
    <form:form method="POST" modelAttribute="login" action="/login">
        <table border="1">
            <tr>
                <td>Enter your name:</td>
                <td><form:input path="cname" /></td>
            </tr>
            <tr>
                <td>Enter your Password:</td>
                <td><form:input path="password" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Login"></td>
            </tr>
            </table>
            </form:form>