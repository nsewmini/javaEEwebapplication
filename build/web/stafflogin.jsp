
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import  = "javax.servlet.http.Cookie"%>
 <%@page import  = "java.io.PrintWriter"%>
 <%@page import="model.dbconnect"%>
 <%@page import="model.cookieverify"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Phoenix_Airline_PVT</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="./css/style.css"> <!--External CSS BODY-->


 
      
  <div class="cont">
    <div class="form sign-in">
           <p align="center"><span class="userflag"></span><p>
      <h2>Phoenix Airline | STAFF SIGN IN</h2>
       <form method="post" action="./stafflogin">
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
  
    
      
    </div>
 
    <div class="sub-cont">
      <div class="img">
        <div class="img-text m-up">
          <h2>New here?</h2>
          <p>Sign up and discover great amount of new opportunities!</p>
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
        <h2>Phoenix Airline | STAFF SIGN UP</h2>
         <form method="post" action="./staffregistration">
        <label>
          <span>Full Name</span>
          <input type="text" name="fullname" required="">
        </label>
        <label>
             <span>User Name</span>
          <input type="text" name="uname"required="">
        </label>
        <label>
          <span>Employee ID</span>
          <input type="text" name="empid" required="">
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
  var video = document.getElementById("myVideo");
</script>
</body>
</html>
