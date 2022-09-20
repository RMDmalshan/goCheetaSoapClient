/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.Book;
import com.mycompany.gocheetasoap_service.CustomerBookingService;
import com.mycompany.gocheetasoap_service.CustomerBookingService_Service;

/**
 *
 * @author ravin
 */
public class CustomerBookingAuthentication {
    
    public boolean AddCustomerBooking (Book book){
       
    CustomerBookingService_Service service = new  CustomerBookingService_Service();
    CustomerBookingService proxy=service.getCustomerBookingServicePort();
   
   return proxy.addCustomerBooking(book);
           }
    
    
    
}
