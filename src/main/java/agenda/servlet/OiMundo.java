package agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiMundo extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// escreve texto
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Primeira servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ola Mundo!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
