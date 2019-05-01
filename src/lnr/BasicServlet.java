package lnr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			           HttpServletResponse response) throws ServletException,IOException
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		int total=0;
		for(int i=0;i<10;i++) {
			total +=i;
		}
		PrintWriter out=response.getWriter(); 
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("0부터9까지의 합:"+total);
		out.println("</body>");
		out.println("</html>");

}
}
