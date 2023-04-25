<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
</head>
 
<body>
    <h2>Fill below form to register</h2>
 
    <form:form method="POST" modelAttribute="customer" action="register">
        <table>
            <tr>
                <td>Enter your Id:</td>
                <td><form:input path="cid" /></td>
            </tr>
            <tr>
                <td>Enter your name:</td>
                <td><form:input path="cname" /></td>
            </tr>
            <tr>
                <td>Enter your Password:</td>
                <td><form:input path="password" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"></td>
            </tr>
            </table>
            </form:form>