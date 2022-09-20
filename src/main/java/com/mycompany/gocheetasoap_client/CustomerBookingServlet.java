/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.Book;
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
@WebServlet(name = "CustomerBookingServlet", urlPatterns = {"/CustomerBookingServlet"})
public class CustomerBookingServlet extends HttpServlet {

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
        
        
        
        CustomerBookingAuthentication service=new CustomerBookingAuthentication();
        
        String PickLocation = request.getParameter("pickLocation");
        String DropLocation = request.getParameter("dropLocation");
        String PickDate=  request.getParameter("pickUpDate");
        String DropTime = request.getParameter("pickUpTime");
        String VehicleType = request.getParameter("vehicleType");
        String MobileNumber = request.getParameter("number");
       
        Book book =new Book();
        
        book.setPickLocation(PickLocation);
        book.setDropLocation(DropLocation);
        book.setPickDate(PickDate);
        book.setPickTime(DropTime);
        book.setVehicleType(VehicleType);
        book.setNumber(MobileNumber);
        
        
        try {
            service.AddCustomerBooking(book);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("CustomerFeedback.jsp");
        
        
        }
       
    }

    


