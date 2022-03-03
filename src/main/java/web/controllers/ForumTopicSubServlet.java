package web.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.db.ForumTopicDB;

/**
 * Servlet implementation class ForumTopicSubServlet
 */
@WebServlet("/ForumTopicSubServlet")
public class ForumTopicSubServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	int index = Integer.parseInt((String) request.getParameter("index"));

	request.setAttribute("topicIndex", index);
	request.setAttribute("forumSubTopics", ForumTopicDB.getForumSubTopics(index));
	RequestDispatcher dispatcher = request.getRequestDispatcher("forum-sub.jsp");

	dispatcher.forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

    }
}
