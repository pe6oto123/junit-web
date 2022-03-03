package web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.user.User;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private List<User> users = new ArrayList<User>();
    private HttpSession session;

    /**
     * Default constructor.
     */
    public AccountServlet() {
	// TODO Auto-generated constructor stub
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action = request.getParameter("action");

	switch (action) {
	case "login":
	    login(request, response);
	    break;
	case "logout":
	    logout(request, response);
	    break;
	case "register":
	    register(request, response);
	    break;

	default:
	    throw new IllegalArgumentException("Unexpected value: " + action);
	}
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	String userName = request.getParameter("username");
	String password = request.getParameter("password");

	for (User user : users) {
	    if (user.getUserName().equals(userName)) {
		if (user.getPassword().equals(password)) {

		    session = request.getSession();
		    session.setAttribute("sessionUser", user);
		    response.sendRedirect("forum");

		    return;
		}
	    }
	}

	request.setAttribute("error", "*Wrong login info");
	RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");

	dispatcher.forward(request, response);

    }

    private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {

	session = request.getSession();
	session.removeAttribute("sessionUser");
	session.invalidate();

	response.sendRedirect("index.jsp");

    }

    private void register(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String userName = request.getParameter("username");
	String password = request.getParameter("password");

	boolean isUserExist = false;
	for (User user : users) {
	    if (user.getUserName().equals(userName)) {
		isUserExist = true;
		break;
	    }
	}
	if (isUserExist) {
	    request.setAttribute("error", "*User already exists");
	    RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");

	    dispatcher.forward(request, response);

	} else {
	    users.add(new User(userName, password, request.getParameter("admin") == null ? false : true));

	    response.sendRedirect("index.jsp");

	}
    }

}
