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
 *       &lt;attribute name="UniteTempsDeTravail" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="(10|12|20|21|31|32|33|90|99)"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BorneINF">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="4"/>
 *             &lt;maxLength value="7"/>
 *             &lt;pattern value="[0]*([1-9][0-9]*\.[0-9]{2}|0\.[0-9]{2})"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BorneSUP">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="4"/>
 *             &lt;maxLength value="7"/>
 *             &lt;pattern value="[0]*([1-9][0-9]*\.[0-9]{2}|0\.[0-9]{2})"/>
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
public class QuotiteDeTravail {

    @XmlAttribute(name = "UniteTempsDeTravail", required = true)
    protected String uniteTempsDeTravail;
    @XmlAttribute(name = "BorneINF")
    protected String borneINF;
    @XmlAttribute(name = "BorneSUP")
    protected String borneSUP;

    /**
     * Obtient la valeur de la propri�t� uniteTempsDeTravail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniteTempsDeTravail() {
        return uniteTempsDeTravail;
    }

    /**
     * D�finit la valeur de la propri�t� uniteTempsDeTravail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniteTempsDeTravail(String value) {
        this.uniteTempsDeTravail = value;
    }

    /**
     * Obtient la valeur de la propri�t� borneINF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorneINF() {
        return borneINF;
    }

    /**
     * D�finit la valeur de la propri�t� borneINF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorneINF(String value) {
        this.borneINF = value;
    }

    /**
     * Obtient la valeur de la propri�t� borneSUP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorneSUP() {
        return borneSUP;
    }

    /**
     * D�finit la valeur de la propri�t� borneSUP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorneSUP(String value) {
        this.borneSUP = value;
    }

}
