<%@page import="com.han.vo.BoardVo"%>
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
		request.setCharacterEncoding("euc-kr");
		int no = Integer.parseInt(request.getParameter("no"));
	
		BoardDao bd = new BoardDao();
		BoardVo b = bd.updateBoard(no);
				%>
				<form action="updateBoardOk.jsp" method="post">
				<input type="hidden" name="no" value="<%=no%>">
				글제목<input type="text" name="title" value="<%=b.getTitle()%>"><br><br>
				글내용<br>
				<textarea cols="100" rows="10" name="content"><%=b.getContent()%></textarea><br>
				<input type="submit" value="등록">
				
</body>
</html>