/*
 * XML Type:  ST_CharacterSpacing
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.STCharacterSpacing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_CharacterSpacing(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.wordprocessingml.x2006.main.STCharacterSpacing.
 */
public interface STCharacterSpacing extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<org.openxmlformats.schemas.wordprocessingml.x2006.main.STCharacterSpacing> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stcharacterspacing803etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum DO_NOT_COMPRESS = Enum.forString("doNotCompress");
    Enum COMPRESS_PUNCTUATION = Enum.forString("compressPunctuation");
    Enum COMPRESS_PUNCTUATION_AND_JAPANESE_KANA = Enum.forString("compressPunctuationAndJapaneseKana");

    int INT_DO_NOT_COMPRESS = Enum.INT_DO_NOT_COMPRESS;
    int INT_COMPRESS_PUNCTUATION = Enum.INT_COMPRESS_PUNCTUATION;
    int INT_COMPRESS_PUNCTUATION_AND_JAPANESE_KANA = Enum.INT_COMPRESS_PUNCTUATION_AND_JAPANESE_KANA;

    /**
     * Enumeration value class for org.openxmlformats.schemas.wordprocessingml.x2006.main.STCharacterSpacing.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DO_NOT_COMPRESS
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s) {
            return (Enum)table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum)table.forInt(i);
        }

        private Enum(java.lang.String s, int i) {
            super(s, i);
        }

        static final int INT_DO_NOT_COMPRESS = 1;
        static final int INT_COMPRESS_PUNCTUATION = 2;
        static final int INT_COMPRESS_PUNCTUATION_AND_JAPANESE_KANA = 3;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("doNotCompress", INT_DO_NOT_COMPRESS),
            new Enum("compressPunctuation", INT_COMPRESS_PUNCTUATION),
            new Enum("compressPunctuationAndJapaneseKana", INT_COMPRESS_PUNCTUATION_AND_JAPANESE_KANA),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
