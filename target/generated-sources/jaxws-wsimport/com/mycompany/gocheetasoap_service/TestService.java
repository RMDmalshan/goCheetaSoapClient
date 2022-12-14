
package com.mycompany.gocheetasoap_service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestService", targetNamespace = "http://gocheetasoap_service.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.HelloResponse")
    @Action(input = "http://gocheetasoap_service.mycompany.com/TestService/helloRequest", output = "http://gocheetasoap_service.mycompany.com/TestService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
