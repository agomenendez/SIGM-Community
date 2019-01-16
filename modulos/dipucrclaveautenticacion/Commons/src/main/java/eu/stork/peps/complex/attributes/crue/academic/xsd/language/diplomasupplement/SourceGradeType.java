//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.12 at 12:22:50 PM GMT 
//
package eu.stork.peps.complex.attributes.crue.academic.xsd.language.diplomasupplement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SourceGradeType.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="SourceGradeType"> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string"> &lt;enumeration
 * value="Recognized"/> &lt;enumeration value="MobilityProgramme"/>
 * &lt;enumeration value="Another"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "SourceGradeType")
@XmlEnum
public enum SourceGradeType {

    /**
     * Recognized
     *
     */
    @XmlEnumValue("Recognized")
    RECOGNIZED("Recognized"),
    /**
     * Course unit attended in mobility programme
     *
     */
    @XmlEnumValue("MobilityProgramme")
    MOBILITY_PROGRAMME("MobilityProgramme"),
    /**
     * Another
     *
     */
    @XmlEnumValue("Another")
    ANOTHER("Another");
    private final String value;

    SourceGradeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceGradeType fromValue(String v) {
        for (SourceGradeType c : SourceGradeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}