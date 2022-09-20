
package com.mycompany.gocheetasoap_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.gocheetasoap_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCustomerBookingResponse_QNAME = new QName("http://gocheetasoap_service.mycompany.com/", "AddCustomerBookingResponse");
    private final static QName _AddCustomerBooking_QNAME = new QName("http://gocheetasoap_service.mycompany.com/", "AddCustomerBooking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.gocheetasoap_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomerBooking }
     * 
     */
    public AddCustomerBooking createAddCustomerBooking() {
        return new AddCustomerBooking();
    }

    /**
     * Create an instance of {@link AddCustomerBookingResponse }
     * 
     */
    public AddCustomerBookingResponse createAddCustomerBookingResponse() {
        return new AddCustomerBookingResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheetasoap_service.mycompany.com/", name = "AddCustomerBookingResponse")
    public JAXBElement<AddCustomerBookingResponse> createAddCustomerBookingResponse(AddCustomerBookingResponse value) {
        return new JAXBElement<AddCustomerBookingResponse>(_AddCustomerBookingResponse_QNAME, AddCustomerBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheetasoap_service.mycompany.com/", name = "AddCustomerBooking")
    public JAXBElement<AddCustomerBooking> createAddCustomerBooking(AddCustomerBooking value) {
        return new JAXBElement<AddCustomerBooking>(_AddCustomerBooking_QNAME, AddCustomerBooking.class, null, value);
    }

}
