package com.han.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getConnection(String user, String pwd)
	{
		Connection conn = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@203.236.209.228:1521:XE",user,pwd);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return conn;
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs)
	{
		try{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			if(conn!=null)
			{
				conn.close();;
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
