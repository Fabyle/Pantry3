//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2015.03.12 � 11:54:19 AM CET 
//


package com.mycompany.quickbooks.obj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CodeOC" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *             &lt;maxLength value="9"/>
 *             &lt;pattern value="[P][0-9]{4}"/>
 *             &lt;pattern value="[A][0-9A-Z]{5}"/>
 *             &lt;pattern value="[0-9]{9}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CodeDELEG">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="6"/>
 *             &lt;pattern value="[G][0-9A-Z]{5}"/>
 *             &lt;pattern value="[D][0-9A-Z]{5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AncienCodeOC">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *             &lt;maxLength value="9"/>
 *             &lt;pattern value="[P][0-9]{4}"/>
 *             &lt;pattern value="[A][0-9A-Z]{5}"/>
 *             &lt;pattern value="[0-9]{9}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AncienCodeDELEG">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="6"/>
 *             &lt;pattern value="[G][0-9A-Z]{5}"/>
 *             &lt;pattern value="[D][0-9A-Z]{5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Organisme {

    @XmlAttribute(name = "CodeOC", required = true)
    protected String codeOC;
    @XmlAttribute(name = "CodeDELEG")
    protected String codeDELEG;
    @XmlAttribute(name = "AncienCodeOC")
    protected String ancienCodeOC;
    @XmlAttribute(name = "AncienCodeDELEG")
    protected String ancienCodeDELEG;

    /**
     * Obtient la valeur de la propri�t� codeOC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOC() {
        return codeOC;
    }

    /**
     * D�finit la valeur de la propri�t� codeOC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOC(String value) {
        this.codeOC = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeDELEG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDELEG() {
        return codeDELEG;
    }

    /**
     * D�finit la valeur de la propri�t� codeDELEG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDELEG(String value) {
        this.codeDELEG = value;
    }

    /**
     * Obtient la valeur de la propri�t� ancienCodeOC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncienCodeOC() {
        return ancienCodeOC;
    }

    /**
     * D�finit la valeur de la propri�t� ancienCodeOC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncienCodeOC(String value) {
        this.ancienCodeOC = value;
    }

    /**
     * Obtient la valeur de la propri�t� ancienCodeDELEG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncienCodeDELEG() {
        return ancienCodeDELEG;
    }

    /**
     * D�finit la valeur de la propri�t� ancienCodeDELEG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncienCodeDELEG(String value) {
        this.ancienCodeDELEG = value;
    }

}
