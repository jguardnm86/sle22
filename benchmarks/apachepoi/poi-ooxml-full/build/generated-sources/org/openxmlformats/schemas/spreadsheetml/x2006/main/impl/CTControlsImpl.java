/*
 * XML Type:  CT_Controls
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_Controls(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTControlsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls {
    private static final long serialVersionUID = 1L;

    public CTControlsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "control"),
    };


    /**
     * Gets a List of "control" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl> getControlList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getControlArray,
                this::setControlArray,
                this::insertNewControl,
                this::removeControl,
                this::sizeOfControlArray
            );
        }
    }

    /**
     * Gets array of all "control" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl[] getControlArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl[0]);
    }

    /**
     * Gets ith "control" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl getControlArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "control" element
     */
    @Override
    public int sizeOfControlArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "control" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setControlArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl[] controlArray) {
        check_orphaned();
        arraySetterHelper(controlArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "control" element
     */
    @Override
    public void setControlArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl control) {
        generatedSetterHelperImpl(control, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "control" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl insertNewControl(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "control" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl addNewControl() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "control" element
     */
    @Override
    public void removeControl(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
