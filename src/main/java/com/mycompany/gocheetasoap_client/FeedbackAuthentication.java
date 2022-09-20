/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheetasoap_client;

import com.mycompany.gocheetasoap_service.FeedBackService;
import com.mycompany.gocheetasoap_service.FeedBackService_Service;
import com.mycompany.gocheetasoap_service.Feedback;

/**
 *
 * @author ravin
 */
public class FeedbackAuthentication {
    
    public boolean CustomerFeedback (Feedback feedback){
       
    FeedBackService_Service service = new  FeedBackService_Service();
    FeedBackService proxy=service.getFeedBackServicePort();
   
   return proxy.customerFeedback(feedback);
           }
    
    }
