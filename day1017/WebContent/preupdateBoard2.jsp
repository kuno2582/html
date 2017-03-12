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
	String pwd = request.getParameter("pwd");
	String password = request.getParameter("password");
	
	try{
		if(pwd.equals(password))
		{
			response.sendRedirect("updateBoard.jsp?no="+no);
		}
		
		else
		{
			response.sendRedirect("fail.jsp");
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	%>
</body>
</html>