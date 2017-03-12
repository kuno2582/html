package com.hanb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.han.db.ConnectionProvider;
import com.han.vo.BoardVo;

public class BoardDao {

	public int updateBoardOk(BoardVo b){
		int re = -1;
		try{
			String sql = "update board set title='"+b.getTitle()+"', content='"+b.getContent()+"', regdate=sysdate where no="+b.getNo();
			
			Connection conn = ConnectionProvider.getConnection("madang", "madang");
			Statement stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
			
			if(re==1)
			{
				System.out.println("수정에 성공하였습니다.");
			}
			else
			{
				System.out.println("수정에 실패하였습니다");
			}
			
			ConnectionProvider.close(conn, stmt, null);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return re;
		
	}
	public BoardVo updateBoard(int no){
		BoardVo b = new BoardVo();
		
		try{
			
			String sql = "select title, content from board where no="+no;
			Connection conn = ConnectionProvider.getConnection("madang", "madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				b.setTitle(rs.getString(1));
				b.setContent(rs.getString(2));
			}
			
			ConnectionProvider.close(conn, stmt, rs);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return b;
	}
	public int deleteBoard(int no) {
		int re = -1;
		try{
			String sql = "delete board where no="+no;
			Connection conn = ConnectionProvider.getConnection("madang", "madang");
			Statement stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
			
			if(re==1)
			{
				System.out.println("삭제에 성공하였습니다.");
			}
			else
			{
				System.out.println("삭제에 실패하였습니다.");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	
		return re;
	}
	
	public String conPwd(int no) {
		String pwd="";
		try{
			String sql = "select pwd from board where no="+no;
			
			Connection conn = ConnectionProvider.getConnection("madang", "madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				pwd=rs.getString(1);
			}
			
			ConnectionProvider.close(conn, stmt, rs);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return pwd;
	}
	
	public BoardVo getBoard(int no) {
		
		BoardVo b = new BoardVo();
		try{
			String sql = "select * from board where no="+no;
			String sql1 = "update board set hit=hit+1 where no="+no;
			Connection conn = ConnectionProvider.getConnection("madang", "madang");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql1);
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setWriter(rs.getString(3));
				b.setRegdate(rs.getString(4));
				b.setHit(rs.getInt(5));
				b.setContent(rs.getString(6));
				b.setPwd(rs.getString(7));
			}
			
			ConnectionProvider.close(conn, stmt, rs);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return b;
	}
	
	public int insertBoard(BoardVo b) {
		int re = -1;
		try{
			String sql = "insert into board values (seq_board.nextval,'"+b.getTitle()+"','"+b.getWriter()+"',sysdate,0,'"+b.getContent()+"','"+b.getPwd()+"')";
			Connection conn = ConnectionProvider.getConnection("madang", "madang");
			Statement stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
			
			if(re==1)
			{
				System.out.println("등록에 성공");
			}
			else
			{
				System.out.println("등록에 실패");
			}
			ConnectionProvider.close(conn, stmt, null);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return re;
	}
	public ArrayList<BoardVo> listBoard() {
		
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		
		try{
			String sql = "select * from board";
			
			Connection conn = ConnectionProvider.getConnection("madang", "madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				BoardVo bv = new BoardVo();
				bv.setNo(rs.getInt(1));
				bv.setTitle(rs.getString(2));
				bv.setWriter(rs.getString(3));
				bv.setRegdate(rs.getString(4));
				bv.setHit(rs.getInt(5));
				bv.setContent(rs.getString(6));
				bv.setPwd(rs.getString(7));
				
				list.add(bv);
			}
			ConnectionProvider.close(conn, stmt, rs);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return list;
	}
}
