<%-- 
    Document   : ViewBooking
    Created on : Sep 13, 2022, 10:56:13 PM
    Author     : ravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <link rel="stylesheet" href="ViewBookingStyle.css"/>
    </head>
    <body>
       
           <div class="container">
        <nav>
            <ul>
                <li><a class="logo">
                    <img src="Image/photo3.png">
                    <span class="nav-iten">Admin Dashboard</span>
                </a></li>
                <li><a href="AdminManageDrivers.jsp">
                    <i class="uil uil-syringe"></i>
                    <span class="nav-item">Manage Drivers</span>
                </a></li>
                <li><a href="AdminManageVehicle.jsp">
                    <i class="uil uil-head-side"></i>
                    <span class="nav-item">Manage Vehicle</span>
                </a></li>
                <li><a href="ViewBooking.jsp">
                    <i class="uil uil-estate"></i>
                    <span class="nav-item">View Booking</span>
                </a></li>
                 <li><a href="Home.jsp" class="logout">
                    <i class="uil uil-sign-out-alt"></i>
                    <span class="nav-item">Log Out</span>
                </a></li>
            </ul>
        </nav>
        
        
    </body>
</html>
