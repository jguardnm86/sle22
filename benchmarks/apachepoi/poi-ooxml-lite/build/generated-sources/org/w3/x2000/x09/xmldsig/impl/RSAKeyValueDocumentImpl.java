/*
 * An XML document type.
 * Localname: RSAKeyValue
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.w3.x2000.x09.xmldsig.RSAKeyValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2000.x09.xmldsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one RSAKeyValue(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class RSAKeyValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2000.x09.xmldsig.RSAKeyValueDocument {
    private static final long serialVersionUID = 1L;

    public RSAKeyValueDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue"),
    };


    /**
     * Gets the "RSAKeyValue" element
     */
    @Override
    public org.w3.x2000.x09.xmldsig.RSAKeyValueType getRSAKeyValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.w3.x2000.x09.xmldsig.RSAKeyValueType target = null;
            target = (org.w3.x2000.x09.xmldsig.RSAKeyValueType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "RSAKeyValue" element
     */
    @Override
    public void setRSAKeyValue(org.w3.x2000.x09.xmldsig.RSAKeyValueType rsaKeyValue) {
        generatedSetterHelperImpl(rsaKeyValue, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RSAKeyValue" element
     */
    @Override
    public org.w3.x2000.x09.xmldsig.RSAKeyValueType addNewRSAKeyValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.w3.x2000.x09.xmldsig.RSAKeyValueType target = null;
            target = (org.w3.x2000.x09.xmldsig.RSAKeyValueType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
