/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ravin
 */


@WebServlet(name = "LoginCustomerServlet", urlPatterns = {"/LoginCustomerServlet"})
public class LoginCustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
       private String username = null;
	private String password = null;
       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              username = request.getParameter("userName");
		password = request.getParameter("userPassword");
		
		// simple validation
		if((username != null && !username.isEmpty()) && (password != null && !password.isEmpty())) {
			
			// defining the object for AuthenticationService
			CustomerAuthentication service = new CustomerAuthentication();
			
			// validating the user input
			Customer customer = service.loginCustomer(username, password);
			
			// dispatching the result based on the outcome 
			if(customer != null && customer.isValidUser()) {
				
				HttpSession session = request.getSession();
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerBooking.jsp");
				
				// setting user details object in session based on the valid outcome
				session.setAttribute("customer", customer);
				
				dispatcher.forward(request, response);
				
				
                        }
		}
        }
    }

   
