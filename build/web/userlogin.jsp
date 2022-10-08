
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Phoenix_Airline_PVT</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="./css/style_index_login.css"> <!--External CSS BODY-->


 
  <div class="cont">
    <div class="form sign-in">
           <p align="center"><span class="userflag"><%               
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
      %></span><p>
      <h2>Phoenix Airline | SIGN IN</h2>
       <form method="post" action="./userlogin">
      <label>
        <span>User Name</span>
        <input type="text" name="uname">
      </label>
      <label>
        <span>Password</span>
        <input type="password" name="password">
      </label>
           <button class="submit" type="submit" value="Login">Sign In</button>
      
      <p class="forgot-pass">Forgot Password ?</p>
        <p class="forgot-pass"> Admin Login - <a href="adminlogin.jsp">Click Here</a></p>
         <p class="forgot-pass">Staff Login - <a href="stafflogin.jsp">Click Here</a></p>
    
     
    </div>
 
    <div class="sub-cont">
      <div class="img">
        <div class="img-text m-up">
          
         
        </div>
        <div class="img-text m-in">
          <h2>One of us?</h2>
          <p>If you already has an account, just sign in. We've missed you!</p>
        </div>
        <div class="img-btn">
          <span class="m-up">Sign Up</span>
          <span class="m-in">Sign In</span>
        </div>
      </div>
      <div class="form sign-up">
        <h2>Phoenix Airline | SIGN UP</h2>
         <form method="post" action="./userregistration">
        <label>
          <span>Full Name</span>
          <input type="text" name="fullname" required="">
        </label>
        <label>
             <span>User Name</span>
          <input type="text" name="uname"required="">
        </label>
        <label>
          <span>Email</span>
          <input type="email" name="email" required="">
        </label>
        <label>
        
          <span>Password</span>
          <input type="password" name="password" required="">
        </label>
        <label>
          <span>Confirm Password</span>
          <input type="password" required="">
        </label>
        
        <button type="submit" class="submit" value="Registration">Sign Up Now</button>
         </form>
      </div>
        
    </div>
  </div>
<script type="text/javascript" src="./js/script_index.js">
</script>
</body>
</html>
