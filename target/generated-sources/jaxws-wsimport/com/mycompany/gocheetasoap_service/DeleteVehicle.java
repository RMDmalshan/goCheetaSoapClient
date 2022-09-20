
package com.mycompany.gocheetasoap_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managevehicle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteVehicle", propOrder = {
    "managevehicle"
})
public class DeleteVehicle {

    protected String managevehicle;

    /**
     * Gets the value of the managevehicle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagevehicle() {
        return managevehicle;
    }

    /**
     * Sets the value of the managevehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagevehicle(String value) {
        this.managevehicle = value;
    }

}
