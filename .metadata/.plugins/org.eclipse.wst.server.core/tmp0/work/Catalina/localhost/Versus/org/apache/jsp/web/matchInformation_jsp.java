/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2017-01-22 02:27:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class matchInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<div id=\"team_information\" class=\"mfp-hide w3ls_small_dialog\">\r\n");
      out.write("\t<h2>경기 정보</h2>\r\n");
      out.write("\t<div class=\"modal-body agileits_modal_body team\">\r\n");
      out.write("\t<form action=\"#\">\r\n");
      out.write("\t\t<span class=\"teamdata\" id=\"teamdata_name\">팀이름 : </span><span class=\"teamdata\" id=\"teamdata_name1\">NCS 하이브리드</span><br>\r\n");
      out.write("\t\t<span class=\"teamdata\" id=\"teamdata_place\">장소 : </span><span class=\"teamdata\" id=\"teamdata_place1\">경기 중원구청 제2 종합운동장</span><br>\r\n");
      out.write("\t\t<span class=\"teamdata\" id=\"teamdata_date\">일시 : </span><span class=\"teamdata\" id=\"teamdata_date1\">16/12/06 19:00~21:00</span><br>\r\n");
      out.write("\t\t<span class=\"teamdata\" id=\"teamdata_level\">팀정보 : </span><span class=\"teamdata\" id=\"teamdata_level1\">Lv 2, 9승 2패</span><br>\r\n");
      out.write("\t\t<span class=\"teamdata\" id=\"teamdata_phone\">연락처 : </span><span class=\"teamdata\" id=\"teamdata_phone1\">010-7777-7777</span><br>\r\n");
      out.write("\t\t<span class=\"teamdata\" id=\"teamdata_uniform\">유니폼색상 : </span><span class=\"teamdata\" id=\"teamdata_uniform1\">핫핑크</span><br>\r\n");
      out.write("\t\t<div class=\"teamdata_con\">\r\n");
      out.write("\t\t\t<input type=\"checkbox\" disabled value=\"shower\" checked>샤워실\r\n");
      out.write("\t\t\t<input type=\"checkbox\" disabled value=\"parking\" checked>주차장\r\n");
      out.write("\t\t\t<input type=\"checkbox\" disabled value=\"neon\" checked>전광판\r\n");
      out.write("\t\t\t<input type=\"checkbox\" disabled value=\"whistle\" checked>호루라기\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<span>- 상세정보 -</span>\r\n");
      out.write("\t\t<span id=\"teamdata_more\">대관료 90,000</span>\r\n");
      out.write("\t\t<div class=\"teamdata_con\">\r\n");
      out.write("\t\t\t<div id=\"teamdata_map\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"신청하기\">\r\n");
      out.write("\t\t<table id=\"commentTable\" class=\"table table-condensed\"></table>\r\n");
      out.write("\t\t<table class=\"table table-condensed\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
