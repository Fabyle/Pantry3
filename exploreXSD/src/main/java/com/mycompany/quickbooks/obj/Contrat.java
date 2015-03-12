//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.12 à 11:54:19 AM CET 
//


package com.mycompany.quickbooks.obj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReferenceContrat" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="30"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z«°»À-ÅÇ-ÏÑ-ÖÙ-Ýà-åç-ïñ-öù-ýÿ]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LibelleContrat" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z«°»À-ÅÇ-ÏÑ-ÖÙ-Ýà-åç-ïñ-öù-ýÿ]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AncienneReferenceContrat">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="30"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z«°»À-ÅÇ-ÏÑ-ÖÙ-Ýà-åç-ïñ-öù-ýÿ]+"/>
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
public class Contrat {

    @XmlAttribute(name = "ReferenceContrat", required = true)
    protected String referenceContrat;
    @XmlAttribute(name = "LibelleContrat", required = true)
    protected String libelleContrat;
    @XmlAttribute(name = "AncienneReferenceContrat")
    protected String ancienneReferenceContrat;

    /**
     * Obtient la valeur de la propriété referenceContrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceContrat() {
        return referenceContrat;
    }

    /**
     * Définit la valeur de la propriété referenceContrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceContrat(String value) {
        this.referenceContrat = value;
    }

    /**
     * Obtient la valeur de la propriété libelleContrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleContrat() {
        return libelleContrat;
    }

    /**
     * Définit la valeur de la propriété libelleContrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleContrat(String value) {
        this.libelleContrat = value;
    }

    /**
     * Obtient la valeur de la propriété ancienneReferenceContrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncienneReferenceContrat() {
        return ancienneReferenceContrat;
    }

    /**
     * Définit la valeur de la propriété ancienneReferenceContrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncienneReferenceContrat(String value) {
        this.ancienneReferenceContrat = value;
    }

}
