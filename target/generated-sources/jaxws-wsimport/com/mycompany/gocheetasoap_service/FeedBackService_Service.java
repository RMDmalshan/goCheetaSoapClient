
package com.mycompany.gocheetasoap_service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FeedBackService", targetNamespace = "http://gocheetasoap_service.mycompany.com/", wsdlLocation = "http://localhost:8080/GoCheetaSoap_Service/FeedBackService?wsdl")
public class FeedBackService_Service
    extends Service
{

    private final static URL FEEDBACKSERVICE_WSDL_LOCATION;
    private final static WebServiceException FEEDBACKSERVICE_EXCEPTION;
    private final static QName FEEDBACKSERVICE_QNAME = new QName("http://gocheetasoap_service.mycompany.com/", "FeedBackService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/GoCheetaSoap_Service/FeedBackService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FEEDBACKSERVICE_WSDL_LOCATION = url;
        FEEDBACKSERVICE_EXCEPTION = e;
    }

    public FeedBackService_Service() {
        super(__getWsdlLocation(), FEEDBACKSERVICE_QNAME);
    }

    public FeedBackService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), FEEDBACKSERVICE_QNAME, features);
    }

    public FeedBackService_Service(URL wsdlLocation) {
        super(wsdlLocation, FEEDBACKSERVICE_QNAME);
    }

    public FeedBackService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FEEDBACKSERVICE_QNAME, features);
    }

    public FeedBackService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FeedBackService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FeedBackService
     */
    @WebEndpoint(name = "FeedBackServicePort")
    public FeedBackService getFeedBackServicePort() {
        return super.getPort(new QName("http://gocheetasoap_service.mycompany.com/", "FeedBackServicePort"), FeedBackService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FeedBackService
     */
    @WebEndpoint(name = "FeedBackServicePort")
    public FeedBackService getFeedBackServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://gocheetasoap_service.mycompany.com/", "FeedBackServicePort"), FeedBackService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FEEDBACKSERVICE_EXCEPTION!= null) {
            throw FEEDBACKSERVICE_EXCEPTION;
        }
        return FEEDBACKSERVICE_WSDL_LOCATION;
    }

}
