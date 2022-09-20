<%-- 
    Document   : RegisterCustomer
    Created on : Sep 11, 2022, 12:10:23 PM
    Author     : ravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="RegisterCustomerStyle.css"/>
    </head>
    <body>
        
        
        
        
       
<div class="formali">
<div class="container">
    <center><div class="title">REGISTRATION FORM</div></center>
    <div class="content">
      <form name="userdata" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input name="fullname" type="text" required id="fullname" placeholder="Enter your name">
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input name="username" type="text" required id="username" placeholder="Enter your username">
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input name="email" type="text" required id="email" placeholder="Enter your email">
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input name="phonenumber" type="text" required id="phonenumber" placeholder="Enter your number">
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input name="password" type="password" required id="password" placeholder="Enter your password">
          </div>
          <div class="input-box">
            <span class="details">NIC</span>
            <input name="nic" type="text" required id="nic" placeholder="Enter your NIC">
          </div>
        </div>
        <div class="button">
          
          
           
           <input type="submit" formaction="CustomerServlet" value="Register">
        </div>
      </form>
    </div>
  </div>
</div>
       
        
    </body>
</html>
