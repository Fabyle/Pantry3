//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.12 à 11:54:19 AM CET 
//


package com.mycompany.quickbooks.obj;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Taux">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minExclusive value="0"/>
 *               &lt;maxExclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Montant">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minExclusive value="0"/>
 *               &lt;maxExclusive value="1000000000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="ValeurCodeNature" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="17"/>
 *             &lt;enumeration value="18"/>
 *             &lt;enumeration value="19"/>
 *             &lt;enumeration value="20"/>
 *             &lt;enumeration value="21"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LibelleCodeNature">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
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
@XmlType(name = "", propOrder = {
    "taux",
    "montant"
})
public class BaseMontantSpecifique {

    @XmlElement(name = "Taux")
    protected BigDecimal taux;
    @XmlElement(name = "Montant")
    protected BigDecimal montant;
    @XmlAttribute(name = "ValeurCodeNature", required = true)
    protected String valeurCodeNature;
    @XmlAttribute(name = "LibelleCodeNature")
    protected String libelleCodeNature;

    /**
     * Obtient la valeur de la propriété taux.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaux() {
        return taux;
    }

    /**
     * Définit la valeur de la propriété taux.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaux(BigDecimal value) {
        this.taux = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontant(BigDecimal value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propriété valeurCodeNature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValeurCodeNature() {
        return valeurCodeNature;
    }

    /**
     * Définit la valeur de la propriété valeurCodeNature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValeurCodeNature(String value) {
        this.valeurCodeNature = value;
    }

    /**
     * Obtient la valeur de la propriété libelleCodeNature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleCodeNature() {
        return libelleCodeNature;
    }

    /**
     * Définit la valeur de la propriété libelleCodeNature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleCodeNature(String value) {
        this.libelleCodeNature = value;
    }

}
