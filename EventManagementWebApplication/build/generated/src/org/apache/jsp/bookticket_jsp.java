package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookticket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<form action=\"casb\" method=\"get\">\n");
      out.write("      \n");
      out.write("            Sevaname:<select name=\"sevaId\">\n");
      out.write(" ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </select>            \n");
      out.write("            \n");
      out.write("            Booking Date:<input type=\"text\" name=\"sevadate\">\n");
      out.write("     \n");
      out.write("            No of seats:<input type=\"text\" name=\"seatsbooked\">\n");
      out.write(" \n");
      out.write("    \n");
      out.write(" \n");
      out.write("     \n");
      out.write("     \n");
      out.write("                <input type=\"submit\" value=\"Book Ticket\"/>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("        </pre>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("f");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ListOfSevas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write(" <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.sevaId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.sevaName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('-');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.sevaId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
