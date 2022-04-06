/*
 * XML Type:  CT_Extension
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtension
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Extension(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExtension extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtension> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctextension1f1etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "uri" attribute
     */
    java.lang.String getUri();

    /**
     * Gets (as xml) the "uri" attribute
     */
    org.apache.xmlbeans.XmlToken xgetUri();

    /**
     * True if has "uri" attribute
     */
    boolean isSetUri();

    /**
     * Sets the "uri" attribute
     */
    void setUri(java.lang.String uri);

    /**
     * Sets (as xml) the "uri" attribute
     */
    void xsetUri(org.apache.xmlbeans.XmlToken uri);

    /**
     * Unsets the "uri" attribute
     */
    void unsetUri();
}
