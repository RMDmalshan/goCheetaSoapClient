<%-- 
    Document   : AdminManageDrivers
    Created on : Sep 13, 2022, 3:03:47 PM
    Author     : ravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <link rel="stylesheet" href="AdminManageDriversStyle.css"/>
    </head>
    <body>  
        
        
        
         <div class="nav">
       <nav>
  

        <a class="active" href="AdminManageDrivers.jsp"> Manage Driver</a>
        <a class="active" href="AdminManageVehicle.jsp">Manage Vehicle</a>
        <a class="active" href="Home.jsp">Home</a></nav>
       </div>

        
        
        
             <div class="formali">
<div class="container">
    <center><div class="title">MANAGE DRIVER</div></center>
    <div class="content">
        <form name="userdata" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Register Number</span>
            <input name="registerNumber" type="text"  placeholder="Enter Register Number">
          </div>
          <div class="input-box">
            <span class="details">Driver Name</span>
            <input name="driverName" type="text"  placeholder="Enter Driver Name">
          </div>
          <div class="input-box">
            <span class="details">Branch</span>
            <input name="branch" type="text"  placeholder="Enter Branch">
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input name="number" type="text"  placeholder="Enter number">
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input name="username" type="text"  placeholder="Enter username">
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input name="password" type="password"  placeholder="Enter Password">
          </div>
        </div>
        <div class="button">
          
            <input type="submit" formaction="manageDriverServlet" value="ADD DRIVER"> <br><br>
            <input type="submit" formaction="manageDriverUpdateServlet" value="UPDATE DRIVER"><br><br>
            <input type="submit" formaction="ManageDriverDeleteServlet" value="DELETE DRIVER"><br><br>
        </div>
      </form>
    </div>
  </div>
</div>
                    


            
          
                    
         
            
        
            
     
      
         
    </body>
</html>
