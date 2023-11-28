//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.11.27 a las 06:28:13 PM COT 
//


package com.example.api_rest.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="names" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastnames" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birth_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enjoying_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="job" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "names",
    "lastnames",
    "docType",
    "docNumber",
    "birthDate",
    "enjoyingDate",
    "job",
    "salary"
})
@XmlRootElement(name = "GetEmploymentRequest")
public class GetEmploymentRequest {

    @XmlElement(required = true)
    protected String names;
    @XmlElement(required = true)
    protected String lastnames;
    @XmlElement(required = true)
    protected String docType;
    @XmlElement(name = "doc_number", required = true)
    protected String docNumber;
    @XmlElement(name = "birth_date", required = true)
    protected String birthDate;
    @XmlElement(name = "enjoying_date", required = true)
    protected String enjoyingDate;
    @XmlElement(required = true)
    protected String job;
    protected double salary;

    /**
     * Obtiene el valor de la propiedad names.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNames() {
        return names;
    }

    /**
     * Define el valor de la propiedad names.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNames(String value) {
        this.names = value;
    }

    /**
     * Obtiene el valor de la propiedad lastnames.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnames() {
        return lastnames;
    }

    /**
     * Define el valor de la propiedad lastnames.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnames(String value) {
        this.lastnames = value;
    }

    /**
     * Obtiene el valor de la propiedad docType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Define el valor de la propiedad docType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Obtiene el valor de la propiedad docNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Define el valor de la propiedad docNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Define el valor de la propiedad birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Obtiene el valor de la propiedad enjoyingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnjoyingDate() {
        return enjoyingDate;
    }

    /**
     * Define el valor de la propiedad enjoyingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnjoyingDate(String value) {
        this.enjoyingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad job.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob() {
        return job;
    }

    /**
     * Define el valor de la propiedad job.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob(String value) {
        this.job = value;
    }

    /**
     * Obtiene el valor de la propiedad salary.
     * 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Define el valor de la propiedad salary.
     * 
     */
    public void setSalary(double value) {
        this.salary = value;
    }

}
