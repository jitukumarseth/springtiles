<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login.jsp</title>
</head>
<body>
	<center>
		<h1>User Account Login</h1>
		<f:form action="verifyUser.jlc" method="post" commandName="user">
			<table>
				<tr>
					<td>Username</td>
					<td><f:input path="username" /></td>
					<td><font color=red size=5> <f:errors path="username"></f:errors>
					</font></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><f:input path="password" />
					<td><font color=red size=5> <f:errors path="password"></f:errors>
					</font></td>
			</table>
			<br />
			<input type="submit" value="Account Login" />
		</f:form>
	</center>
</body>
</html>