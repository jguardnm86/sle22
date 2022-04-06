/*
 * An XML document type.
 * Localname: CompleteRevocationRefs
 * Namespace: http://uri.etsi.org/01903/v1.3.2#
 * Java type: org.etsi.uri.x01903.v13.CompleteRevocationRefsDocument
 *
 * Automatically generated - do not modify.
 */
package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one CompleteRevocationRefs(@http://uri.etsi.org/01903/v1.3.2#) element.
 *
 * This is a complex type.
 */
public class CompleteRevocationRefsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.etsi.uri.x01903.v13.CompleteRevocationRefsDocument {
    private static final long serialVersionUID = 1L;

    public CompleteRevocationRefsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteRevocationRefs"),
    };


    /**
     * Gets the "CompleteRevocationRefs" element
     */
    @Override
    public org.etsi.uri.x01903.v13.CompleteRevocationRefsType getCompleteRevocationRefs() {
        synchronized (monitor()) {
            check_orphaned();
            org.etsi.uri.x01903.v13.CompleteRevocationRefsType target = null;
            target = (org.etsi.uri.x01903.v13.CompleteRevocationRefsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CompleteRevocationRefs" element
     */
    @Override
    public void setCompleteRevocationRefs(org.etsi.uri.x01903.v13.CompleteRevocationRefsType completeRevocationRefs) {
        generatedSetterHelperImpl(completeRevocationRefs, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CompleteRevocationRefs" element
     */
    @Override
    public org.etsi.uri.x01903.v13.CompleteRevocationRefsType addNewCompleteRevocationRefs() {
        synchronized (monitor()) {
            check_orphaned();
            org.etsi.uri.x01903.v13.CompleteRevocationRefsType target = null;
            target = (org.etsi.uri.x01903.v13.CompleteRevocationRefsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
