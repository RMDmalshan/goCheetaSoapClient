/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.ManageDriver;
import com.mycompany.gocheetasoap_service.ManageDriverService;
import com.mycompany.gocheetasoap_service.ManageDriverService_Service;

/**
 *
 * @author ravin
 */
public class ManageDriverAuthentication {
    
    
    public boolean AddDriver (ManageDriver managedriver){
       
    ManageDriverService_Service service = new  ManageDriverService_Service();
    ManageDriverService proxy=service.getManageDriverServicePort();
   
   return proxy.addDriver(managedriver);
           }
    
    public boolean update(ManageDriver managedriver){
       ManageDriverService_Service service = new  ManageDriverService_Service();
       ManageDriverService proxy=service.getManageDriverServicePort();
       return proxy.update(managedriver);
    }
    
    
    public boolean Delete(String registerNumber){
        ManageDriverService_Service service = new  ManageDriverService_Service();
       ManageDriverService proxy=service.getManageDriverServicePort();
        return proxy.delete(registerNumber);
    }
    
    
    
    
    
     public ManageDriver loginDriver(String username, String password) {
		
		// defining the dao object
		 ManageDriverService_Service service = new  ManageDriverService_Service();
                 ManageDriverService proxy=service.getManageDriverServicePort();
   
		
		// calling the validate user method
		
                return proxy.loginDriver(username, password);
	}
    
    
}
