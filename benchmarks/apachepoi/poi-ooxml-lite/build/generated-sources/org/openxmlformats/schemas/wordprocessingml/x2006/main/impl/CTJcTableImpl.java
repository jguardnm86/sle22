/*
 * XML Type:  CT_JcTable
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJcTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_JcTable(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTJcTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJcTable {
    private static final long serialVersionUID = 1L;

    public CTJcTableImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val"),
    };


    /**
     * Gets the "val" attribute
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable.Enum getVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable.Enum val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable val) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STJcTable)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(val);
        }
    }
}
