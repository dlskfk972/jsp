package com.najeth.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.najeth.DTO.BoardDTO;
import com.najeth.model.BoardDAO;

public class BoardController  extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		String bno = request.getParameter("bno");
		
		if (command.equals("/board/list")) {
			System.out.println("list");
		} else if (command.equals("/board/read")) {
			BoardDAO dao = new BoardDAO();
			
			BoardDTO dto = dao.read(Integer.parseInt(bno));
			System.out.println(dto.toString());
			
			request.setAttribute("dto", dto);
			
			RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
			rd.forward(request, response);
			
		} else if (command.equals("/board/register")) {
			System.out.println("register");
		} else if (command.equals("/board/modify")) {
			System.out.println("modify");
		} else if (command.equals("/board/delete")) {
			System.out.println("delete");
		}
	}
}