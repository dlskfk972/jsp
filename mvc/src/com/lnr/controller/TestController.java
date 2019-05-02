package com.lnr.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lnr.model.GugudanModel;

public class TestController extends HttpServlet {
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

		String num = request.getParameter("num");
		String result = "";
		
		if (command.equals("/test/test1.lnr")) {
			System.out.println("test1"); // test1처리하는 모델 호출
		} else if (command.equals("/test/test2.lnr")) {
			System.out.println("test2"); // test2처리하는 모델 호출
		} else if (command.equals("/test/gugudan")) {
			GugudanModel gugudanModel = new GugudanModel();
			result = gugudanModel.getGuResult(num);
			
			request.setAttribute("test", result);
			
			RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
			rd.forward(request, response);
		}
	}
}