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
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
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
     * Obtient la valeur de la propri�t� codeProducteur.
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
     * D�finit la valeur de la propri�t� codeProducteur.
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
     * Obtient la valeur de la propri�t� raisonSocialeProducteur.
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
     * D�finit la valeur de la propri�t� raisonSocialeProducteur.
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
     * Obtient la valeur de la propri�t� codePorteurDeRisque.
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
     * D�finit la valeur de la propri�t� codePorteurDeRisque.
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
