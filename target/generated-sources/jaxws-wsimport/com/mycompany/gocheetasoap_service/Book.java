
package com.mycompany.gocheetasoap_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for book complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dropLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "dropLocation",
    "number",
    "pickDate",
    "pickLocation",
    "pickTime",
    "vehicleType"
})
public class Book {

    protected String dropLocation;
    protected String number;
    protected String pickDate;
    protected String pickLocation;
    protected String pickTime;
    protected String vehicleType;

    /**
     * Gets the value of the dropLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropLocation() {
        return dropLocation;
    }

    /**
     * Sets the value of the dropLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropLocation(String value) {
        this.dropLocation = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the pickDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickDate() {
        return pickDate;
    }

    /**
     * Sets the value of the pickDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickDate(String value) {
        this.pickDate = value;
    }

    /**
     * Gets the value of the pickLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickLocation() {
        return pickLocation;
    }

    /**
     * Sets the value of the pickLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickLocation(String value) {
        this.pickLocation = value;
    }

    /**
     * Gets the value of the pickTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickTime() {
        return pickTime;
    }

    /**
     * Sets the value of the pickTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickTime(String value) {
        this.pickTime = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

}
