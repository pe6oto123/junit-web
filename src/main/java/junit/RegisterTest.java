package junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import web.controllers.AccountServlet;
import web.user.User;

public class RegisterTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Before
    public void setUp() throws Exception {
	MockitoAnnotations.initMocks(this);
    }

    /*
     * @Test public void testRegisterForm() throws IOException, ServletException {
     * when(request.getParameter("action")).thenReturn("register");
     * when(request.getParameter("username")).thenReturn("user");
     * when(request.getParameter("password")).thenReturn("123");
     * when(request.getParameter("admin")).thenReturn("true");
     * 
     * AccountServlet accountServlet = new AccountServlet();
     * accountServlet.doPost(request, response);
     * 
     * // accountServlet.printUsers(); }
     */

    @Test
    public void testLoginForm() throws IOException, ServletException {
	when(request.getParameter("action")).thenReturn("register");
	when(request.getParameter("username")).thenReturn("user");
	when(request.getParameter("password")).thenReturn("123");
	when(request.getParameter("admin")).thenReturn("true");

	AccountServlet accountServlet = new AccountServlet();
	accountServlet.doPost(request, response);

	when(request.getParameter("action")).thenReturn("login");
	when(request.getParameter("username")).thenReturn("user");
	when(request.getParameter("password")).thenReturn("123");

	HttpSession session = mock(HttpSession.class);

	User user = accountServlet.getUsers().stream().filter(s -> s.getUserName().equals("user")).findFirst()
		.orElse(null);

	verify(session).setAttribute("sessionUser", user);

	accountServlet.doPost(request, response);

    }

}
