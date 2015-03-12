//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.12 à 11:54:19 AM CET 
//


package com.mycompany.quickbooks.obj;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;choice>
 *         &lt;element name="ValeursIncluses" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Z]{3}[0-9]{3}"/>
 *               &lt;pattern value="[0-9]{3}[A-Z0-9]"/>
 *               &lt;pattern value="(06|07|08|37|38|39|40|42|49|50|51|52|53|999SPT|C643|L643|NP352|P352|C389M|C389N|T389M|T389N|546dM|546d)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValeursExclues" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Z]{3}[0-9]{3}"/>
 *               &lt;pattern value="[0-9]{3}[A-Z0-9]"/>
 *               &lt;pattern value="(06|07|08|37|38|39|40|42|49|50|51|52|53|999SPT|C643|L643|NP352|P352|C389M|C389N|T389M|T389N|546dM|546d)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valeursIncluses",
    "valeursExclues"
})
public class ComplementPCSESE {

    @XmlElement(name = "ValeursIncluses")
    protected List<String> valeursIncluses;
    @XmlElement(name = "ValeursExclues")
    protected List<String> valeursExclues;

    /**
     * Gets the value of the valeursIncluses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valeursIncluses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValeursIncluses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValeursIncluses() {
        if (valeursIncluses == null) {
            valeursIncluses = new ArrayList<String>();
        }
        return this.valeursIncluses;
    }

    /**
     * Gets the value of the valeursExclues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valeursExclues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValeursExclues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValeursExclues() {
        if (valeursExclues == null) {
            valeursExclues = new ArrayList<String>();
        }
        return this.valeursExclues;
    }

}
