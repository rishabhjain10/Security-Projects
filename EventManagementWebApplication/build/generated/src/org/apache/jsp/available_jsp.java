package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class available_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write(" \n");
      out.write("margin:80px 80px 100px 100px;\n");
      out.write("}\n");
      out.write("a{color:orange\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("div#fixedheader {\n");
      out.write("position:fixed;\n");
      out.write("top:0px;\n");
      out.write("left:0px;\n");
      out.write("width:100%;\n");
      out.write("background:maroon;\n");
      out.write("padding:20px;\n");
      out.write(" }\n");
      out.write("\n");
      out.write("div#fixedfooter {\n");
      out.write("position:fixed;\n");
      out.write("bottom:0px;\n");
      out.write("left:0px;\n");
      out.write("width:100%;\n");
      out.write("color:orange;\n");
      out.write("background:maroon;\n");
      out.write("padding:8px;\n");
      out.write("}\n");
      out.write("        form{\n");
      out.write("           font-size: 200%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <div id=\"fixedheader\">\n");
      out.write("        <a href=\"devoteeHomePage.jsp\"  style=\"text-decoration:none\" >HOME</a>\n");
      out.write("<p align=\"right\" >\n");
      out.write("    <a href=\"\"  style=\"text-decoration:none\" ><h3 >LOGOUT</h3></a>\n");
      out.write("<a href=\"mailto:ttdseva@gmail.com\" style=\"text-decoration:none\">Write to us |</a> \n");
      out.write("<a href=\"contactframe.html\"  style=\"text-decoration:none\">Contact Us</a>\n");
      out.write("\n");
      out.write("</p></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"fixedfooter\">\n");
      out.write("<a href=\"tcframe.html\" target=\"_top\" style=\"text-decoration:none\">Terms & Conditions</a>\n");
      out.write("<p style=\"color:orange  align=left\"> © Copyright 2015.Tirumala Tirupati Devasthanams</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    <body>\n");
      out.write("        <pre>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<center><form action=\"bts\" method=\"get\">\n");
      out.write("        <p> Seats are avaialable</p>\n");
      out.write("        <input type=\"submit\" value=\"book now\">\n");
      out.write("        </form></center>\n");
      out.write("        </pre>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("     ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
