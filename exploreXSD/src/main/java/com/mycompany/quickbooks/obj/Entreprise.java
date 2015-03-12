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
 *       &lt;attribute name="SIREN" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="9"/>
 *             &lt;pattern value="[0-9]*[1-9][0-9]*"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RaisonSociale" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z«°»À-ÅÇ-ÏÑ-ÖÙ-Ýà-åç-ïñ-öù-ýÿ]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NIC">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EnsembleEtab">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9A-Z]{5}"/>
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
public class Entreprise {

    @XmlAttribute(name = "SIREN", required = true)
    protected String siren;
    @XmlAttribute(name = "RaisonSociale", required = true)
    protected String raisonSociale;
    @XmlAttribute(name = "NIC")
    protected String nic;
    @XmlAttribute(name = "EnsembleEtab")
    protected String ensembleEtab;

    /**
     * Obtient la valeur de la propriété siren.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIREN() {
        return siren;
    }

    /**
     * Définit la valeur de la propriété siren.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIREN(String value) {
        this.siren = value;
    }

    /**
     * Obtient la valeur de la propriété raisonSociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaisonSociale() {
        return raisonSociale;
    }

    /**
     * Définit la valeur de la propriété raisonSociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaisonSociale(String value) {
        this.raisonSociale = value;
    }

    /**
     * Obtient la valeur de la propriété nic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIC() {
        return nic;
    }

    /**
     * Définit la valeur de la propriété nic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIC(String value) {
        this.nic = value;
    }

    /**
     * Obtient la valeur de la propriété ensembleEtab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnsembleEtab() {
        return ensembleEtab;
    }

    /**
     * Définit la valeur de la propriété ensembleEtab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnsembleEtab(String value) {
        this.ensembleEtab = value;
    }

}
