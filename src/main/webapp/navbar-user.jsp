<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<form action="AccountServlet" method="post">
		<div class="container"
			style="background: white; position: fixed; top: 0; z-index: 1; width: 99%;">
			<hr>
			<div>
				<p style="display: inline">
					Logged in as:<b style="color:${sessionUser.isAdmin?'red':'black'}">
						${sessionUser.userName}</b>(
					<button type="submit" name="action" value="logout"
						style="border: none; outline: none; background: none; cursor: pointer; color: #0000EE; padding: 0; text-decoration: underline; font-family: inherit; font-size: inherit;">Log
						out</button>
					)
				</p>
			</div>
			<hr>
		</div>
	</form>
</body>
</html>
