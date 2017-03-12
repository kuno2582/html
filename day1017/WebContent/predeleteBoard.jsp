<%@page import="com.hanb.dao.BoardDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.han.db.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao bd = new BoardDao();
	String pwd = bd.conPwd(no);

%>
	<form action="predeleteBoard2.jsp" method="post">
	<input type="hidden" name="no" value="<%=no%>">
	<input type="hidden" name="pwd" value="<%=pwd%>">
	비밀번호:<input type="password" name="password" >
	<input type="submit" value="확인">
	</form>
</body>
</html>