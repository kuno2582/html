/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.72
 * Generated at: 2017-01-22 08:22:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Matchmaking a Mobile App Flat Bootstrap Responsive\r\n");
      out.write("\tWebsite Template | Main :: W3layouts</title>\r\n");
      out.write("<!-- For-Mobile-Apps-and-Meta-Tags -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"Matchmaking Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, SmartPhone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script> -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<!-- //For-Mobile-Apps-and-Meta-Tags -->\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("\tmedia=\"all\">\r\n");
      out.write("<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<link rel='stylesheet' id='fluid_dg-css' href='css/fluid_dg.css'\r\n");
      out.write("\ttype='text/css' media='all'>\r\n");
      out.write("<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\" />\r\n");
      out.write("<!-- //Custom Theme files -->\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\" />\r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Monoton\" rel=\"stylesheet\">\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script type='text/javascript' src='js/jquery-2.2.3.min.js'></script>\r\n");
      out.write("<!-- 다음지도 api -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"//apis.daum.net/maps/maps3.js?apikey=9978627f24a383749e985ea4d7323101\"></script>\r\n");
      out.write("<!-- //js -->\r\n");
      out.write("<!-- web-fonts -->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Courgette'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link\r\n");
      out.write("\thref='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- //web-fonts -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, true);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "maketeam.jsp", out, true);
      out.write("\r\n");
      out.write("\t<div class=\"nav-container hidden hideNav w3_nav\">\r\n");
      out.write("\t\t<ul class=\"nav-list\">\r\n");
      out.write("\t\t\t<li class=\"list-item active\"><a href=\"main.jsp\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-home\"></i></a></li>\r\n");
      out.write("\t\t\t<li class=\"list-item\"><a href=\"matchstatus.jsp\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-info-sign\" ></i></a></li>\r\n");
      out.write("\t\t\t<li class=\"list-item\"><a href=\"info.jsp\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-cog\"></i></a></li>\r\n");
      out.write("\t\t\t<li class=\"list-item\"><a href=\"faq.jsp\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-text-size\" ></i></a></li>\r\n");
      out.write("\t\t\t<li class=\"list-item\"><a href=\"#make-team\" class=\"popup-with-zoom-anim\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-picture\"></i></a></li>\r\n");
      out.write("\t\t\t<li class=\"list-item\"><a href=\"#make_match\" class=\"popup-with-zoom-anim\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-envelope\"></i></a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"ban\" class=\"agileinfo_menu w3l_menu\">\r\n");
      out.write("\t\t<button class=\"btn-nav w3layouts_btn\">\r\n");
      out.write("\t\t\t<img src=\"images/nav-icon.png\" width=\"30px\" height=\"25px\">\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"agileinfo_menu_center\">\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<a href=\"main.html\"><span id=\"mainV\">V</span>ersus<span>For Exciting <i>Matches</i></span></a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"agileinfo_menu_right\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#small-dialog\"\r\n");
      out.write("\t\t\t\t\tclass=\"play-icon popup-with-zoom-anim\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"images/login.png\" width=\"35px\" height=\"35px\"></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"banner-bottom-info\">\r\n");
      out.write("\t\t<div class=\"bottom-teaminfo\">\r\n");
      out.write("\t\t\t<div class=\"bottom-status-left\"><a href=\"#\"><img src=\"images/back.png\" width=\"25px\" height=\"25px\"></a></div>\r\n");
      out.write("\t\t\t<div class=\"bottom-status-center\"><div class=\"tinfo-center-con\"><div class=\"con-cell\"><b>FAQ &amp; REPORT</b></div></div></div>\r\n");
      out.write("\t\t\t<div class=\"bottom-status-right\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<p class=\"faq-p\">FAQ</p>\r\n");
      out.write("\t\t<div id=\"faq-div\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<p class=\"faq-p\">신고하기</p>\r\n");
      out.write("\t\t<div id=\"report-div\">\r\n");
      out.write("\t\t\t<span>팀이름: </span><input type=\"text\" name=\"report-teamname\"><input type=\"submit\" value=\"신고\">\r\n");
      out.write("\t\t\t<p>신고사유</p>\r\n");
      out.write("\t\t\t<div id=\"report-reason\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer_nav\">\r\n");
      out.write("\t\t\t<!-- <div class=\"ft_con\"> -->\r\n");
      out.write("\t\t\t\t<div class=\"ft_nav1\"><a href=\"main.jsp\"><img src=\"images/matching.png\" width=\"40px\" height=\"40px\"></a></div>\r\n");
      out.write("\t\t\t\t<div class=\"ft_nav2\"><a href=\"matchstatus.jsp\"><img src=\"images/status.png\" width=\"40px\" height=\"40px\"></a></div>\r\n");
      out.write("\t\t\t\t<div class=\"ft_nav3\"><a href=\"info.jsp\"><img src=\"images/teamInfo.png\" width=\"40px\" height=\"40px\"></a></div>\r\n");
      out.write("\t\t\t\t<div class=\"ft_nav4\"><a href=\"faq.jsp\"><img src=\"images/qna.png\" width=\"40px\" height=\"40px\"></a></div>\r\n");
      out.write("\t\t\t<!-- </div> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.easing.1.3.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/fluid_dg.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/versus.js'></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
