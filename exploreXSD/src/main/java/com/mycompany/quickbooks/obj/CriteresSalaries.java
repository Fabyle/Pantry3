//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.12 à 11:54:19 AM CET 
//


package com.mycompany.quickbooks.obj;

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
 *       &lt;sequence>
 *         &lt;element name="NICAffectation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{5}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{5}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NatureContrat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="15">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|05|06|07|08|29|32|50|60|70|80|81|89|90)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="15">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|05|06|07|08|29|32|50|60|70|80|81|89|90)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ModaliteExercice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(10|20|21|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(10|20|21|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MotifDeRecours" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="12">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04|05|06|07|08|09|10|11|12|13)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="12">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04|05|06|07|08|09|10|11|12|13)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StatutConventionnel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="9">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04|05|06|07|08|09|10)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="9">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04|05|06|07|08|09|10)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StatutCategoriel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|04|98|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="4">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|04|98|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegimeMaladie" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="15">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(134|135|136|137|138|140|141|144|145|146|147|149|200|300|400|900)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="15">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(134|135|136|137|138|140|141|144|145|146|147|149|200|300|400|900)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegimeVieillesse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="23">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(120|121|122|134|135|136|137|139|140|141|144|145|147|149|157|158|159|160|200|300|900|903|904|999)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="23">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(120|121|122|134|135|136|137|139|140|141|144|145|147|149|157|158|159|160|200|300|900|903|904|999)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ComplementRegimeBase" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodePCSESE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([0-9]{3}[a-z])"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([0-9]{3}[a-z])"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ComplementPCSESE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[A-Z]{3}[0-9]{3}"/>
 *                         &lt;pattern value="[0-9]{3}[A-Z0-9]"/>
 *                         &lt;pattern value="(06|07|08|37|38|39|40|42|49|50|51|52|53|999SPT|C643|L643|NP352|P352|C389M|C389N|T389M|T389N|546dM|546d)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[A-Z]{3}[0-9]{3}"/>
 *                         &lt;pattern value="[0-9]{3}[A-Z0-9]"/>
 *                         &lt;pattern value="(06|07|08|37|38|39|40|42|49|50|51|52|53|999SPT|C643|L643|NP352|P352|C389M|C389N|T389M|T389N|546dM|546d)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConventionCollective" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([0-9]{4})"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([0-9]{4})"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StatutEmploiSalarie" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="6">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04|06|07|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="6">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04|06|07|99)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DetacheExpatrieFrontalier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ValeursIncluses" maxOccurs="3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValeursExclues" maxOccurs="3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(01|02|03|04)"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="QuotiteDeTravail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UniteTempsDeTravail" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="(10|12|20|21|31|32|33|90|99)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneINF">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="4"/>
 *                       &lt;maxLength value="7"/>
 *                       &lt;pattern value="[0]*([1-9][0-9]*\.[0-9]{2}|0\.[0-9]{2})"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneSUP">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="4"/>
 *                       &lt;maxLength value="7"/>
 *                       &lt;pattern value="[0]*([1-9][0-9]*\.[0-9]{2}|0\.[0-9]{2})"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DateAffiliation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BorneINF">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="8"/>
 *                       &lt;pattern value="((31(0[13578]|1[02])((19|20)\d{2}))|((0[1-9]|[12]\d|30)(0[13456789]|1[012])((19|20)\d{2}))|((0[1-9]|1\d|2[0-8])02((19|20)\d{2}))|(290220((0[048]|[2468][048]|[13579][26])))|(290219((0[48]|[2468][048]|[13579][26]))))"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneSUP">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="8"/>
 *                       &lt;pattern value="((31(0[13578]|1[02])((19|20)\d{2}))|((0[1-9]|[12]\d|30)(0[13456789]|1[012])((19|20)\d{2}))|((0[1-9]|1\d|2[0-8])02((19|20)\d{2}))|(290220((0[048]|[2468][048]|[13579][26])))|(290219((0[48]|[2468][048]|[13579][26]))))"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncienneteEntrepriseGroupe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UniteAnciennete" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="(01|02|03)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneINF">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneSUP">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncienneteBrancheSecteur" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UniteAnciennete" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="(01|02|03)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneINF">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneSUP">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncienneteCollegeCategorie" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UniteAnciennete" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="(01|02|03)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneINF">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneSUP">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncienneteDansLePoste" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UniteAnciennete" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="(01|02|03)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneINF">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneSUP">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncienneteProfessionBTP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="UniteAnciennete" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="(01|02|03)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneINF">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="BorneSUP">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="5"/>
 *                       &lt;pattern value="[0]*[1-9][0-9]*"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nicAffectation",
    "natureContrat",
    "modaliteExercice",
    "motifDeRecours",
    "statutConventionnel",
    "statutCategoriel",
    "regimeMaladie",
    "regimeVieillesse",
    "complementRegimeBase",
    "codePCSESE",
    "complementPCSESE",
    "conventionCollective",
    "statutEmploiSalarie",
    "detacheExpatrieFrontalier",
    "quotiteDeTravail",
    "dateAffiliation",
    "ancienneteEntrepriseGroupe",
    "ancienneteBrancheSecteur",
    "ancienneteCollegeCategorie",
    "ancienneteDansLePoste",
    "ancienneteProfessionBTP"
})
public class CriteresSalaries {

