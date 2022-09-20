/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.ManageVehicle;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ravin
 */
@WebServlet(name = "ManageVehicleUpdateServlet", urlPatterns = {"/ManageVehicleUpdateServlet"})
public class ManageVehicleUpdateServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String RegisterNumber = request.getParameter("registerNumber");
        String DriverName = request.getParameter("driverName");
        String Branch=  request.getParameter("branch");
        String VNumber = request.getParameter("vehicleNumber");
        String VType = request.getParameter("vehicleType");
        
        

       
        
        ManageVehicleAuthentication service=new ManageVehicleAuthentication();
        
        
        
         ManageVehicle vehicle =new ManageVehicle();
        
       
       
       
        vehicle.setRegisterNumber(RegisterNumber);
        vehicle.setDriverName(DriverName);
        vehicle.setBranch(Branch);
        vehicle.setVehicleNumber(VNumber);
        vehicle.setVehicleType(VType);
       
     
        service.updateVehicle(vehicle);
        response.sendRedirect("AdminManageDrivers.jsp");
    }

        
        
        
      
        }
   

    


