/*
 * An XML document type.
 * Localname: colorsDefHdrLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefHdrLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one colorsDefHdrLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram) element.
 *
 * This is a complex type.
 */
public class ColorsDefHdrLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.ColorsDefHdrLstDocument {
    private static final long serialVersionUID = 1L;

    public ColorsDefHdrLstDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "colorsDefHdrLst"),
    };


    /**
     * Gets the "colorsDefHdrLst" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst getColorsDefHdrLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "colorsDefHdrLst" element
     */
    @Override
    public void setColorsDefHdrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst colorsDefHdrLst) {
        generatedSetterHelperImpl(colorsDefHdrLst, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "colorsDefHdrLst" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst addNewColorsDefHdrLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
