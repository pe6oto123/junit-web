<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ForumSubContent</title>
</head>
<script type="text/javascript">
		const getData = () => {
			var comment = document.getElementsByName("comment-field");
			document.getElementById("comment").value = comment[0].value;
			document.getElementById("post-comment").submit();
		}
	</script>
<body>

	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");

	if (session.getAttribute("sessionUser") == null) {
	    response.sendRedirect("index.jsp");
	}
	%>

	<form id="post-comment" action="postComment">
		<input type="hidden" id="comment" name="comment" /> <input> <input
			type="hidden" id="indexMain" name="indexMain" value="${indexMain}" />
		<input type="hidden" id="indexSub" name="indexSub" value="${indexSub}" />
	</form>

	<jsp:include page="navbar-user.jsp" />

	<form action="forumContent">
		<div class="container"
			style="position: relative; top: 4rem; width: 50%; margin: auto; word-break: break-word;">
			<div style="border: ridge; margin-bottom: 0.5rem;">
				<div style="margin: 0.5rem;">
					<div style="text-align: left;">${forumTopicContent.name}</div>
				</div>
			</div>
			<div style="border: ridge; margin-bottom: 0.5rem;">
				<div style="margin: 0.5rem;">
					<div style="text-align: left;">${forumTopicContent.content}</div>
				</div>
			</div>
			<div class="comment-section" style="margin-bottom: 7rem;">
				<div class="comment-post" style="margin-bottom: 3rem;">
					<textarea id="comment-field" name="comment-field" rows="5"
						style="width: 99%; resize: none;"></textarea>
					<button onclick="getData()" type="button" form="post-comment"
						style="width: 5rem; height: 2rem; position: relative; float: right;">
						Post</button>
					<p style="color: red;">${error}</p>
				</div>
				<c:forEach items="${forumTopicContent.comments}" var="comment"
					varStatus="loop">
					<div style="border: ridge; margin-bottom: 1rem;">
						<b style="color:${comment.user.isAdmin?'red':'black'}">
							${comment.user.userName}</b>
						<hr>
						${comment.comment}
					</div>
				</c:forEach>
			</div>
		</div>
	</form>


</body>
</html>