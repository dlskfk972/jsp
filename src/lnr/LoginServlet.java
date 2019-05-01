package lnr;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/lnr2?useSSL=false&serverTimezone=Asia/Seoul";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "qw12345");
			stmt = conn.createStatement();
			String sql = "select *from user where id='"+id+"' and pw='"+pw+"'";
			stmt.executeUpdate(sql);

			conn.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	
		PrintWriter out = response.getWriter();
		out.println("id = " + id + "<br /> pw = " + pw);
		
		
		if(id.equals("test") && pw.equals("1234")) {
			// 로그인 성공, 세션 부여
			HttpSession session = request.getSession();
			session.setAttribute("NAME", "test");
			
			response.sendRedirect("/loginresult.jsp?result=success");
			
		} else {
			// 로그인 실패, 세션 부여 X
			
			response.sendRedirect("/loginresult.jsp?result=failed");
		}
		
	}
}