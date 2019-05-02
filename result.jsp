<%@page import="com.najeth.DTO.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>

<% BoardDTO dto=(BoardDTO)request.getAttribute("dto");
%>

제목:<%=dto.getTitle() %><br>
내용:<%=dto.getContent() %><br>
작성자:<%=dto.getWriter() %><br>

</body>
</html>