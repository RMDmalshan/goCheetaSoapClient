<%-- 
    Document   : DriverLogin
    Created on : Sep 12, 2022, 9:36:33 AM
    Author     : ravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CustomerLoginStyle.css"/>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    </head>
    <body>
       
         <div class="logo text-center">
  <h1>LOGIN</h1>
</div>
<div class="wrapper">
  <div class="inner-warpper text-center">
    <h2 class="title">Login to your account</h2>
    <form action="" id="formvalidate">
      <div class="input-group">
        <label class="palceholder" for="userName"></label>
        <input class="form-control" name="userName" id="userName" type="text" placeholder="User Name" />
        <span class="lighting"></span>
      </div>
      <div class="input-group">
        <label class="palceholder" for="userPassword"></label>
        <input class="form-control" name="userPassword" id="userPassword" type="password" placeholder="Password" />
        <span class="lighting"></span>
      </div>

      <button type="submit" id="login">Login</button>
      <div class="clearfix supporter">
        <div class="pull-left remember-me">
          <input id="rememberMe" type="checkbox">
          <label for="rememberMe">Remember Me</label>
        </div>
      </div>
    </form>
  </div>
 
</div>       
    </body>
</html>
