package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;
import model.dbconnect;
import model.cookieverify;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public final class dashboardstaff_005f01_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("<h2>");
             
Cookie[] ck = request.getCookies();
String uname = "none";
cookieverify obj=new cookieverify();

                            //response.setContentType("text/html");
                            //PrintWriter out =response.getWriter();
        
                            //Cookie[] ck = request.getCookies();
                            //String name=ck[0].getValue();
                            //out.print("Welcome "+name);

                            //String uname = "none";
                      
                    if(!(request.getCookies()==null))
                    {
                    out.print(obj.verifyindex(request, response));
                   
                    
                    uname = "none";
                        for (Cookie aCookie : ck) {
                            String names = aCookie.getName();
 
                        if (names.equals("uname")) {
                            uname = aCookie.getValue();
                              break;
                                }       }}
                        if(uname=="none"){response.sendRedirect("index.jsp");}        
                      
                            
      
      out.write("</h2>\t\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Staff G1 Dashboard</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/rooms.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/table.css\">\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <!-- userlogin\n");
      out.write("   flight status home\n");
      out.write("   staff login\n");
      out.write("   staff dash 02\n");
      out.write("   admin dash\n");
      out.write("   profile contact us and staf dash 01 table\n");
      out.write("   proceeders\n");
      out.write("   databse tables \n");
      out.write("   filter flight\n");
      out.write("   fliter flight status\n");
      out.write("   staff functions ss\n");
      out.write("   Cookies \n");
      out.write("   -->\n");
      out.write("  \n");
      out.write("   \n");
      out.write("   \n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"sidebar\">\n");
      out.write("    <div class=\"logo-details\">\n");
      out.write("      <i class='bx bxl-c-plus-plus'></i>\n");
      out.write("      <span class=\"logo_name\">Phoenix <br>Airline</span>\n");
      out.write("    </div>\n");
      out.write("      <ul class=\"nav-links\">\n");
      out.write("           <li>\n");
      out.write("            <a href=\"dashboardstaff_01.jsp\" class=\"active\">\n");
      out.write("            <i class='bx bx-list-ul' ></i>\n");
      out.write("            <span class=\"links_name\">User Details</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("          <a href=\"staffdashG1flightinfo.jsp\" >\n");
      out.write("            <i class='bx bx-grid-alt' ></i>\n");
      out.write("            <span class=\"links_name\">Flight Details</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("        <li>\n");
      out.write("           \n");
      out.write("          <a href=\"staffdashG1ticketdetails.jsp\" >\n");
      out.write("            <i class='bx bx-box' ></i>\n");
      out.write("            <span class=\"links_name\">Ticket Details</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("      \n");
      out.write("           <a href=\"staffdashusersmsg.jsp\" >\n");
      out.write("            <i class='bx bx-pie-chart-alt-2'  ></i>\n");
      out.write("            <span class=\"links_name\">Messages Box</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("               <!--\n");
      out.write("         <li>\n");
      out.write("               <a href=\"\">\n");
      out.write("            <i class='bx bx-box' ></i>\n");
      out.write("            <span class=\"links_name\"> </span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("            -->\n");
      out.write("      <li class=\"\">\n");
      out.write("          <a href=\"index.jsp\">\n");
      out.write("            <i class='bx bx-log-out'></i>\n");
      out.write("            <span class=\"links_name\">Home</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("        <li class=\"log_out\"> \n");
      out.write("          <a href=\"./logout\">\n");
      out.write("            <i class='bx bx-log-out'></i>\n");
      out.write("            <span class=\"links_name\">Log out</span>\n");
      out.write("          </a>            \n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("  <section class=\"home-section\">\n");
      out.write("    <nav>\n");
      out.write("      <div class=\"sidebar-button\">\n");
      out.write("        <i class='bx bx-menu sidebarBtn'></i>\n");
      out.write("        <span class=\"dashboard\">Grade 01 Staff Dashboard</span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"search-box\">\n");
      out.write("        <input type=\"text\" placeholder=\"Search...\">\n");
      out.write("        <i class='bx bx-search' ></i>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"profile-details\">\n");
      out.write("        <img src=\"images/profile.jpg\" alt=\"\">\n");
      out.write("        <span class=\"admin_name\">");
out.print(uname);
      out.write("</span>\n");
      out.write("        <i class='bx bx-chevron-down' ></i>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <div class=\"home-content\">\n");
      out.write("      <div class=\"overview-boxes\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("               <div class=\"box-topic\">Total G1 Staff Members</div>\n");
      out.write("            <div class=\"number\">\n");
      out.write("                ");

                dbconnect obje =new dbconnect();
                String G1empcount=obje.G1empcount();
                out.print(G1empcount);
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"indicator\">\n");
      out.write("              <i class='bx bx-up-arrow-alt'></i>\n");
      out.write("              <span class=\"text\">Up from now</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <i class='bx bx-cart-alt cart'></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("             <div class=\"box-topic\">Total Bookings</div>\n");
      out.write("            <div class=\"number\">\n");
      out.write("            ");

                String flightbookcount=obje.flightbookcount();
                out.print(flightbookcount);
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"indicator\"> \n");
      out.write("              <i class='bx bx-up-arrow-alt'></i>\n");
      out.write("              <span class=\"text\">Up from now</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <i class='bx bxs-cart-add cart two' ></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("            <div class=\"box-topic\">Total Users</div>\n");
      out.write("            <div class=\"number\">");

                String usercount=obje.usercount();
                out.print(usercount);
                
      out.write("</div>\n");
      out.write("            <div class=\"indicator\">\n");
      out.write("              <i class='bx bx-up-arrow-alt'></i>\n");
      out.write("              <span class=\"text\">Up from now</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <i class='bx bx-cart cart three' ></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("          <div class=\"right-side\">\n");
      out.write("            <div class=\"box-topic\">Total G2 Staff Members</div>\n");
      out.write("            <div class=\"number\">");

                String G2empcount=obje.G2empcount();
                out.print(G2empcount);
                
      out.write("</div>\n");
      out.write("            <div class=\"indicator\">\n");
      out.write("              <i class='bx bx-down-arrow-alt down'></i>\n");
      out.write("              <span class=\"text\">Up from now</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <i class='bx bxs-cart-download cart four' ></i>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("<!--\n");
      out.write("<div class=\"sales-boxes\">\n");
      out.write("        <div class=\"recent-sales box\">\n");
      out.write("          <div class=\"title\">User Details Update</div>\n");
      out.write("          <form action=\"./updateuser\" method=\"POST\">\n");
      out.write("             <span>Full Name</span>\n");
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
      out.write("             <button type=\"submit\" class=\"submit\" value=\"Update\">Update Info</button>\n");
      out.write("          </form>\n");
      out.write("          \n");
      out.write("             <div class=\"button\">\n");
      out.write("            <a href=\"#\">See All</a> \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("          -->\n");
      out.write("      <div class=\"sales-boxes\">\n");
      out.write("        <div class=\"recent-sales box\">\n");
      out.write("          <div class=\"title\">User Details</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("          ");

              
        //PrintWriter out=response.getWriter();  
        //out.println("<a href='index.html'>Add Employee</a>");  
        out.println("<br>");  
          
        List<model.userdetailsbean> list=model.dbconnect.getuserdetails();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Username</th><th>Fullname</th><th>Email</th><th></th><th></th>");  
        for(model.userdetailsbean e:list){  
         out.print("<form action='./updateuser' method='post'><tr><td>"+e.getusername()+"<input type='hidden' name='username' value="+e.getusername()+"> </td><td><input type='text' name='fullname' value="+e.getfullname()+"> </td><td><input type='text' name='email' value="+e.getemail()+"> </td><td><input type='submit' value='Update'>  </form></td> <td> <form action='./deleteusers' method='post'><input type='hidden' name='username' value="+e.getusername()+"> <input type='submit' value='Delete'>  </form></td> </tr>");  
        }  
        out.print("</table>");  
        out.close(); 
          
      out.write("\n");
      out.write("          <div class=\"button\">\n");
      out.write("            <a href=\"#\">See All</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
