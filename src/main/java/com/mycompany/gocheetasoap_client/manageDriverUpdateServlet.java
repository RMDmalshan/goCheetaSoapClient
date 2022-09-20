/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.ManageDriver;

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
@WebServlet(name = "manageDriverUpdateServlet", urlPatterns = {"/manageDriverUpdateServlet"})
public class manageDriverUpdateServlet extends HttpServlet {

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
       
       
       
 
        String RegNumber= request.getParameter("registerNumber");
        String DName = request.getParameter("driverName");
        String Branch = request.getParameter("branch");
        String Phone = request.getParameter("number");
        String Username = request.getParameter("username");
        String Password = request.getParameter("password");

       
        
        ManageDriverAuthentication service=new ManageDriverAuthentication();
        
        
        
        ManageDriver driver =new ManageDriver();
        
       
       
       
         driver.setRegisterNumber(RegNumber);
         driver.setDriverName(DName);
         driver.setBranch(Branch);
         driver.setNumber(Phone);
         driver.setUsername(Username);
         driver.setPassword(Password);
         
       
     
        service.update(driver);
        response.sendRedirect("AdminManageDrivers.jsp");
    }



    

}
