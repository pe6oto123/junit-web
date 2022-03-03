<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
</head>
<body>
	<form action="AccountServlet" method="post">
		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" id="username" name="username" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" id="password" name="password" required>

			<button type="submit" name="action" value="login">Login</button>
			<p>
				Don't have an account? <a href="register.jsp" id="href-register">Register</a>
			</p>
		</div>

		<p style="color: red">
			<small>${error}</small>
		</p>
	</form>
</body>
</html>
