package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-color: white;\n");
      out.write("                background-image: url(\"Images/Background.jpg\");\n");
      out.write("                background-size: 100% 100%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: center;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            .tbl{\n");
      out.write("                color:whitesmoke;\n");
      out.write("                background-image: url(\"Images/bg2.jpg\");\n");
      out.write("                border:10px solid;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                background-repeat:round;\n");
      out.write("                height:150px;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                border:1px solid white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("         .header_tbl\n");
      out.write("         {\n");
      out.write("            \n");
      out.write("             width:95%;\n");
      out.write("         }\n");
      out.write("         .td_style\n");
      out.write("         {\n");
      out.write("             border-radius:12px; \n");
      out.write("             \n");
      out.write("             height:100px;\n");
      out.write("             width:10%;\n");
      out.write("             font-family: cursive;\n");
      out.write("             font: bold;\n");
      out.write("             color:black;\n");
      out.write("         }\n");
      out.write("         .tr_style\n");
      out.write("         {\n");
      out.write("             background-color:azure;\n");
      out.write("             border:1px solid white;\n");
      out.write("             opacity: 0.7;\n");
      out.write("             \n");
      out.write("         }\n");
      out.write("            </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"header_tbl\">\n");
      out.write("            <tr>\n");
      out.write("   <td class=\"header_div\">\n");
      out.write("        <table class=\"tbl\">\n");
      out.write("            <tr>\n");
      out.write("            <form action=\"DataFetched.jsp\" method=\"post\">\n");
      out.write("                \n");
      out.write("                  <td>Pin Code</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pin\" class='btn'></td>\n");
      out.write("            </form>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                    <td><h3>Or</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <form action=\"DataFetched2.jsp\" method=\"post\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Country Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"country\" class='btn'></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City</td>\n");
      out.write("                    <td><input type=\"text\" name=\"city\" class='btn'></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"Check Weather\" class=\"btn\">\n");
      out.write("                       </td>\n");
      out.write("                </tr>\n");
      out.write("                      \n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("        </td>\n");
      out.write("        <td style=\"width:200px;\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </td>\n");
      out.write("            <td style=\"width:200px;\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </td>\n");
      out.write("            <td style=\"background-image: url('Images/sunny.jpg'); background-repeat: round; width:200px; border-radius: 40px; opacity: 0.5;\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("   \n");
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
}
