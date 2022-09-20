/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.Admin;
import com.mycompany.gocheetasoap_service.AdminService;
import com.mycompany.gocheetasoap_service.AdminService_Service;

/**
 *
 * @author ravin
 */
public class AdminAuthentication {
    
    
    public Admin loginAdmin(String username, String password) {
		
		// defining the dao object
		AdminService_Service service = new  AdminService_Service();
                AdminService proxy=service.getAdminServicePort();
   
		
		// calling the validate user method
		
                return proxy.loginAdmin(username, password);
	}
    
    
    
    
}
