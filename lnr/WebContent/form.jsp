<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="data.jsp" method="POST">
<input type="text" name="data" /><br/>

<input type="password" name="pw" /><br/>

<input type="radio" name="lecture" value="HTML"/>HTML<br/>
<input type="radio" name="lecture" value="CSS"/>CSS<br/>
<input type="radio" name="lecture" value="JSP"/>JSP<br/>

<input type="checkbox" name="hobby" value="movie"/>영화<br/>
<input type="checkbox" name="hobby" value="read"/>책읽기<br/>
<input type="checkbox" name="hobby" value="playphone"/>핸드폰하기<br/>

<input type="file" /><br/>
<input type="hidden" name="hidden1" value="test1"><br/>
<input type="hidden" name="hidden2" value="test2"><br/>
<input type="hidden" name="hidden3" value="test3"><br/>

<textarea rows="10" cols="50">
</textarea>
<br/>
<select name="fruit">
<option value="apple">사과
<option value="str">딸기
<option value="grape">포도
<option value="mango">망고
<option value="banana">바나나
</select>

<input type="submit" value="확인" />

</form>

</body>
</html>