    @XmlElement(name = "NICAffectation")
    protected NICAffectation nicAffectation;
    @XmlElement(name = "NatureContrat")
    protected NatureContrat natureContrat;
    @XmlElement(name = "ModaliteExercice")
    protected ModaliteExercice modaliteExercice;
    @XmlElement(name = "MotifDeRecours")
    protected MotifDeRecours motifDeRecours;
    @XmlElement(name = "StatutConventionnel")
    protected StatutConventionnel statutConventionnel;
    @XmlElement(name = "StatutCategoriel")
    protected StatutCategoriel statutCategoriel;
    @XmlElement(name = "RegimeMaladie")
    protected RegimeMaladie regimeMaladie;
    @XmlElement(name = "RegimeVieillesse")
    protected RegimeVieillesse regimeVieillesse;
    @XmlElement(name = "ComplementRegimeBase")
    protected ComplementRegimeBase complementRegimeBase;
    @XmlElement(name = "CodePCSESE")
    protected CodePCSESE codePCSESE;
    @XmlElement(name = "ComplementPCSESE")
    protected ComplementPCSESE complementPCSESE;
    @XmlElement(name = "ConventionCollective")
    protected ConventionCollective conventionCollective;
    @XmlElement(name = "StatutEmploiSalarie")
    protected StatutEmploiSalarie statutEmploiSalarie;
    @XmlElement(name = "DetacheExpatrieFrontalier")
    protected DetacheExpatrieFrontalier detacheExpatrieFrontalier;
    @XmlElement(name = "QuotiteDeTravail")
    protected QuotiteDeTravail quotiteDeTravail;
    @XmlElement(name = "DateAffiliation")
    protected DateAffiliation dateAffiliation;
    @XmlElement(name = "AncienneteEntrepriseGroupe")
    protected AncienneteEntrepriseGroupe ancienneteEntrepriseGroupe;
    @XmlElement(name = "AncienneteBrancheSecteur")
    protected AncienneteBrancheSecteur ancienneteBrancheSecteur;
    @XmlElement(name = "AncienneteCollegeCategorie")
    protected AncienneteCollegeCategorie ancienneteCollegeCategorie;
    @XmlElement(name = "AncienneteDansLePoste")
    protected AncienneteDansLePoste ancienneteDansLePoste;
    @XmlElement(name = "AncienneteProfessionBTP")
    protected AncienneteProfessionBTP ancienneteProfessionBTP;

    /**
     * Obtient la valeur de la propriété nicAffectation.
     * 
     * @return
     *     possible object is
     *     {@link NICAffectation }
     *     
     */
    public NICAffectation getNICAffectation() {
        return nicAffectation;
    }

    /**
     * Définit la valeur de la propriété nicAffectation.
     * 
     * @param value
     *     allowed object is
     *     {@link NICAffectation }
     *     
     */
    public void setNICAffectation(NICAffectation value) {
        this.nicAffectation = value;
    }

    /**
     * Obtient la valeur de la propriété natureContrat.
     * 
     * @return
     *     possible object is
     *     {@link NatureContrat }
     *     
     */
    public NatureContrat getNatureContrat() {
        return natureContrat;
    }

    /**
     * Définit la valeur de la propriété natureContrat.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureContrat }
     *     
     */
    public void setNatureContrat(NatureContrat value) {
        this.natureContrat = value;
    }

    /**
     * Obtient la valeur de la propriété modaliteExercice.
     * 
     * @return
     *     possible object is
     *     {@link ModaliteExercice }
     *     
     */
    public ModaliteExercice getModaliteExercice() {
        return modaliteExercice;
    }

    /**
     * Définit la valeur de la propriété modaliteExercice.
     * 
     * @param value
     *     allowed object is
     *     {@link ModaliteExercice }
     *     
     */
    public void setModaliteExercice(ModaliteExercice value) {
        this.modaliteExercice = value;
    }

    /**
     * Obtient la valeur de la propriété motifDeRecours.
     * 
     * @return
     *     possible object is
     *     {@link MotifDeRecours }
     *     
     */
    public MotifDeRecours getMotifDeRecours() {
        return motifDeRecours;
    }

    /**
     * Définit la valeur de la propriété motifDeRecours.
     * 
     * @param value
     *     allowed object is
     *     {@link MotifDeRecours }
     *     
     */
    public void setMotifDeRecours(MotifDeRecours value) {
        this.motifDeRecours = value;
    }

