<%-- 
    Document   : AdminManageVehicle
    Created on : Sep 18, 2022, 2:48:58 PM
    Author     : ravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
           <link rel="stylesheet" href="AdminManageVehicleStyle.css"/>
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
    <center><div class="title"> MANAGE VEHICLE DETAILS</div></center>
    <div class="content">
      <form name="userdata" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Driver Registration Number</span>
            <input name="registerNumber" type="text"  placeholder="Enter Register Number">
          </div>
          <div class="input-box">
            <span class="details">Driver Name</span>
            <input name="driverName" type="text" placeholder="Enter Driver Name">
          </div>
          <div class="input-box">
            <span class="details">Branch</span>
            <input name="branch" type="text"  placeholder="Enter Branch">
          </div>
          <div class="input-box">
            <span class="details">Vehicle Number</span>
            <input name="vehicleNumber" type="text" placeholder="Enter Vehicle Number">
          </div>
          <div class="input-box">
            <span class="details">Vehicle Type</span>
            <input name="vehicleType" type="text"  placeholder="Enter Vehicle Type">
          </div>
         
        </div>
        <div class="button">
          
          
           
           <input type="submit" formaction="ManageVehicleAddServlet" value="ADD VEHICLE"><br><br>
           <input type="submit"  formaction="ManageVehicleUpdateServlet" value="UPDATE VEHICLE"><br><br>
           <input type="submit"  formaction="ManageVehicleDeleteServlet" value="DELETE VEHICLE"><br><br>
        </div>
      </form>
    </div>
  </div>
</div>
       
        
        
    </body>
</html>
