package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>\n");
      out.write("            userlogin page\n");
      out.write("              \n");
      out.write("        </title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image:url(B14.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write(" background-size: 1600px 750px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"container\">\n");
      out.write("              <header><h1>LogIn Page</h1></header>\n");
      out.write("              <form action=\"loginServlet\" method=\"post\"  class=\"form\">\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <label> Name</label>\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Enter your Name\" required>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"input-box\">\n");
      out.write("                <label> Password</label>\n");
      out.write("                <input type=\"password\"placeholder=\"Enter your Password\" minlength=\"8\" name=\"password\" required>\n");
      out.write("            </div>\n");
      out.write("                ");
String error=(String)session.getAttribute("error");
                session.removeAttribute("error");
                if(error!=null){
                
      out.write("\n");
      out.write("                <div> <p>");
      out.print(error);
      out.write("</p></div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("             <div class=\"button\">\n");
      out.write("                \n");
      out.write("                <input type=\"Submit\" value=\"LogIn\">\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