    /**
     * Obtient la valeur de la propriété statutConventionnel.
     * 
     * @return
     *     possible object is
     *     {@link StatutConventionnel }
     *     
     */
    public StatutConventionnel getStatutConventionnel() {
        return statutConventionnel;
    }

    /**
     * Définit la valeur de la propriété statutConventionnel.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutConventionnel }
     *     
     */
    public void setStatutConventionnel(StatutConventionnel value) {
        this.statutConventionnel = value;
    }

    /**
     * Obtient la valeur de la propriété statutCategoriel.
     * 
     * @return
     *     possible object is
     *     {@link StatutCategoriel }
     *     
     */
    public StatutCategoriel getStatutCategoriel() {
        return statutCategoriel;
    }

    /**
     * Définit la valeur de la propriété statutCategoriel.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutCategoriel }
     *     
     */
    public void setStatutCategoriel(StatutCategoriel value) {
        this.statutCategoriel = value;
    }

    /**
     * Obtient la valeur de la propriété regimeMaladie.
     * 
     * @return
     *     possible object is
     *     {@link RegimeMaladie }
     *     
     */
    public RegimeMaladie getRegimeMaladie() {
        return regimeMaladie;
    }

    /**
     * Définit la valeur de la propriété regimeMaladie.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimeMaladie }
     *     
     */
    public void setRegimeMaladie(RegimeMaladie value) {
        this.regimeMaladie = value;
    }

    /**
     * Obtient la valeur de la propriété regimeVieillesse.
     * 
     * @return
     *     possible object is
     *     {@link RegimeVieillesse }
     *     
     */
    public RegimeVieillesse getRegimeVieillesse() {
        return regimeVieillesse;
    }

    /**
     * Définit la valeur de la propriété regimeVieillesse.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimeVieillesse }
     *     
     */
    public void setRegimeVieillesse(RegimeVieillesse value) {
        this.regimeVieillesse = value;
    }

    /**
     * Obtient la valeur de la propriété complementRegimeBase.
     * 
     * @return
     *     possible object is
     *     {@link ComplementRegimeBase }
     *     
     */
    public ComplementRegimeBase getComplementRegimeBase() {
        return complementRegimeBase;
    }

    /**
     * Définit la valeur de la propriété complementRegimeBase.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementRegimeBase }
     *     
     */
    public void setComplementRegimeBase(ComplementRegimeBase value) {
        this.complementRegimeBase = value;
    }

    /**
     * Obtient la valeur de la propriété codePCSESE.
     * 
     * @return
     *     possible object is
     *     {@link CodePCSESE }
     *     
     */
    public CodePCSESE getCodePCSESE() {
        return codePCSESE;
    }

    /**
     * Définit la valeur de la propriété codePCSESE.
     * 
     * @param value
     *     allowed object is
     *     {@link CodePCSESE }
     *     
     */
    public void setCodePCSESE(CodePCSESE value) {
        this.codePCSESE = value;
    }

    /**
     * Obtient la valeur de la propriété complementPCSESE.
     * 
     * @return
     *     possible object is
     *     {@link ComplementPCSESE }
     *     
     */
    public ComplementPCSESE getComplementPCSESE() {
        return complementPCSESE;
    }

    /**
     * Définit la valeur de la propriété complementPCSESE.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementPCSESE }
     *     
     */
    public void setComplementPCSESE(ComplementPCSESE value) {
        this.complementPCSESE = value;
    }

    /**
     * Obtient la valeur de la propriété conventionCollective.
     * 
     * @return
     *     possible object is
     *     {@link ConventionCollective }
     *     
     */
    public ConventionCollective getConventionCollective() {
        return conventionCollective;
    }

    /**
     * Définit la valeur de la propriété conventionCollective.
     * 
     * @param value
     *     allowed object is
     *     {@link ConventionCollective }
     *     
     */
    public void setConventionCollective(ConventionCollective value) {
        this.conventionCollective = value;
    }

    /**
     * Obtient la valeur de la propriété statutEmploiSalarie.
     * 
     * @return
     *     possible object is
     *     {@link StatutEmploiSalarie }
     *     
     */
    public StatutEmploiSalarie getStatutEmploiSalarie() {
        return statutEmploiSalarie;
    }

    /**
     * Définit la valeur de la propriété statutEmploiSalarie.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutEmploiSalarie }
     *     
     */
    public void setStatutEmploiSalarie(StatutEmploiSalarie value) {
        this.statutEmploiSalarie = value;
    }

    /**
     * Obtient la valeur de la propriété detacheExpatrieFrontalier.
     * 
     * @return
     *     possible object is
     *     {@link DetacheExpatrieFrontalier }
     *     
     */
    public DetacheExpatrieFrontalier getDetacheExpatrieFrontalier() {
        return detacheExpatrieFrontalier;
    }

