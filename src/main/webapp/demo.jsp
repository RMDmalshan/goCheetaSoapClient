<%-- 
    Document   : demo
    Created on : Sep 17, 2022, 1:06:25 PM
    Author     : ravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="demoStyle.css"/>
    </head>
    <body>
        
        
        
        
        
      <div class="container">
      <div class="wrapper">
        <div class="title"><span>Customer FeedBack</span></div>
        <form  method="post">
          <div class="row">
            <i class="fas fa-user"></i>
            <input name="nic" type="text" placeholder="Driver Name" required>
          </div>
          <div class="row">
            <i class="fas fa-lock"></i>
            <input name="password" type="text" placeholder="Feedback" required>
          </div>
          <br>
          <div class="row button">
            <input type="submit" value="Submit">
          </div>
         
        </form>
      </div>
    </div>
        
        
    </body>
</html>
