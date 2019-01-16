//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.12 at 12:22:50 PM GMT 
//
package eu.stork.peps.complex.attributes.eu.stork.names.tc.stork._2_0.academic.generaldiploma;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InformationOnTheLevelOfTheQualificationType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="InformationOnTheLevelOfTheQualificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Level">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}RichTextTagType">
 *                 &lt;attribute name="isced1997" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}ISCED1997Type" />
 *                 &lt;attribute name="isced2011" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}ISCED2011Type" />
 *                 &lt;attribute name="eheaFramework" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}EHEAFrameworkType" />
 *                 &lt;attribute name="nfq" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}NFQType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OfficialLengthOfProgramme">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}RichTextTagType">
 *                 &lt;attribute name="ectsCredits" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}PositiveDecimalType" />
 *                 &lt;attribute name="years" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}PositiveDecimalType" />
 *                 &lt;attribute name="semesters" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}PositiveIntegerType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccessRequirements" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}RichTextTagType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationOnTheLevelOfTheQualificationType", propOrder = {
    "level",
    "officialLengthOfProgramme",
    "accessRequirements"
})
public class InformationOnTheLevelOfTheQualificationType {

    @XmlElement(name = "Level", required = true)
    protected InformationOnTheLevelOfTheQualificationType.Level level;
    @XmlElement(name = "OfficialLengthOfProgramme", required = true)
    protected InformationOnTheLevelOfTheQualificationType.OfficialLengthOfProgramme officialLengthOfProgramme;
    @XmlElement(name = "AccessRequirements")
    protected RichTextTagType accessRequirements;

    /**
     * Gets the value of the level property.
     *
     * @return possible object is
     *     {@link InformationOnTheLevelOfTheQualificationType.Level }
     *
     */
    public InformationOnTheLevelOfTheQualificationType.Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     *
     * @param value allowed object is
     *     {@link InformationOnTheLevelOfTheQualificationType.Level }
     *
     */
    public void setLevel(InformationOnTheLevelOfTheQualificationType.Level value) {
        this.level = value;
    }

    /**
     * Gets the value of the officialLengthOfProgramme property.
     *
     * @return possible object is
     *     {@link InformationOnTheLevelOfTheQualificationType.OfficialLengthOfProgramme }
     *
     */
    public InformationOnTheLevelOfTheQualificationType.OfficialLengthOfProgramme getOfficialLengthOfProgramme() {
        return officialLengthOfProgramme;
    }

    /**
     * Sets the value of the officialLengthOfProgramme property.
     *
     * @param value allowed object is
     *     {@link InformationOnTheLevelOfTheQualificationType.OfficialLengthOfProgramme }
     *
     */
    public void setOfficialLengthOfProgramme(InformationOnTheLevelOfTheQualificationType.OfficialLengthOfProgramme value) {
        this.officialLengthOfProgramme = value;
    }

    /**
     * Gets the value of the accessRequirements property.
     *
     * @return possible object is {@link RichTextTagType }
     *
     */
    public RichTextTagType getAccessRequirements() {
        return accessRequirements;
    }

    /**
     * Sets the value of the accessRequirements property.
     *
     * @param value allowed object is {@link RichTextTagType }
     *
     */
    public void setAccessRequirements(RichTextTagType value) {
        this.accessRequirements = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}RichTextTagType">
     *       &lt;attribute name="isced1997" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}ISCED1997Type" />
     *       &lt;attribute name="isced2011" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}ISCED2011Type" />
     *       &lt;attribute name="eheaFramework" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}EHEAFrameworkType" />
     *       &lt;attribute name="nfq" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}NFQType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Level
            extends RichTextTagType {

        @XmlAttribute(name = "isced1997")
        protected String isced1997;
        @XmlAttribute(name = "isced2011")
        protected String isced2011;
        @XmlAttribute(name = "eheaFramework")
        protected EHEAFrameworkType eheaFramework;
        @XmlAttribute(name = "nfq")
        protected String nfq;

        /**
         * Gets the value of the isced1997 property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIsced1997() {
            return isced1997;
        }

        /**
         * Sets the value of the isced1997 property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIsced1997(String value) {
            this.isced1997 = value;
        }

        /**
         * Gets the value of the isced2011 property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getIsced2011() {
            return isced2011;
        }

        /**
         * Sets the value of the isced2011 property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setIsced2011(String value) {
            this.isced2011 = value;
        }

        /**
         * Gets the value of the eheaFramework property.
         *
         * @return possible object is {@link EHEAFrameworkType }
         *
         */
        public EHEAFrameworkType getEheaFramework() {
            return eheaFramework;
        }

        /**
         * Sets the value of the eheaFramework property.
         *
         * @param value allowed object is {@link EHEAFrameworkType }
         *
         */
        public void setEheaFramework(EHEAFrameworkType value) {
            this.eheaFramework = value;
        }

        /**
         * Gets the value of the nfq property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getNfq() {
            return nfq;
        }

        /**
         * Sets the value of the nfq property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setNfq(String value) {
            this.nfq = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}RichTextTagType">
     *       &lt;attribute name="ectsCredits" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}PositiveDecimalType" />
     *       &lt;attribute name="years" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}PositiveDecimalType" />
     *       &lt;attribute name="semesters" type="{urn:eu:stork:names:tc:STORK:2.0:academic:generaldiploma}PositiveIntegerType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfficialLengthOfProgramme
            extends RichTextTagType {

        @XmlAttribute(name = "ectsCredits")
        protected BigDecimal ectsCredits;
        @XmlAttribute(name = "years")
        protected BigDecimal years;
        @XmlAttribute(name = "semesters")
        protected Integer semesters;

        /**
         * Gets the value of the ectsCredits property.
         *
         * @return possible object is {@link BigDecimal }
         *
         */
        public BigDecimal getEctsCredits() {
            return ectsCredits;
        }

        /**
         * Sets the value of the ectsCredits property.
         *
         * @param value allowed object is {@link BigDecimal }
         *
         */
        public void setEctsCredits(BigDecimal value) {
            this.ectsCredits = value;
        }

        /**
         * Gets the value of the years property.
         *
         * @return possible object is {@link BigDecimal }
         *
         */
        public BigDecimal getYears() {
            return years;
        }

        /**
         * Sets the value of the years property.
         *
         * @param value allowed object is {@link BigDecimal }
         *
         */
        public void setYears(BigDecimal value) {
            this.years = value;
        }

        /**
         * Gets the value of the semesters property.
         *
         * @return possible object is {@link Integer }
         *
         */
        public Integer getSemesters() {
            return semesters;
        }

        /**
         * Sets the value of the semesters property.
         *
         * @param value allowed object is {@link Integer }
         *
         */
        public void setSemesters(Integer value) {
            this.semesters = value;
        }

    }

}