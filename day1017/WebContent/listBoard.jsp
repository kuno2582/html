<%@page import="java.util.ArrayList"%>
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
	<h2>게시판 목록</h2>
	<hr>
	<table border="1" width="80%">
	<tr>
	<td>글번호</td>
	<td>제목</td>
	<td>작성자</td>
	<td>날짜</td>
	</tr>
	
	<%
		request.setCharacterEncoding("euc-kr");
		
		BoardDao bd = new BoardDao();
		ArrayList<BoardVo> list = bd.listBoard();
		
		for(BoardVo b : list)
		{
			%>
			<tr>
			<td><%=b.getNo() %></td>
			<td><a href="datailBoard.jsp?no=<%=b.getNo() %>"><%=b.getTitle()%></a></td>
			<td><%=b.getWriter() %></td>
			<td><%=b.getRegdate() %></td>
			</tr>
			<%
		}
	%>
	
	
	
	
	</table>
	<a href="insertBoard.jsp">게시물 등록</a>
</body>
</html>