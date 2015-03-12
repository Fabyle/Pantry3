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
 *       &lt;attribute name="UniteAnciennete" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="(01|02|03)"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BorneINF">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;pattern value="[0]*[1-9][0-9]*"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BorneSUP">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;pattern value="[0]*[1-9][0-9]*"/>
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
public class AncienneteBrancheSecteur {

    @XmlAttribute(name = "UniteAnciennete", required = true)
    protected String uniteAnciennete;
    @XmlAttribute(name = "BorneINF")
    protected String borneINF;
    @XmlAttribute(name = "BorneSUP")
    protected String borneSUP;

    /**
     * Obtient la valeur de la propriété uniteAnciennete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniteAnciennete() {
        return uniteAnciennete;
    }

    /**
     * Définit la valeur de la propriété uniteAnciennete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniteAnciennete(String value) {
        this.uniteAnciennete = value;
    }

    /**
     * Obtient la valeur de la propriété borneINF.
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
     * Définit la valeur de la propriété borneINF.
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
     * Obtient la valeur de la propriété borneSUP.
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
     * Définit la valeur de la propriété borneSUP.
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
