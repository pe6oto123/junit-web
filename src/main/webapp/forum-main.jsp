<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forum</title>
</head>
<body>

	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");

	if (session.getAttribute("sessionUser") == null) {
	    response.sendRedirect("index.jsp");
	}
	%>

	<form id="nav-topic" action="forumSub"></form>

	<jsp:include page="navbar-user.jsp" />

	<form action="forum">
		<div class="container"
			style="position: absolute; top: 4rem; width: 99%; text-align: center;">
			<c:forEach items="${forumTopics}" var="forumTopics" varStatus="loop">
				<div style="border: ridge; margin-bottom: 2rem;">

					<div style="margin: 0.5rem;">
						<div style="text-align: left;">
							<button type="submit" name="index" value="${loop.index}"
								form="nav-topic"
								style="border: none; outline: none; background: none; cursor: pointer; color: #0000EE; padding: 0; text-decoration: underline; font-family: inherit; font-size: 1.5rem;">${forumTopics.name}</button>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</form>
</body>
</html>
