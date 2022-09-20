
package com.mycompany.gocheetasoap_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDriver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDriver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managedriver" type="{http://gocheetasoap_service.mycompany.com/}manageDriver" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDriver", propOrder = {
    "managedriver"
})
public class AddDriver {

    protected ManageDriver managedriver;

    /**
     * Gets the value of the managedriver property.
     * 
     * @return
     *     possible object is
     *     {@link ManageDriver }
     *     
     */
    public ManageDriver getManagedriver() {
        return managedriver;
    }

    /**
     * Sets the value of the managedriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageDriver }
     *     
     */
    public void setManagedriver(ManageDriver value) {
        this.managedriver = value;
    }

}
