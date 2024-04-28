package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" >\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" >\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" >\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" >\n");
      out.write("      <style>\n");
      out.write("            body{\n");
      out.write("                background-image:url(g12.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write(" background-size: 1600px 1500px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <section class=\"container\">\n");
      out.write("        <header><h1>Registration Page</h1></header>\n");
      out.write("      <form action=\"RegistrationServlet\" method=\"Post\" class=\"form\">\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("          <label> Name</label>\n");
      out.write("          <input type=\"text\" placeholder=\"Enter your name\" name=\"name\" id=\"name\" required >\n");
      out.write("        </div>\n");
      out.write("           <div class=\"input-box\">\n");
      out.write("          <label> Address</label>\n");
      out.write("          <input type=\"text\" placeholder=\"Enter your Address\" name=\"address\" id=\"address\"required >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("          <label>Email </label>\n");
      out.write("          <input type=\"email\" placeholder=\"Enter your email\" name=\"email\" id=\"email\" required >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <label>Mobile Number</label>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter your Mobile number\" name=\"mobile\" id=\"mobile\"   minlength=\"10\" required >\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <label>Birth Date</label>\n");
      out.write("            <input type=\"date\" placeholder=\"Enter your birth date\" name=\"date\" id=\"date\" required >\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <label>Gender</label>\n");
      out.write("             <div class=\"select-box\">\n");
      out.write("               <select name=\"gender\"id=\"gender\">\n");
      out.write("                <option hidden>Gender</option>\n");
      out.write("                <option>Male</option>\n");
      out.write("                <option> Female</option>\n");
      out.write("                <option>other</option>\n");
      out.write("             \n");
      out.write("              </select>\n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("           <div class=\"input-box\">\n");
      out.write("          <label> Department</label>\n");
      out.write("          <input type=\"text\" placeholder=\"Enter your name\" name=\"department\" id=\"department\" required />\n");
      out.write("        </div>\n");
      out.write("           <div class=\"input-box\">\n");
      out.write("          <label> Program</label>\n");
      out.write("          <input type=\"text\" placeholder=\"Enter your name\" name=\"program\" id=\"program\"required />\n");
      out.write("        </div>\n");
      out.write("              <div class=\"column\">\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <label>Branch</label>\n");
      out.write("             <div class=\"select-box\">\n");
      out.write("               <select name=\"branch\" id=\"branch\">\n");
      out.write("                <option hidden>Branch</option>\n");
      out.write("                <option>Computer Science Engineering</option>\n");
      out.write("                <option> Mechanical engineering</option>\n");
      out.write("                <option>Chemical Engineering</option>\n");
      out.write("                <option>Civil Engineering</option>\n");
      out.write("                <option>Electrical Engineering</option>\n");
      out.write("                <option>Automobile Engineering</option>\n");
      out.write("              </select>\n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <label>Admission year</label>\n");
      out.write("            <div class=\"select-box\">\n");
      out.write("               <select name=\"admission\" id=\"admission\">\n");
      out.write("                <option hidden>Year</option>\n");
      out.write("                <option>2020</option>\n");
      out.write("                <option>2021</option>\n");
      out.write("                <option>2022</option>\n");
      out.write("                <option>2023</option>\n");
      out.write("                <option>2024</option>\n");
      out.write("                <option> 2025</option>\n");
      out.write("              </select>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("          <label> Password </label>\n");
      out.write("          <input type=\"password\" placeholder=\"Enter your Password\" minlength=\"6\" name=\"password\" id=\"password\" required >\n");
      out.write("        </div>\n");
      out.write("          <input type=\"submit\" value=\"Registration\">\n");
      out.write("  \n");
      out.write("      </form>\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
