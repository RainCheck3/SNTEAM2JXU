package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/header.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/shop-homepage.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Shopping Portal</a>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li style=\"float:right\">\r\n");
      out.write("                        <a href=\"MyAccount.jsp\">My Account</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"float:right\">\r\n");
      out.write("                        <a href=\"./html/Login.html\">Login</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"float:right\">\r\n");
      out.write("                        <a href=\"Checkout.jsp\">Checkout</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("    </nav>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 class=\"center-text\">My Account</h1>\r\n");
      out.write("\t    <!-- jQuery -->\r\n");
      out.write("\t    <ul class=\"nav nav-tabs\">\r\n");
      out.write("\t    \t<li class=\"active\"><a href=\"#tab1\" data-toggle=\"tab\">Edit Account</a>\r\n");
      out.write("\t\t  \t</li>\r\n");
      out.write("\t\t  \t<li><a href=\"#tab2\" data-toggle=\"tab\">Orders</a>\r\n");
      out.write("\t\t  \t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div class=\"tab-content margin-bottom\">\r\n");
      out.write("\t\t\t<div class=\"tab-pane active\" id=\"tab1\">\r\n");
      out.write("\t\t\t\t<h3 class=\"center-text\">Edit Account</h3>\r\n");
      out.write("\t\t\t\t<form name=\"updateCustomer\" action=\"UpdateCustomerServlet\"method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t    \t<label for=\"fName\">First Name:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control account-input\" name=\"fName\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t    \t<label for=\"lName\">Last Name:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control account-input\" name=\"lName\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t    \t<label for=\"email\">Email address:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" class=\"form-control account-input\" name=\"email\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t\t\t<label>Address</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"street\">Street:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control account-input\" name=\"street\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"city\">City:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control account-input\" name=\"city\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"state\">State:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control account-input\" name=\"state\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"zip\">Zip:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control account-input\" name=\"zip\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"country\">Country:</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control account-input\" name=\"country\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group quarter-width\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default account-input\">Submit</button>\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tab-pane\" id=\"tab2\">\r\n");
      out.write("\t\t\t\t<h3 class=\"center-text\">Orders</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
