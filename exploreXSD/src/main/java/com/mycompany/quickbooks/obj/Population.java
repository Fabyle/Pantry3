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
 *       &lt;attribute name="CodePopulation" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="30"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LibellePopulation" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AncienCodePopulation">
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
public class Population {

    @XmlAttribute(name = "CodePopulation", required = true)
    protected String codePopulation;
    @XmlAttribute(name = "LibellePopulation", required = true)
    protected String libellePopulation;
    @XmlAttribute(name = "AncienCodePopulation")
    protected String ancienCodePopulation;

    /**
     * Obtient la valeur de la propri�t� codePopulation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePopulation() {
        return codePopulation;
    }

    /**
     * D�finit la valeur de la propri�t� codePopulation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePopulation(String value) {
        this.codePopulation = value;
    }

    /**
     * Obtient la valeur de la propri�t� libellePopulation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibellePopulation() {
        return libellePopulation;
    }

    /**
     * D�finit la valeur de la propri�t� libellePopulation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibellePopulation(String value) {
        this.libellePopulation = value;
    }

    /**
     * Obtient la valeur de la propri�t� ancienCodePopulation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncienCodePopulation() {
        return ancienCodePopulation;
    }

    /**
     * D�finit la valeur de la propri�t� ancienCodePopulation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncienCodePopulation(String value) {
        this.ancienCodePopulation = value;
    }

}
