<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import  = "javax.servlet.http.Cookie"%>
 <%@page import  = "java.io.PrintWriter"%>
 <%@page import="model.dbconnect"%>
 <%@page import="model.cookieverify"%>
<h2><%             
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
                      
                            
      %></h2>	
<!DOCTYPE html>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title>Staff G1 Dashboard</title>
    <link rel="stylesheet" href="./css/rooms.css">
    <link rel="stylesheet" href="./css/table.css">
   
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="navbar">
    <div class="logo-details">
      <i class='bx bxl-c-plus-plus'></i>
      <span class="logo_name">Phoenix <br>Airline</span>
    </div>
      <ul class="nav-links">
           <li>
            <a href="dashboardstaff_01.jsp" >
            <i class='bx bx-list-ul' ></i>
            <span class="links_name">User Details</span>
          </a>
        </li>
        <li>
          <a href="staffdashG1flightinfo.jsp" >
            <i class='bx bx-grid-alt' ></i>
            <span class="links_name">Flight Details</span>
          </a>
        </li>
       
        <li>
           
          <a href="staffdashG1ticketdetails.jsp"  >
            <i class='bx bx-box' ></i>
            <span class="links_name">Ticket Details</span>
          </a>
        </li>
        <li>
      
           <a href="staffdashusersmsg.jsp" class="active">
            <i class='bx bx-pie-chart-alt-2'  ></i>
            <span class="links_name">Messages Box</span>
          </a>
        </li>
               <!--
         <li>
               <a href="">
            <i class='bx bx-box' ></i>
            <span class="links_name"> </span>
          </a>
        </li>
            -->
      <li class="">
          <a href="index.jsp">
            <i class='bx bx-log-out'></i>
            <span class="links_name">Home</span>
          </a>
        </li>
       
        <li class="log_out"> 
          <a href="./logout">
            <i class='bx bx-log-out'></i>
            <span class="links_name">Log out</span>
          </a>            
        </li>
      </ul>
  </div>
  <section class="home-section">
    <nav>
      <div class="sidebar-button">
        <i class='bx bx-menu sidebarBtn'></i>
        <span class="dashboard">Grade 01 Staff Dashboard</span>
      </div>
      <div class="search-box">
        <input type="text" placeholder="Search...">
        <i class='bx bx-search' ></i>
      </div>
      <div class="profile-details">
        <img src="images/profile.jpg" alt="">
        <span class="admin_name"><%out.print(uname);%></span>
        <i class='bx bx-chevron-down' ></i>
      </div>
    </nav>

  
    <div class="home-content">
      
      <div class="sales-boxes">
        <div class="recent-sales box">
          <div class="title">Reservation Ticket Details</div>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
          <%
              
        //PrintWriter out=response.getWriter();  
        //out.println("<a href='index.html'>Add Employee</a>");  
        out.println("<br>");  
          
        List<model.usercontactmsgbean> list=model.dbconnect.getAllusercontactMsg();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Name</th><th>Email</th><th>Phone No</th><th>Messege</th>");  
        for(model.usercontactmsgbean e:list){  
         out.print("<tr><td>"+"&nbsp "+e.getname()+"</td><td>"+"&nbsp"+e.getemail()+"</td><td>"+"&nbsp "+e.phoneno()+"</td> <td>"+"&nbsp "+e.messege()+"</td> </tr>");  
        }  
        out.print("</table>");  
        out.close(); 
          %>
          <div class="button">
            <a href="#">See All</a>
          </div>
        </div>
        
      </div>
    </div>
  </section>


</body>
</html>