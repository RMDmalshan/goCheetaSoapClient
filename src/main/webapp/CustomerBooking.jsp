<%-- 
    Document   : CustomerBooking
    Created on : Sep 12, 2022, 8:33:49 PM
    Author     : ravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="CustomerBookingStyle.css"/>
        
    </head>
    <body>
      
        
    <div class="formali">
<div class="container">
    <center><div class="title">Plan Your Trip</div></center>
    <div class="content">
      <form name="userdata" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Pick Location</span>
            <input name="pickLocation" type="text"  placeholder="Enter pick Location">
          </div>
            
          <div class="input-box">
            <span class="details">Drop Location</span>
            <input name="dropLocation" type="text"  placeholder="Enter Drop Location">
          </div>
            
          <div class="input-box">
            <span class="details">Pick-up Date</span>
            <input name="pickUpDate" type="text"  placeholder="Enter Pick-up Date">
          </div>
            
          <div class="input-box">
            <span class="details">Pick-up Time </span>
            <input name="pickUpTime" type="text"  placeholder="Pick-up Time">
          </div>
            
          <div class="input-box">
            <span class="details">Vehicle Type</span>
            <input name="vehicleType" type="text"  placeholder="Enter vehicle Type">
          </div>
            
          <div class="input-box">
            <span class="details">Mobile No</span>
            <input name="number" type="text" required id="number" placeholder="Enter your Mobile No.">
          </div>
            
           
            
            
        </div>
        <div class="button">
            <input name="submit" type="submit" formaction="CustomerBookingServlet" id="submit" value="Book Now">
        </div>
          
           
          
      </form>
    </div>
  </div>
</div>
        
        
        
        
        
        
    </body>
</html>
