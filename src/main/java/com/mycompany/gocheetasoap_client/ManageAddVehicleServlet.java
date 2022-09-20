/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.ManageVehicle;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ravin
 */
@WebServlet(name = "ManageAddVehicleServlet", urlPatterns = {"/ManageAddVehicleServlet"})
public class ManageAddVehicleServlet extends HttpServlet {

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
        
        
         ManageVehicleAuthentication service=new ManageVehicleAuthentication();
        
        String RegisterNumber = request.getParameter("registerNumber");
        String DriverName = request.getParameter("driverName");
        String Branch=  request.getParameter("branch");
        String VNumber = request.getParameter("vehicleNumber");
        String VType = request.getParameter("vehicleType");
       
       
        ManageVehicle vehicle =new ManageVehicle();
        
        vehicle.setRegisterNumber(RegisterNumber);
        vehicle.setDriverName(DriverName);
        vehicle.setBranch(Branch);
        vehicle.setVehicleNumber(VNumber);
        vehicle.setVehicleType(VType);
      
        
        
        try {
            service.AddVehicle(vehicle);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("AdminManageVehicle.jsp");
        
       
    }
        
        
        
        
        }
  
  


