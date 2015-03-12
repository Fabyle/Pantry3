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
 *       &lt;attribute name="CodeProducteur" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="5"/>
 *             &lt;maxLength value="9"/>
 *             &lt;pattern value="[P][0-9]{4}"/>
 *             &lt;pattern value="[A][0-9A-Z]{5}"/>
 *             &lt;pattern value="[0-9]{9}"/>
 *             &lt;pattern value="[D][0-9A-Z]{5}"/>
 *             &lt;pattern value="[G][0-9A-Z]{5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RaisonSocialeProducteur" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z«°»À-ÅÇ-ÏÑ-ÖÙ-Ýà-åç-ïñ-öù-ýÿ]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CodePorteurDeRisque">
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ProducteurFiche {

    @XmlAttribute(name = "CodeProducteur", required = true)
    protected String codeProducteur;
    @XmlAttribute(name = "RaisonSocialeProducteur", required = true)
    protected String raisonSocialeProducteur;
    @XmlAttribute(name = "CodePorteurDeRisque")
    protected String codePorteurDeRisque;

    /**
     * Obtient la valeur de la propriété codeProducteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeProducteur() {
        return codeProducteur;
    }

    /**
     * Définit la valeur de la propriété codeProducteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeProducteur(String value) {
        this.codeProducteur = value;
    }

    /**
     * Obtient la valeur de la propriété raisonSocialeProducteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaisonSocialeProducteur() {
        return raisonSocialeProducteur;
    }

    /**
     * Définit la valeur de la propriété raisonSocialeProducteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaisonSocialeProducteur(String value) {
        this.raisonSocialeProducteur = value;
    }

    /**
     * Obtient la valeur de la propriété codePorteurDeRisque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePorteurDeRisque() {
        return codePorteurDeRisque;
    }

    /**
     * Définit la valeur de la propriété codePorteurDeRisque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePorteurDeRisque(String value) {
        this.codePorteurDeRisque = value;
    }

}
