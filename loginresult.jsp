<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
<%
	String result = request.getParameter("result");

%>

로그인 결과 : <%=result %> <br />
세션에 저장된 값 : <%= session.getAttribute("NAME") %>
</body>
</html>