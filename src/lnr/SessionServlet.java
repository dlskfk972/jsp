package lnr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("rext/html;charset=UTF-8");
		HttpSession session = request.getSession();
		session.setAttribute("NAME", "LNR");
		session.setAttribute("HP", "012345678");
		
		PrintWriter out=response.getWriter();
		
		out.println("세션에 값이 저장되었습니다.");
		
	}
	

}
