package lnr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			doPost(request, response);
			}
			

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		
		String username = request.getParameter("username");
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/lnr2?useSSL=false&serverTimezone=Asia/Seoul";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "qw12345");
			stmt = conn.createStatement();
			String sql = "INSERT INTO user VALUES ('"+username+"','"+userid+"','"+userpw+"')";
			stmt.executeUpdate(sql);

			conn.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}


