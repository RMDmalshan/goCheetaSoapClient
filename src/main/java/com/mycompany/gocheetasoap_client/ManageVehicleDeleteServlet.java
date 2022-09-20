/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

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
@WebServlet(name = "ManageVehicleDeleteServlet", urlPatterns = {"/ManageVehicleDeleteServlet"})
public class ManageVehicleDeleteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String Reg = request.getParameter("registerNumber");
       
       
        ManageVehicleAuthentication delete= new ManageVehicleAuthentication();
        delete.DeleteVehicle(Reg);
        response.sendRedirect("AdminManageDrivers.jsp");
        

        }
    }

   


