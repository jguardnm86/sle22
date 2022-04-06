/*
 * An XML document type.
 * Localname: ReferenceInfo
 * Namespace: http://uri.etsi.org/01903/v1.3.2#
 * Java type: org.etsi.uri.x01903.v13.ReferenceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one ReferenceInfo(@http://uri.etsi.org/01903/v1.3.2#) element.
 *
 * This is a complex type.
 */
public class ReferenceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.etsi.uri.x01903.v13.ReferenceInfoDocument {
    private static final long serialVersionUID = 1L;

    public ReferenceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://uri.etsi.org/01903/v1.3.2#", "ReferenceInfo"),
    };


    /**
     * Gets the "ReferenceInfo" element
     */
    @Override
    public org.etsi.uri.x01903.v13.ReferenceInfoType getReferenceInfo() {
        synchronized (monitor()) {
            check_orphaned();
            org.etsi.uri.x01903.v13.ReferenceInfoType target = null;
            target = (org.etsi.uri.x01903.v13.ReferenceInfoType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ReferenceInfo" element
     */
    @Override
    public void setReferenceInfo(org.etsi.uri.x01903.v13.ReferenceInfoType referenceInfo) {
        generatedSetterHelperImpl(referenceInfo, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReferenceInfo" element
     */
    @Override
    public org.etsi.uri.x01903.v13.ReferenceInfoType addNewReferenceInfo() {
        synchronized (monitor()) {
            check_orphaned();
            org.etsi.uri.x01903.v13.ReferenceInfoType target = null;
            target = (org.etsi.uri.x01903.v13.ReferenceInfoType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