    /**
     * Définit la valeur de la propriété detacheExpatrieFrontalier.
     * 
     * @param value
     *     allowed object is
     *     {@link DetacheExpatrieFrontalier }
     *     
     */
    public void setDetacheExpatrieFrontalier(DetacheExpatrieFrontalier value) {
        this.detacheExpatrieFrontalier = value;
    }

    /**
     * Obtient la valeur de la propriété quotiteDeTravail.
     * 
     * @return
     *     possible object is
     *     {@link QuotiteDeTravail }
     *     
     */
    public QuotiteDeTravail getQuotiteDeTravail() {
        return quotiteDeTravail;
    }

    /**
     * Définit la valeur de la propriété quotiteDeTravail.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotiteDeTravail }
     *     
     */
    public void setQuotiteDeTravail(QuotiteDeTravail value) {
        this.quotiteDeTravail = value;
    }

    /**
     * Obtient la valeur de la propriété dateAffiliation.
     * 
     * @return
     *     possible object is
     *     {@link DateAffiliation }
     *     
     */
    public DateAffiliation getDateAffiliation() {
        return dateAffiliation;
    }

    /**
     * Définit la valeur de la propriété dateAffiliation.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAffiliation }
     *     
     */
    public void setDateAffiliation(DateAffiliation value) {
        this.dateAffiliation = value;
    }

    /**
     * Obtient la valeur de la propriété ancienneteEntrepriseGroupe.
     * 
     * @return
     *     possible object is
     *     {@link AncienneteEntrepriseGroupe }
     *     
     */
    public AncienneteEntrepriseGroupe getAncienneteEntrepriseGroupe() {
        return ancienneteEntrepriseGroupe;
    }

    /**
     * Définit la valeur de la propriété ancienneteEntrepriseGroupe.
     * 
     * @param value
     *     allowed object is
     *     {@link AncienneteEntrepriseGroupe }
     *     
     */
    public void setAncienneteEntrepriseGroupe(AncienneteEntrepriseGroupe value) {
        this.ancienneteEntrepriseGroupe = value;
    }

    /**
     * Obtient la valeur de la propriété ancienneteBrancheSecteur.
     * 
     * @return
     *     possible object is
     *     {@link AncienneteBrancheSecteur }
     *     
     */
    public AncienneteBrancheSecteur getAncienneteBrancheSecteur() {
        return ancienneteBrancheSecteur;
    }

    /**
     * Définit la valeur de la propriété ancienneteBrancheSecteur.
     * 
     * @param value
     *     allowed object is
     *     {@link AncienneteBrancheSecteur }
     *     
     */
    public void setAncienneteBrancheSecteur(AncienneteBrancheSecteur value) {
        this.ancienneteBrancheSecteur = value;
    }

    /**
     * Obtient la valeur de la propriété ancienneteCollegeCategorie.
     * 
     * @return
     *     possible object is
     *     {@link AncienneteCollegeCategorie }
     *     
     */
    public AncienneteCollegeCategorie getAncienneteCollegeCategorie() {
        return ancienneteCollegeCategorie;
    }

    /**
     * Définit la valeur de la propriété ancienneteCollegeCategorie.
     * 
     * @param value
     *     allowed object is
     *     {@link AncienneteCollegeCategorie }
     *     
     */
    public void setAncienneteCollegeCategorie(AncienneteCollegeCategorie value) {
        this.ancienneteCollegeCategorie = value;
    }

    /**
     * Obtient la valeur de la propriété ancienneteDansLePoste.
     * 
     * @return
     *     possible object is
     *     {@link AncienneteDansLePoste }
     *     
     */
    public AncienneteDansLePoste getAncienneteDansLePoste() {
        return ancienneteDansLePoste;
    }

    /**
     * Définit la valeur de la propriété ancienneteDansLePoste.
     * 
     * @param value
     *     allowed object is
     *     {@link AncienneteDansLePoste }
     *     
     */
    public void setAncienneteDansLePoste(AncienneteDansLePoste value) {
        this.ancienneteDansLePoste = value;
    }

    /**
     * Obtient la valeur de la propriété ancienneteProfessionBTP.
     * 
     * @return
     *     possible object is
     *     {@link AncienneteProfessionBTP }
     *     
     */
    public AncienneteProfessionBTP getAncienneteProfessionBTP() {
        return ancienneteProfessionBTP;
    }

    /**
     * Définit la valeur de la propriété ancienneteProfessionBTP.
     * 
     * @param value
     *     allowed object is
     *     {@link AncienneteProfessionBTP }
     *     
     */
    public void setAncienneteProfessionBTP(AncienneteProfessionBTP value) {
        this.ancienneteProfessionBTP = value;
    }

}
