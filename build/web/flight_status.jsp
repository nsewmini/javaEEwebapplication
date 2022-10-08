<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.dbconnect"%>
<%@page import="javax.servlet.http.Cookie"%>
<%@page import="model.cookieverify"%>
<% 
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



      %>
<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <title>Home</title>
    <link rel="stylesheet" href="./css/style_flight_status.css" media="screen">
    <link rel="stylesheet" href="./css/head_flight_status.css" media="screen">
    <meta name="generator" content="Nicepage 4.10.5, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    
  </head>
  <body class="u-body u-overlap u-overlap-contrast u-overlap-transparent u-xl-mode">
    <section class="u-align-center u-clearfix u-image u-shading u-section-1" id="carousel_3f04" data-image-width="1280" data-image-height="853">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-1"> Searching Results</h2>
        <p class="u-text u-text-2"> phoenix Airlines will do everything practical to ensure we provide the most accurate flight status information at all times. However, situations change quickly and many factors affect our scheduled operations. Please understand that a flight listed as "Delayed" may, depending on the circumstances, depart "On Time." Unless our flight has been listed as "cancelled" we suggest you always check-in for the original scheduled departure time of your flight.

</p>
        <div class="u-expanded-width u-table u-table-responsive u-table-1">
         
                     
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>    

         <%  
        //PrintWriter out=response.getWriter();  
        //out.println("<a href='index.html'>Add Employee</a>");  
         String ffID1=request.getParameter("ffID1");
         
          
          String flightid=request.getParameter("flightid");
         
       //out.println("123");
         
        if(ffID1.equals("1"))
        {
         
         List<model.flightstatusbean> list=model.dbconnect.getAllflightfilterstatus2(flightid);  
    
        out.print("<table border='1' width='100%'>");  
           out.print("<tr><th>FLIGHT ID</th><th> Departure</th><th>Approach </th><th>TIME</th><th>FLIGHT STATUS</th></tr>");  
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
          %> 
        </div>
      </div>
    </section>
  </body>
</html>


 
            