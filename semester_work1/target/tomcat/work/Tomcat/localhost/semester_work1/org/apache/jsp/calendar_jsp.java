/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-11-11 07:34:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/psrts/_header.jsp", Long.valueOf(1699688080899L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Header</title>\r\n");
      out.write("\r\n");
      out.write("    <script src = \"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <div class=\"profile\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pictures/logo.jpg\" alt=\"Profile Picture\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"menu\">\r\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/welcome.jsp\">Home</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/profile\">Profile</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/bookadd.jsp\">Add book</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/calendar.jsp\">Calendar</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Calendar</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/styles2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"href=\"styles/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            background-color: #ffe0e5;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            text-align: right;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input {\r\n");
      out.write("            width: 240px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            background-color: #4e4647;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button:hover {\r\n");
      out.write("            background-color: #999;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1 class=\"logo\">Make an appointment</h1>\r\n");
      out.write("        <form class=\"form-container\">\r\n");
      out.write("            <label for=\"date\">Дата:</label>\r\n");
      out.write("            <input type=\"date\" id=\"date\" name=\"date\"><br>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"time\">Время:</label>\r\n");
      out.write("            <input type=\"time\" id=\"time\" name=\"time\"><br>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"location\">Место:</label>\r\n");
      out.write("            <input type=\"text\" id=\"location\" name=\"location\"><br>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"subject\">Тема:</label>\r\n");
      out.write("            <input type=\"text\" id=\"subject\" name=\"subject\"><br>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\">create</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/view/psrts/_header.jsp(9,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/js/bootstrap.min.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/view/psrts/_header.jsp(11,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/styles/bootstrap.min.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}
