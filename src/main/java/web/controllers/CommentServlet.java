package web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.db.ForumTopicDB;
import web.user.User;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private HttpSession session;

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	RequestDispatcher dispatcher;

	int indexMain = Integer.parseInt(request.getParameter("indexMain"));
	int indexSub = Integer.parseInt(request.getParameter("indexSub"));
	String comment = request.getParameter("comment").toString();

	request.setAttribute("indexMain", indexMain);
	request.setAttribute("indexSub", indexSub);
	request.setAttribute("forumTopicContent", ForumTopicDB.getForumSubContent(indexMain, indexSub));

	if (comment.length() != 0) {
	    session = request.getSession();
	    User user = (User) session.getAttribute("sessionUser");
	    ForumTopicDB.addComment(indexMain, indexSub, user, comment); 

	    //response.sendRedirect("forum-sub-content.jsp");
	    dispatcher = request.getRequestDispatcher("forum-sub-content.jsp");
	    dispatcher.forward(request, response);
	    
	    return;
	}

	
	request.setAttribute("error", "*Comment cannot be empty");

	dispatcher = request.getRequestDispatcher("forum-sub-content.jsp");
	dispatcher.forward(request, response);

    }

}
