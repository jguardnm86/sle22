/*
 * XML Type:  CT_FtnDocProps
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_FtnDocProps(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFtnDocProps extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps {
    DocumentFactory<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctftndocprops307atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "footnote" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef> getFootnoteList();

    /**
     * Gets array of all "footnote" elements
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] getFootnoteArray();

    /**
     * Gets ith "footnote" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef getFootnoteArray(int i);

    /**
     * Returns number of "footnote" element
     */
    int sizeOfFootnoteArray();

    /**
     * Sets array of all "footnote" element
     */
    void setFootnoteArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] footnoteArray);

    /**
     * Sets ith "footnote" element
     */
    void setFootnoteArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef footnote);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef insertNewFootnote(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef addNewFootnote();

    /**
     * Removes the ith "footnote" element
     */
    void removeFootnote(int i);
}
