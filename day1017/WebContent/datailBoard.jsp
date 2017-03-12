<%@page import="com.han.vo.BoardVo"%>
<%@page import="java.awt.print.Book"%>
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
	BoardVo b = bd.getBoard(no);
	
		%>
		<table border="1" width="80%">
		<input type="hidden" name="no" value="<%=no%>">
		<tr>
		<td>글번호 : <%=b.getNo()%></td> 
		<td>글제목 : <%=b.getTitle()%></td> 
		<td>작성자 : <%=b.getWriter()%></td>
		<td>작성일 : <%=b.getRegdate()%></td>
		<td>조회수 : <%=b.getHit()%></td>
		</tr>
		<hr>
		<tr>
		<td colspan="5"><textarea readonly="readonly" rows="10" cols="100"><%=b.getContent() %></textarea></td>
		</tr> 
		</table>
		<a href="preupdateBoard.jsp?no=<%=no%>">수정</a>
		<a href="predeleteBoard.jsp?no=<%=no%>">삭제</a>
		
</body>
</html>