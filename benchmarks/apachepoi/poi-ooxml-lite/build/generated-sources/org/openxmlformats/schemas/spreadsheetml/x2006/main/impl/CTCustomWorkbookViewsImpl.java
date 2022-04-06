/*
 * XML Type:  CT_CustomWorkbookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_CustomWorkbookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomWorkbookViewsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews {
    private static final long serialVersionUID = 1L;

    public CTCustomWorkbookViewsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customWorkbookView"),
    };


    /**
     * Gets a List of "customWorkbookView" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView> getCustomWorkbookViewList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCustomWorkbookViewArray,
                this::setCustomWorkbookViewArray,
                this::insertNewCustomWorkbookView,
                this::removeCustomWorkbookView,
                this::sizeOfCustomWorkbookViewArray
            );
        }
    }

    /**
     * Gets array of all "customWorkbookView" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[] getCustomWorkbookViewArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[0]);
    }

    /**
     * Gets ith "customWorkbookView" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView getCustomWorkbookViewArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "customWorkbookView" element
     */
    @Override
    public int sizeOfCustomWorkbookViewArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "customWorkbookView" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCustomWorkbookViewArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView[] customWorkbookViewArray) {
        check_orphaned();
        arraySetterHelper(customWorkbookViewArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "customWorkbookView" element
     */
    @Override
    public void setCustomWorkbookViewArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView customWorkbookView) {
        generatedSetterHelperImpl(customWorkbookView, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "customWorkbookView" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView insertNewCustomWorkbookView(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "customWorkbookView" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView addNewCustomWorkbookView() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "customWorkbookView" element
     */
    @Override
    public void removeCustomWorkbookView(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
