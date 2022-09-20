/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.ManageDriver;
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
@WebServlet(name = "manageDriverServlet", urlPatterns = {"/manageDriverServlet"})
public class manageDriverServlet extends HttpServlet {

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
        
        ManageDriverAuthentication service=new ManageDriverAuthentication();
        
        String RegisterNumber = request.getParameter("registerNumber");
        String DriverName = request.getParameter("driverName");
        String Branch=  request.getParameter("branch");
        String Phone = request.getParameter("number");
        String Username = request.getParameter("username");
        String Password = request.getParameter("password");
       
        ManageDriver driver =new ManageDriver();
        
        driver.setRegisterNumber(RegisterNumber);
        driver.setDriverName(DriverName);
        driver.setBranch(Branch);
        driver.setNumber(Phone);
        driver.setUsername(Username);
        driver.setPassword(Password);
        
        
        try {
            service.AddDriver(driver);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("AdminManageDrivers.jsp");
        
       
    }

        
        
    }
    

   
