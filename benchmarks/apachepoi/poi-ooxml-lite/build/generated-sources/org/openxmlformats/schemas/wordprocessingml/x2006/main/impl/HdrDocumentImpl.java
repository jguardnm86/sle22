/*
 * An XML document type.
 * Localname: hdr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one hdr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class HdrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument {
    private static final long serialVersionUID = 1L;

    public HdrDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hdr"),
    };


    /**
     * Gets the "hdr" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr getHdr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "hdr" element
     */
    @Override
    public void setHdr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr hdr) {
        generatedSetterHelperImpl(hdr, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "hdr" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr addNewHdr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
