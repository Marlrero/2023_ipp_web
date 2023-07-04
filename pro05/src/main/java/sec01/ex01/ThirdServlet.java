package sec01.ex01;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ThirdServlet init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("ThirdServlet destroy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("ThirdServlet doGet");
	}

}
