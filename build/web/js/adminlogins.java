
package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.loginbean;
import model.dbconnect;


public class adminlogins extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adminlogins</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet adminlogins at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        //processRequest(request, response);
        
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        String username=request.getParameter("uname");
        String password=request.getParameter("password");
        password=model.hashing.getMd5(password);
        
        //LoginBean bean=new LoginBean();
        //bean.setname(username);
        //request.setAttribute("bean",bean);
        
        try
        {
        dbconnect con = new dbconnect();
        boolean rslt=con.checkadmin(username,password);
        if(rslt==true)
        {
        Cookie ck=new Cookie("uname",username);
        response.addCookie(ck);
        Cookie ck1=new Cookie("pwd",password);
        response.addCookie(ck1);
        //out.println("You have successfully logged!!!");
        RequestDispatcher rs = request.getRequestDispatcher("adminsdashboard.jsp");
        rs.include(request,response);
        }
        else
        {
        out.println("Username or Password incorrect");
         RequestDispatcher rs = request.getRequestDispatcher("adminlogin.jsp");
         rs.include(request, response);
        }
        
        }
        catch(Exception e)
        {
        
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
