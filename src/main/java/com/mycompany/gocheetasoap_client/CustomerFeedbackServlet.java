/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.Feedback;
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
@WebServlet(name = "CustomerFeedbackServlet", urlPatterns = {"/CustomerFeedbackServlet"})
public class CustomerFeedbackServlet extends HttpServlet {

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
        
        
         FeedbackAuthentication service=new FeedbackAuthentication();
        
        String Drivername = request.getParameter("name");
        String Feedback = request.getParameter("feedback");
        
       
        Feedback fb =new Feedback();
        
        fb.setDriverName(Drivername);
        fb.setFeedback(Feedback);
       
        
        try {
            service.CustomerFeedback(fb);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("Home.jsp");
        
        
        }
        
        
        
      
        }
    
    


