<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./userJoinAction.jsp"method="post">
	<input type="text" name="userID">
	<input type="password" name="userPassword">
	<input type="submit" value="회원가입">
</form>
<form action="./UseDB.jsp" method="post">
	<input type="submit" value="조회">
</form>

</body>
</html>