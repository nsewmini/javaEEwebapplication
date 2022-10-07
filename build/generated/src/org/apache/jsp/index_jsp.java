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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Phoenix_Airline_PVT</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style_index_login.css\"> <!--External CSS BODY-->\n");
      out.write("\n");
      out.write("<!--Background Video Internal CSS-->\n");
      out.write("  <style>\n");
      out.write("    * {\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    body {\n");
      out.write("      margin: 0;\n");
      out.write("      font-family: Arial;\n");
      out.write("      font-size: 17px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    #myVideo {\n");
      out.write("      position: fixed;\n");
      out.write("      right: 0;\n");
      out.write("      bottom: 0;\n");
      out.write("      min-width: 100%; \n");
      out.write("      min-height: 100%;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .content {\n");
      out.write("      position: fixed;\n");
      out.write("      bottom: 0;\n");
      out.write("      background: rgba(0, 0, 0, 0.5);\n");
      out.write("      color: #f1f1f1;\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 20px;\n");
      out.write("    }\n");
      out.write("</style> \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("      \n");
      out.write("  <video autoplay muted loop id=\"myVideo\">\n");
      out.write("        \n");
      out.write("    <source src=\"images/Singapore Changi Airport Jewel Cinematic Film Sony A6500_1080p.mp4\" type=\"video/mp4\"><!--background video source-->\n");
      out.write("    Your browser does not support HTML5 video.\n");
      out.write("    \n");
      out.write("  </video>\n");
      out.write("      \n");
      out.write("  <div class=\"cont\">\n");
      out.write("    <div class=\"form sign-in\">\n");
      out.write("           <p align=\"center\"><span class=\"userflag\">");
               
                            response.setContentType("text/html");
                            //PrintWriter out =response.getWriter();
        
                            Cookie[] ck = request.getCookies();
                            //String name=ck[0].getValue();
                            //out.print("Welcome "+name);

                            String uname = "none";
                            if(!(request.getCookies()==null))
                    {
                        for (Cookie aCookie : ck) {
                            String names = aCookie.getName();
 
                        if (names.equals("uname")) {
                            uname = aCookie.getValue();
                              break;
                                }       }
                                //out.print("Welcome "+uname);
                            
                        if(!(uname=="none"))
                        {
                         out.print("User Already Logged In");
                              }
                       
      }
      
      out.write("</span><p>\n");
      out.write("      <h2>Phoenix Airline | SIGN IN</h2>\n");
      out.write("       <form method=\"post\" action=\"./userlogin\">\n");
      out.write("      <label>\n");
      out.write("        <span>User Name</span>\n");
      out.write("        <input type=\"text\" name=\"uname\">\n");
      out.write("      </label>\n");
      out.write("      <label>\n");
      out.write("        <span>Password</span>\n");
      out.write("        <input type=\"password\" name=\"password\">\n");
      out.write("      </label>\n");
      out.write("           <button class=\"submit\" type=\"submit\" value=\"Login\">Sign In</button>\n");
      out.write("      \n");
      out.write("      <p class=\"forgot-pass\">Forgot Password ?</p>\n");
      out.write("        <p class=\"forgot-pass\"> Admin Login - <a href=\"adminlogin.jsp\">Click Here</a></p>\n");
      out.write("         <p class=\"forgot-pass\">Staff Login - <a href=\"stafflogin.jsp\">Click Here</a></p>\n");
      out.write("    \n");
      out.write("      <div class=\"social-media\">\n");
      out.write("        <ul>\n");
      out.write("          <li><img src=\"images/facebook.png\"></li>\n");
      out.write("          <li><img src=\"images/twitter.png\"></li>\n");
      out.write("          <li><img src=\"images/linkedin.png\"></li>\n");
      out.write("          <li><img src=\"images/instagram.png\"></li>\n");
      out.write("        </ul>\n");
      out.write("            </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("    <div class=\"sub-cont\">\n");
      out.write("      <div class=\"img\">\n");
      out.write("        <div class=\"img-text m-up\">\n");
      out.write("          <h2>New here?</h2>\n");
      out.write("          <p>Sign up and discover great amount of new opportunities!</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"img-text m-in\">\n");
      out.write("          <h2>One of us?</h2>\n");
      out.write("          <p>If you already has an account, just sign in. We've missed you!</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"img-btn\">\n");
      out.write("          <span class=\"m-up\">Sign Up</span>\n");
      out.write("          <span class=\"m-in\">Sign In</span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form sign-up\">\n");
      out.write("        <h2>Phoenix Airline | SIGN UP</h2>\n");
      out.write("         <form method=\"post\" action=\"./userregistration\">\n");
      out.write("        <label>\n");
      out.write("          <span>Full Name</span>\n");
      out.write("          <input type=\"text\" name=\"fullname\" required=\"\">\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("             <span>User Name</span>\n");
      out.write("          <input type=\"text\" name=\"uname\"required=\"\">\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("          <span>Email</span>\n");
      out.write("          <input type=\"email\" name=\"email\" required=\"\">\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("        \n");
      out.write("          <span>Password</span>\n");
      out.write("          <input type=\"password\" name=\"password\" required=\"\">\n");
      out.write("        </label>\n");
      out.write("        <label>\n");
      out.write("          <span>Confirm Password</span>\n");
      out.write("          <input type=\"password\" required=\"\">\n");
      out.write("        </label>\n");
      out.write("        \n");
      out.write("        <button type=\"submit\" class=\"submit\" value=\"Registration\">Sign Up Now</button>\n");
      out.write("         </form>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<script type=\"text/javascript\" src=\"./js/script_index.js\">\n");
      out.write("  var video = document.getElementById(\"myVideo\");\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
