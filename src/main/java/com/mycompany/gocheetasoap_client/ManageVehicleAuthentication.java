/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.ManageVehicle;
import com.mycompany.gocheetasoap_service.ManageVehicleService;
import com.mycompany.gocheetasoap_service.ManageVehicleService_Service;

/**
 *
 * @author ravin
 */
public class ManageVehicleAuthentication {
    
    public boolean AddVehicle (ManageVehicle managevehicle){
       
    ManageVehicleService_Service service = new  ManageVehicleService_Service();
    ManageVehicleService proxy=service.getManageVehicleServicePort();
   
   return proxy.addVehicle(managevehicle);
           }
    
    
    
    
    public boolean updateVehicle (ManageVehicle managevehicle){
       
    ManageVehicleService_Service service = new  ManageVehicleService_Service();
    ManageVehicleService proxy=service.getManageVehicleServicePort();
   
   return proxy.updateVehicle(managevehicle);
           }
    
    
    
    public boolean DeleteVehicle(String registerNumber){
        ManageVehicleService_Service service = new  ManageVehicleService_Service();
        ManageVehicleService proxy=service.getManageVehicleServicePort();
        return proxy.deleteVehicle(registerNumber);
    }
    
      
}
