<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="AccountServlet" method="post">
		<div class="container" style="text-align: center">
			<h2>
				<b>Register</b>
			</h2>
			<hr>

			<div>
				<label for="username"><b>Username</b></label> <input type="text"
					placeholder="Enter Username" name="username" id="username" required>
			</div>
			<br>
			<div>
				<label for="password"><b>Password</b></label> <input type="password"
					placeholder="Enter Password" name="password" id="password" required>
			</div>
			<br>
			<div>
				<label for="admin">Admin</label> <input type="checkbox" id="admin"
					name="admin" value="admin">
			</div>

			<hr>

			<p style="color: red">
				<small>${error}</small>
			</p>

			<button name="action" value="register" type="submit"
				class="registerbtn">Register</button>
		</div>
	</form>
</body>
</html>
