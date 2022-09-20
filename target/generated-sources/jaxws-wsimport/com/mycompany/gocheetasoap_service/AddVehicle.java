
package com.mycompany.gocheetasoap_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managevehicle" type="{http://gocheetasoap_service.mycompany.com/}manageVehicle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVehicle", propOrder = {
    "managevehicle"
})
public class AddVehicle {

    protected ManageVehicle managevehicle;

    /**
     * Gets the value of the managevehicle property.
     * 
     * @return
     *     possible object is
     *     {@link ManageVehicle }
     *     
     */
    public ManageVehicle getManagevehicle() {
        return managevehicle;
    }

    /**
     * Sets the value of the managevehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageVehicle }
     *     
     */
    public void setManagevehicle(ManageVehicle value) {
        this.managevehicle = value;
    }

}
