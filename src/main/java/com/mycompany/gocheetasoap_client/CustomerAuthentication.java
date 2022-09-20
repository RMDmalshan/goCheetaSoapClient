/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.Customer;
import com.mycompany.gocheetasoap_service.CustomerService;
import com.mycompany.gocheetasoap_service.CustomerService_Service;

/**
 *
 * @author ravin
 */
public class CustomerAuthentication {
   public boolean AddCustomer (Customer customer){
       
    CustomerService_Service service = new  CustomerService_Service();
    CustomerService proxy=service.getCustomerServicePort();
   
   return proxy.addCustomer(customer);
           }
   
    public Customer loginCustomer(String username, String password) {
		
		// defining the dao object
		CustomerService_Service service = new  CustomerService_Service();
                CustomerService proxy=service.getCustomerServicePort();
   
		
		// calling the validate user method
		
                return proxy.loginCustomer(username, password);
	}

   
   
    
    
}


