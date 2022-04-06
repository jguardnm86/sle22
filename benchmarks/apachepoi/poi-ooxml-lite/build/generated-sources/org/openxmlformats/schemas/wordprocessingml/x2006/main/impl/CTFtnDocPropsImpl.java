/*
 * XML Type:  CT_FtnDocProps
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_FtnDocProps(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFtnDocPropsImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFtnPropsImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps {
    private static final long serialVersionUID = 1L;

    public CTFtnDocPropsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnote"),
    };


    /**
     * Gets a List of "footnote" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef> getFootnoteList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFootnoteArray,
                this::setFootnoteArray,
                this::insertNewFootnote,
                this::removeFootnote,
                this::sizeOfFootnoteArray
            );
        }
    }

    /**
     * Gets array of all "footnote" elements
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] getFootnoteArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[0]);
    }

    /**
     * Gets ith "footnote" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef getFootnoteArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "footnote" element
     */
    @Override
    public int sizeOfFootnoteArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "footnote" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFootnoteArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef[] footnoteArray) {
        check_orphaned();
        arraySetterHelper(footnoteArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "footnote" element
     */
    @Override
    public void setFootnoteArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef footnote) {
        generatedSetterHelperImpl(footnote, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef insertNewFootnote(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef addNewFootnote() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnSepRef)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "footnote" element
     */
    @Override
    public void removeFootnote(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
