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

public final class flight_005fstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write(' ');
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
      out.write("    <link rel=\"stylesheet\" href=\"./css/style_flight_status.css\" media=\"screen\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/head_flight_status.css\" media=\"screen\">\n");
      out.write("    <meta name=\"generator\" content=\"Nicepage 4.10.5, nicepage.com\">\n");
      out.write("    <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i\">\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body class=\"u-body u-overlap u-overlap-contrast u-overlap-transparent u-xl-mode\">\n");
      out.write("    <section class=\"u-align-center u-clearfix u-image u-shading u-section-1\" id=\"carousel_3f04\" data-image-width=\"1280\" data-image-height=\"853\">\n");
      out.write("      <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("        <h2 class=\"u-text u-text-1\">Find</h2>\n");
      out.write("        <p class=\"u-text u-text-2\"> Depending on your destination and date and other applications, the flight for that particular day is as follows</p>\n");
      out.write("        <div class=\"u-expanded-width u-table u-table-responsive u-table-1\">\n");
      out.write("          <table class=\"u-table-entity\">\n");
      out.write("            <colgroup>\n");
      out.write("              <col width=\"25%\">\n");
      out.write("              <col width=\"25%\">\n");
      out.write("              <col width=\"25%\">\n");
      out.write("              <col width=\"25%\">\n");
      out.write("            </colgroup>\n");
      out.write("            <thead class=\"u-palette-5-dark-3 u-table-header u-table-header-1\">\n");
      out.write("              <tr style=\"height: 70px;\">\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-1\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-2\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-3\"></th>\n");
      out.write("                <th class=\"u-align-center u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-palette-5-dark-1 u-table-cell u-table-cell-4\"></th>\n");
      out.write("              </tr>\n");
      out.write("            <!--</thead>\n");
      out.write("            <tbody class=\"u-black u-table-body u-table-body-1\">\n");
      out.write("             <tr style=\"height: 43px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-5\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-6\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-7\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-8\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-9\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-10\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-11\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-12\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-13\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-14\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-15\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-16\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-17\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-18\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-19\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-20\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-21\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-22\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-23\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-24\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-25\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-26\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-27\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-28\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-29\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-30\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-31\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-32\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-33\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-34\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-35\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-36\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-37\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-38\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-39\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-40\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr style=\"height: 46px;\">\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-41\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-42\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-43\"></td>\n");
      out.write("                <td class=\"u-border-1 u-border-palette-5-dark-1 u-custom-color-1 u-table-cell u-table-cell-44\"></td>\n");
      out.write("              </tr>\n");
      out.write("            </tbody>\n");
      out.write("              -->\n");
      out.write("          </table>\n");
      out.write("                     \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("         ");
  
        //PrintWriter out=response.getWriter();  
        //out.println("<a href='index.html'>Add Employee</a>");  
         String ffID1=request.getParameter("ffID1");
         
          
          String flightid=request.getParameter("flightid");
         
       //out.println("123");
         
        if(ffID1.equals("1"))
        {
         
         List<model.flightstatusbean> list=model.dbconnect.getAllflightfilterstatus2(flightid);  
    
        out.print("<table border='1' width='100%'>");  
           out.print("<tr><th>FLIGHT ID</th><th> FROM</th><th>TO </th><th>TIME</th><th>FLIGHT STATUS</th></tr>");  
        for(model.flightstatusbean e:list){  
         out.print("<tr><td>"+"&nbsp "+e.getflightid()+"</td><td>"+"&nbsp"+e.getflightfrom()+"</td><td>"+"&nbsp"+e.getflightto()+"</td><td>"+"&nbsp"+e.gettime()+"</td> <td>"+"&nbsp"+e.getflghtstatus()+"</td></tr>");  
        }  
        /*<form action='./movestafftog2' method='post'><input type='hidden' name='username' value="+e.getuname()+"> <input type='submit' value='Grade 02'>  </form>*/
        
        out.print("</table>");  
 
        }
        else
        {
            String flightfrom =request.getParameter("flightfrom");
         String flightto=request.getParameter("flightto");
      List<model.flightstatusbean> listi=model.dbconnect.getAllflightfilterstatus(flightfrom,flightto);  
    
        out.print("<table border='1' width='100%'>");  
        out.print("<tr><th>FLIGHT ID</th><th> FROM</th><th>TO </th><th>TIME</th><th>FLIGHT STATUS</th></tr>");  
        for(model.flightstatusbean e:listi){  
         out.print("<tr><td>"+"&nbsp "+e.getflightid()+"</td><td>"+"&nbsp"+e.getflightfrom()+"</td><td>"+"&nbsp"+e.getflightto()+"</td><td>"+"&nbsp"+e.gettime()+"</td> <td>"+"&nbsp"+e.getflghtstatus()+"</td></tr>");  
        }  
        /*<form action='./movestafftog2' method='post'><input type='hidden' name='username' value="+e.getuname()+"> <input type='submit' value='Grade 02'>  </form>*/
       
        out.print("</table>");  
            
        }

       out.close(); 
          
      out.write(" \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("            ");
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
