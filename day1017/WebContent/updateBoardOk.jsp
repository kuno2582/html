<%@page import="com.hanb.dao.BoardDao"%>
<%@page import="com.han.vo.BoardVo"%>
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
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	BoardVo b = new BoardVo(no,title,content);
	BoardDao bd = new BoardDao();
	int re = bd.updateBoardOk(b);
	
	if(re==1)
	{
		response.sendRedirect("listBoard.jsp");
	}
	else
	{
		System.out.println("수정에 실패하였습니다");
	}
	
	%>
</body>
</html>