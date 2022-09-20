
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
@WebService(name = "ManageDriverService", targetNamespace = "http://gocheetasoap_service.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ManageDriverService {


    /**
     * 
     * @param managedriver
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Delete")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Delete", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.Delete")
    @ResponseWrapper(localName = "DeleteResponse", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.DeleteResponse")
    @Action(input = "http://gocheetasoap_service.mycompany.com/ManageDriverService/DeleteRequest", output = "http://gocheetasoap_service.mycompany.com/ManageDriverService/DeleteResponse")
    public boolean delete(
        @WebParam(name = "managedriver", targetNamespace = "")
        String managedriver);

    /**
     * 
     * @param managedriver
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "AddDriver")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddDriver", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.AddDriver")
    @ResponseWrapper(localName = "AddDriverResponse", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.AddDriverResponse")
    @Action(input = "http://gocheetasoap_service.mycompany.com/ManageDriverService/AddDriverRequest", output = "http://gocheetasoap_service.mycompany.com/ManageDriverService/AddDriverResponse")
    public boolean addDriver(
        @WebParam(name = "managedriver", targetNamespace = "")
        ManageDriver managedriver);

    /**
     * 
     * @param managedriver
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.UpdateResponse")
    @Action(input = "http://gocheetasoap_service.mycompany.com/ManageDriverService/updateRequest", output = "http://gocheetasoap_service.mycompany.com/ManageDriverService/updateResponse")
    public boolean update(
        @WebParam(name = "managedriver", targetNamespace = "")
        ManageDriver managedriver);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns com.mycompany.gocheetasoap_service.ManageDriver
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginDriver", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.LoginDriver")
    @ResponseWrapper(localName = "loginDriverResponse", targetNamespace = "http://gocheetasoap_service.mycompany.com/", className = "com.mycompany.gocheetasoap_service.LoginDriverResponse")
    @Action(input = "http://gocheetasoap_service.mycompany.com/ManageDriverService/loginDriverRequest", output = "http://gocheetasoap_service.mycompany.com/ManageDriverService/loginDriverResponse")
    public ManageDriver loginDriver(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
