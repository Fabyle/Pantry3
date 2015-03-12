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
 *             &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
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
     * Obtient la valeur de la propri�t� siren.
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
     * D�finit la valeur de la propri�t� siren.
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
     * Obtient la valeur de la propri�t� raisonSociale.
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
     * D�finit la valeur de la propri�t� raisonSociale.
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
     * Obtient la valeur de la propri�t� nic.
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
     * D�finit la valeur de la propri�t� nic.
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
     * Obtient la valeur de la propri�t� ensembleEtab.
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
     * D�finit la valeur de la propri�t� ensembleEtab.
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
