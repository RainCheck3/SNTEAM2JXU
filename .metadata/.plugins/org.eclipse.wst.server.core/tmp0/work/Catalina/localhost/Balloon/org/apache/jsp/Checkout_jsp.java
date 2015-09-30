package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/shop-homepage.css\" rel=\"stylesheet\">\r\n");
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
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"row\">\t\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t    <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t        <img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t        <div class=\"caption\">\r\n");
      out.write("\t\t\t\t            <h4 class=\"pull-right\">$24.99</h4>\r\n");
      out.write("\t\t\t\t            <h4><a href=\"#\">First Product</a>\r\n");
      out.write("\t\t\t\t            </h4>\r\n");
      out.write("\t\t\t\t            <p>See more snippets like this online store item at <a target=\"_blank\" href=\"http://www.bootsnipp.com\">Bootsnipp - http://bootsnipp.com</a>.</p>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t        <div class=\"removefromcart\">\r\n");
      out.write("\t\t\t\t        <p> <input type=\"button\" value=\"Remove From Cart\" />   </p>\r\n");
      out.write("\t\t\t\t       </div>\r\n");
      out.write("\t\t\t\t        <div class=\"ratings\">\r\n");
      out.write("\t\t\t\t            <p class=\"pull-right\">15 reviews</p>\r\n");
      out.write("\t\t\t\t            <p>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t            </p>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t    <div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t        <img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t        <div class=\"caption\">\r\n");
      out.write("\t\t\t\t            <h4 class=\"pull-right\">$64.99</h4>\r\n");
      out.write("\t\t\t\t            <h4><a href=\"#\">Second Product</a>\r\n");
      out.write("\t\t\t\t            </h4>\r\n");
      out.write("\t\t\t\t            <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t        <div class=\"removefromcart\">\r\n");
      out.write("\t\t\t\t        <p> <input type=\"button\" value=\"Remove From Cart\" />   </p>\r\n");
      out.write("\t\t\t\t       </div>\r\n");
      out.write("\t\t\t\t        <div class=\"ratings\">\r\n");
      out.write("\t\t\t\t            <p class=\"pull-right\">12 reviews</p>\r\n");
      out.write("\t\t\t\t            <p>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t                <span class=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("\t\t\t\t            </p>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <!-- jQuery -->\r\n");
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
