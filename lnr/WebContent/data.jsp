<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String data=request.getParameter("data");
String pw=request.getParameter("pw");
String lecture=request.getParameter("lecture");
String[]hobbys=request.getParameterValues("hobby");
String file =request.getParameter("file");

System.out.println("data="+data);
System.out.println("pw="+pw);
System.out.println("lecture="+lecture);
for(String hobby:hobbys){
	System.out.println("hobby="+hobby);
}
System.out.println("file="+file);

%>

</body>
</html>