/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.29
 * Generated at: 2018-10-04 07:33:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deliveryPart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tmargin-left: -200px;\r\n");
      out.write("\tmargin-top: -180px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("}\r\n");
      out.write(".space{\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("}\r\n");
      out.write(".div_right{\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write(".px_up {\r\n");
      out.write("\tfont-size: 2px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=UTF-8>\r\n");
      out.write("<title>QR 안심택배</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\t\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<div class = \"div_right\"><button onclick = \"location.href='deliveryCreate.qr'\">택배기사 정보 추가</button></div>\r\n");
      out.write("\t\t<p class = \"px_up\">　</p>\r\n");
      out.write("\t\t<form method=\"post\" action=\"deliveryPart.qr\">\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><hr> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><h1>택배사 입력하기</h1></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><hr></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label for=\"number\">주문번호 입력</label></td>\r\n");
      out.write("\t\t\t\t\t\t <td><input type=\"text\" name=\"number\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label for=\"company\">배송번호 입력</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"company\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><hr></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan =\"2\"><p class = \"space\">　</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td colspan = \"2\"><hr></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><h1>택배사 정보 확인</h1></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><hr></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label for=\"companyName\">택배사 입력</label> </td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"companyName\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label for=\"company_password\">택배사 비밀번호</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" name=\"company_password\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td colspan = \"2\"><hr></td></tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"신청하기\" class=\"sub\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
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
