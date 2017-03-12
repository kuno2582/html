package com.han.vo;

public class BoardVo {

		private int no;
		private String title;
		private String writer;
		private String regdate;
		private int hit;
		private String content;
		private String pwd;
		public BoardVo(int no, String title, String writer, String regdate, int hit, String content, String pwd) {
			super();
			this.no = no;
			this.title = title;
			this.writer = writer;
			this.regdate = regdate;
			this.hit = hit;
			this.content = content;
			this.pwd = pwd;
		}
		
		public BoardVo(String title, String writer, String content, String pwd) {
			super();
			this.title = title;
			this.writer = writer;
			this.content = content;
			this.pwd = pwd;
		}

		public BoardVo(int no, String title, String content) {
			super();
			this.no = no;
			this.title = title;
			this.content = content;
		}

		public BoardVo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getRegdate() {
			return regdate;
		}
		public void setRegdate(String regdate) {
			this.regdate = regdate;
		}
		public int getHit() {
			return hit;
		}
		public void setHit(int hit) {
			this.hit = hit;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		
		
		
}
