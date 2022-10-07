package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dbconnect;
import javax.servlet.http.Cookie;
import model.cookieverify;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public final class filterflights_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    Cookie[] ck = request.getCookies();
String uname = "none";
cookieverify obj=new cookieverify();
    
                            //response.setContentType("text/html");
                            //PrintWriter out =response.getWriter();
        
                            
                            //String name=ck[0].getValue();
                            //out.print("Welcome "+name);

                         if(!(request.getCookies()==null))
                    {
                    out.print(obj.verifyindex(request, response));
                   
                    
                    uname = "none";
                        for (Cookie aCookie : ck) {
                            String names = aCookie.getName();
 
                        if (names.equals("uname")) {
                            uname = aCookie.getValue();
                              break;
                                }       }
                                //out.print("Welcome "+uname); 
                      }



      
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px;\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Home</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style_booking.css\" media=\"screen\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/head_booking.css\" media=\"screen\">\n");
      out.write("    <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i\">\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body class=\"u-body u-xl-mode\">\n");
      out.write("    <section class=\"u-align-center u-clearfix u-image u-shading u-section-1\" id=\"carousel_3f04\" data-image-width=\"1280\" data-image-height=\"853\">\n");
      out.write("      <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("        <h2 class=\"u-text u-text-1\">Available Flights</h2>\n");
      out.write("        <p class=\"u-text u-text-2\"> Depending on your destination and date and other applications, the flight for that particular day is as follows</p>\n");
      out.write("        <div class=\"u-expanded-width u-table u-table-responsive u-table-1\">\n");
      out.write("          <table class=\"u-table-entity\">\n");
      out.write("            <colgroup>\n");
      out.write("              <col width=\"20%\">\n");
      out.write("              <col width=\"20%\">\n");
      out.write("              <col width=\"20%\">\n");
      out.write("              <col width=\"20%\">\n");
      out.write("              <col width=\"20%\">\n");
      out.write("            </colgroup>\n");
      out.write("            <thead class=\"u-palette-5-dark-3 u-table-header u-table-header-1\">\n");
      out.write("             <tr style=\"height: 70px;\">\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-1\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-2\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-3\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-4\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-5\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-6\"></th>\n");
      out.write("              </tr>\n");
      out.write("          \n");
      out.write("            </thead>\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("         ");
  
        //PrintWriter out=response.getWriter();  
        //out.println("<a href='index.html'>Add Employee</a>");  
        String flighttype1 =request.getParameter("flight-type1");
      
        
        
        
        
         String flightfrom =request.getParameter("flightfrom");
         String flightto =request.getParameter("flightto");
         String departdate =request.getParameter("departdate");
         String returndate =request.getParameter("returndate");
            
             out.println(flighttype1);
             if(flighttype1.equals("on")){
        List<model.flightinfobean> list=model.dbconnect.getAllflightfilter(flightfrom,flightto, departdate,returndate);  
             
        out.print("<table border='1' width='100%'>");  
        out.print("<tr><th>Flight ID</th><th> From</th><th>To </th><th>Depart Date</th><th>Return Date</th><th>Time</th><th>Section</th></tr>");  
        for(model.flightinfobean e:list){  
         out.print("<tr><td>"+"&nbsp "+e.getflightid()+"</td><td>"+"&nbsp"+e.getflightfrom()+"</td><td>"+"&nbsp"+e.getflightto()+"</td><td>"+"&nbsp"+e.getdepartdate()+"</td><td>"+"&nbsp"+e.getreturndate()+"</td><td>"+"&nbsp"+e.gettime()+"</td><td> <form action='book_a_flight.jsp' method='post'><input type='hidden' name='' value="+e.getflightid()+"> <input type='submit' value='Book'></form></td></tr>");  
        }  
        /*<form action='./movestafftog2' method='post'><input type='hidden' name='username' value="+e.getuname()+"> <input type='submit' value='Grade 02'>  </form>*/
        
        out.print("</table>");  
             }
             else{
        List<model.flightinfobean> list=model.dbconnect.getAllflightfilter2(flightfrom,flightto, departdate);  
             
        out.print("<table border='1' width='100%'>");  
        out.print("<tr><th>Flight ID</th><th> From</th><th>To </th><th>Depart Date</th><th>Time</th><th>Section</th></tr>");  
        for(model.flightinfobean e:list){  
         out.print("<tr><td>"+"&nbsp "+e.getflightid()+"</td><td>"+"&nbsp"+e.getflightfrom()+"</td><td>"+"&nbsp"+e.getflightto()+"</td><td>"+"&nbsp"+e.getdepartdate()+"</td><td>"+"&nbsp"+e.gettime()+"</td><td> <form action='book_a_flight.jsp' method='post'><input type='hidden' name='' value="+e.getflightid()+"> <input type='submit' value='Book' id='f4' ></form></td></tr>");  
        }  
        /*<form action='./movestafftog2' method='post'><input type='hidden' name='username' value="+e.getuname()+"> <input type='submit' value='Grade 02'>  </form>*/
        
        out.print("</table>"); 
             out.print("in else");
             }
        out.close(); 
          
      out.write(" \n");
      out.write("          \n");
      out.write(" \n");
      out.write("          \n");
      out.write("         </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
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
