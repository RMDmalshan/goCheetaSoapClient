/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author ravin
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {

       @Override
       protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        CustomerAuthentication service=new CustomerAuthentication();
        
        String Fullname = request.getParameter("fullname");
        String Username = request.getParameter("username");
        String Email=  request.getParameter("email");
        String Phone = request.getParameter("phonenumber");
        String Password = request.getParameter("password");
        String Nic = request.getParameter("nic");
       
        Customer customer =new Customer();
        
        customer.setFullName(Fullname);
        customer.setUsername(Username);
        customer.setEmail(Email);
        customer.setNumber(Phone);
        customer.setPassword(Password);
        customer.setNic(Nic);
        
        
        try {
            service.AddCustomer(customer);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       

        response.sendRedirect("Home.jsp");
        
        
        }
    }


