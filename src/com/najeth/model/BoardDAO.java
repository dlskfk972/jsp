package com.najeth.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import com.najeth.DTO.BoardDTO;

public class BoardDAO {
	public BoardDTO read(int bno) {
		BoardDTO dto = new BoardDTO();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/lnr?useSSL=false&serverTimezone=Asia/Seoul";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "qw12345");
			
			stmt = conn.createStatement();
			String sql = "SELECT * FROM board WHERE bno="+bno;
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setWriter(rs.getString("writer"));
				dto.setDate(rs.getDate("wdate"));
				dto.setTime(rs.getTime("wtime"));
			}

			stmt.close();
			conn.close();
		} catch (Exception e) {

			e.printStackTrace();
		}		
		
	
		return dto;
	}
}
