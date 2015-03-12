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
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="Organisme">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CodeOC" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="5"/>
 *                       &lt;maxLength value="9"/>
 *                       &lt;pattern value="[P][0-9]{4}"/>
 *                       &lt;pattern value="[A][0-9A-Z]{5}"/>
 *                       &lt;pattern value="[0-9]{9}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="CodeDELEG">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="6"/>
 *                       &lt;pattern value="[G][0-9A-Z]{5}"/>
 *                       &lt;pattern value="[D][0-9A-Z]{5}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AncienCodeOC">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="5"/>
 *                       &lt;maxLength value="9"/>
 *                       &lt;pattern value="[P][0-9]{4}"/>
 *                       &lt;pattern value="[A][0-9A-Z]{5}"/>
 *                       &lt;pattern value="[0-9]{9}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AncienCodeDELEG">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="6"/>
 *                       &lt;pattern value="[G][0-9A-Z]{5}"/>
 *                       &lt;pattern value="[D][0-9A-Z]{5}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contrat">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ReferenceContrat" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="30"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="LibelleContrat" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="60"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AncienneReferenceContrat">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="30"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Option" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CodeOption" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="30"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="LibelleOption" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="60"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AncienCodeOption">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="30"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Population" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CodePopulation" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="30"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="LibellePopulation" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="60"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AncienCodePopulation">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="30"/>
 *                       &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ElementsDeCalculAttendus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="19">
 *                   &lt;element name="BrutPrev" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TAPrev" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="T2Prev" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TBPrev" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TCPrev" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TDPrev" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TD1Prev" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BaseMontantSpecifique" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice minOccurs="0">
 *                             &lt;element name="Taux">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Montant">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="0"/>
 *                                   &lt;maxExclusive value="1000000000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                           &lt;attribute name="ValeurCodeNature" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="17"/>
 *                                 &lt;enumeration value="18"/>
 *                                 &lt;enumeration value="19"/>
 *                                 &lt;enumeration value="20"/>
 *                                 &lt;enumeration value="21"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="LibelleCodeNature">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="60"/>
 *                                 &lt;pattern value="[ "&amp;-:=@-Z_-z����-��-��-��-��-��-��-��-��]+"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Changement">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="01"/>
 *             &lt;enumeration value="02"/>
 *             &lt;enumeration value="03"/>
 *             &lt;enumeration value="04"/>
 *             &lt;enumeration value="05"/>
 *             &lt;enumeration value="99"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Periodicite">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Annuel"/>
 *             &lt;enumeration value="Semestriel"/>
 *             &lt;enumeration value="Trimestriel"/>
 *             &lt;enumeration value="Mensuel"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DateDebutValidite" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="8"/>
 *             &lt;pattern value="((31(0[13578]|1[02])(20\d{2}))|((0[1-9]|[12]\d|30)(0[13456789]|1[012])(20\d{2}))|((0[1-9]|1\d|2[0-8])02(20\d{2}))|(290220((0[048]|[2468][048]|[13579][26]))))"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DateFinValidite">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="8"/>
 *             &lt;pattern value="((31(0[13578]|1[02])(20\d{2}))|((0[1-9]|[12]\d|30)(0[13456789]|1[012])(20\d{2}))|((0[1-9]|1\d|2[0-8])02(20\d{2}))|(290220((0[048]|[2468][048]|[13579][26]))))"/>
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
    "organisme",
    "contrat",
    "option",
    "population",
    "elementsDeCalculAttendus"
})
public class ParametresContrats {

    @XmlElement(name = "Organisme", required = true)
    protected Organisme organisme;
    @XmlElement(name = "Contrat", required = true)
    protected Contrat contrat;
    @XmlElement(name = "Option")
    protected Option option;
    @XmlElement(name = "Population")
    protected Population population;
    @XmlElement(name = "ElementsDeCalculAttendus")
    protected ElementsDeCalculAttendus elementsDeCalculAttendus;
    @XmlAttribute(name = "Changement")
    protected String changement;
    @XmlAttribute(name = "Periodicite")
    protected String periodicite;
    @XmlAttribute(name = "DateDebutValidite", required = true)
    protected String dateDebutValidite;
    @XmlAttribute(name = "DateFinValidite")
    protected String dateFinValidite;

    /**
     * Obtient la valeur de la propri�t� organisme.
     * 
     * @return
     *     possible object is
     *     {@link Organisme }
     *     
     */
    public Organisme getOrganisme() {
        return organisme;
    }

    /**
     * D�finit la valeur de la propri�t� organisme.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisme }
     *     
     */
    public void setOrganisme(Organisme value) {
        this.organisme = value;
    }

    /**
     * Obtient la valeur de la propri�t� contrat.
     * 
     * @return
     *     possible object is
     *     {@link Contrat }
     *     
     */
    public Contrat getContrat() {
        return contrat;
    }

    /**
     * D�finit la valeur de la propri�t� contrat.
     * 
     * @param value
     *     allowed object is
     *     {@link Contrat }
     *     
     */
    public void setContrat(Contrat value) {
        this.contrat = value;
    }

    /**
     * Obtient la valeur de la propri�t� option.
     * 
     * @return
     *     possible object is
     *     {@link Option }
     *     
     */
    public Option getOption() {
        return option;
    }

    /**
     * D�finit la valeur de la propri�t� option.
     * 
     * @param value
     *     allowed object is
     *     {@link Option }
     *     
     */
    public void setOption(Option value) {
        this.option = value;
    }

    /**
     * Obtient la valeur de la propri�t� population.
     * 
     * @return
     *     possible object is
     *     {@link Population }
     *     
     */
    public Population getPopulation() {
        return population;
    }

    /**
     * D�finit la valeur de la propri�t� population.
     * 
     * @param value
     *     allowed object is
     *     {@link Population }
     *     
     */
    public void setPopulation(Population value) {
        this.population = value;
    }

    /**
     * Obtient la valeur de la propri�t� elementsDeCalculAttendus.
     * 
     * @return
     *     possible object is
     *     {@link ElementsDeCalculAttendus }
     *     
     */
    public ElementsDeCalculAttendus getElementsDeCalculAttendus() {
        return elementsDeCalculAttendus;
    }

    /**
     * D�finit la valeur de la propri�t� elementsDeCalculAttendus.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementsDeCalculAttendus }
     *     
     */
    public void setElementsDeCalculAttendus(ElementsDeCalculAttendus value) {
        this.elementsDeCalculAttendus = value;
    }

    /**
     * Obtient la valeur de la propri�t� changement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangement() {
        return changement;
    }

    /**
     * D�finit la valeur de la propri�t� changement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangement(String value) {
        this.changement = value;
    }

    /**
     * Obtient la valeur de la propri�t� periodicite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicite() {
        return periodicite;
    }

    /**
     * D�finit la valeur de la propri�t� periodicite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicite(String value) {
        this.periodicite = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateDebutValidite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDebutValidite() {
        return dateDebutValidite;
    }

    /**
     * D�finit la valeur de la propri�t� dateDebutValidite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDebutValidite(String value) {
        this.dateDebutValidite = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFinValidite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFinValidite() {
        return dateFinValidite;
    }

    /**
     * D�finit la valeur de la propri�t� dateFinValidite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFinValidite(String value) {
        this.dateFinValidite = value;
    }

}
