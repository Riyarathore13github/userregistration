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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    body{\n");
      out.write("        background-image: url(B40.jpg);\n");
      out.write("background-repeat: no-repeat;\n");
      out.write(" background-size: 1600px 750px;\n");
      out.write("    }\n");
      out.write("#home\n");
      out.write("{\n");
      out.write(" font-family:\"Times New Roman\", Times, serif;\n");
      out.write("color:white;\n");
      out.write("text-align:center;\n");
      out.write("font-size:2rem;\n");
      out.write("}\n");
      out.write("#home ul li\n");
      out.write("{\n");
      out.write("display:inline-block;\n");
      out.write("padding:25px;\n");
      out.write("}\n");
      out.write("#home{\n");
      out.write("   \n");
      out.write("    background: rgba(173,255,47,0.7);\n");
      out.write("\n");
      out.write("}\n");
      out.write(".hello{\n");
      out.write("   text-align:center;\n");
      out.write("   font-family:\"Times New Roman\", Times, serif;\n");
      out.write("color:white;\n");
      out.write("\n");
      out.write("font-size:3.5rem;\n");
      out.write("}\n");
      out.write(".hello2{\n");
      out.write("     text-align:center;\n");
      out.write("   font-family:\"Times New Roman\", Times, serif;\n");
      out.write("color:white;\n");
      out.write("\n");
      out.write("font-size:2.5rem;\n");
      out.write("}\n");
      out.write(".hello3{\n");
      out.write("    margin-top:150px;\n");
      out.write("     text-align:center;\n");
      out.write("   font-family:\"Times New Roman\", Times, serif;\n");
      out.write("color:white;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=home>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.html\">Home</a></li>\n");
      out.write("<li><a href=\"login.html\">LogIn</a></li>\n");
      out.write("<li><a href=\"registration.html\">Registration</a></li>\n");
      out.write("<li><a href=\"login.html\">LogOut</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("    <div class=\"hello2\">\n");
      out.write("        <h1 >  Welcome to our Website </h1></div>\n");
      out.write("<div class=\"hello3\">\n");
      out.write("<p><h1>\n");
      out.write("    The Success group of Institute of Engineering & Technology: \n");
      out.write("    Where Excellence is Cultivated. An Accredited Centre of Excellence dedicated to shaping future leaders.\n");
      out.write("   </h1>\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
