<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="insertBoardOk.jsp" method="post">
	글제목<input type="text" name="title"><br><br>
	작성자<input type="text" name="writer"><br><br>
	비밀번호<input type="password" name="pwd"><br><br>
	글내용<br>
	<textarea cols="100" rows="10" name="content"></textarea><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>