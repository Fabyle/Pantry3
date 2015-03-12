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
 *       &lt;attribute name="CodeOption" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="30"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LibelleOption" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AncienCodeOption">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="30"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
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
public class Option {

    @XmlAttribute(name = "CodeOption", required = true)
    protected String codeOption;
    @XmlAttribute(name = "LibelleOption", required = true)
    protected String libelleOption;
    @XmlAttribute(name = "AncienCodeOption")
    protected String ancienCodeOption;

    /**
     * Obtient la valeur de la propri�t� codeOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOption() {
        return codeOption;
    }

    /**
     * D�finit la valeur de la propri�t� codeOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOption(String value) {
        this.codeOption = value;
    }

    /**
     * Obtient la valeur de la propri�t� libelleOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleOption() {
        return libelleOption;
    }

    /**
     * D�finit la valeur de la propri�t� libelleOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleOption(String value) {
        this.libelleOption = value;
    }

    /**
     * Obtient la valeur de la propri�t� ancienCodeOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncienCodeOption() {
        return ancienCodeOption;
    }

    /**
     * D�finit la valeur de la propri�t� ancienCodeOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncienCodeOption(String value) {
        this.ancienCodeOption = value;
    }

}
