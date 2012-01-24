/**
 * ResDea_Tk25.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.nrw.lds.tipi.inka.response;

public class ResDea_Tk25  extends de.nrw.lds.tipi.inka.general.ResKatalog  implements java.io.Serializable {
    private de.nrw.lds.tipi.inka.Dea_Tk25[] arrDea_Tk25;

    public ResDea_Tk25() {
    }

    public ResDea_Tk25(
           de.nrw.lds.tipi.inka.general.ResError errorObject,
           java.util.Calendar serverTimestamp,
           java.lang.Integer numberOfAllObjects,
           java.lang.Integer numberOfObjects,
           java.lang.Integer startsFromObject,
           de.nrw.lds.tipi.inka.Dea_Tk25[] arrDea_Tk25) {
        super(
            errorObject,
            serverTimestamp,
            numberOfAllObjects,
            numberOfObjects,
            startsFromObject);
        this.arrDea_Tk25 = arrDea_Tk25;
    }


    /**
     * Gets the arrDea_Tk25 value for this ResDea_Tk25.
     * 
     * @return arrDea_Tk25
     */
    public de.nrw.lds.tipi.inka.Dea_Tk25[] getArrDea_Tk25() {
        return arrDea_Tk25;
    }


    /**
     * Sets the arrDea_Tk25 value for this ResDea_Tk25.
     * 
     * @param arrDea_Tk25
     */
    public void setArrDea_Tk25(de.nrw.lds.tipi.inka.Dea_Tk25[] arrDea_Tk25) {
        this.arrDea_Tk25 = arrDea_Tk25;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResDea_Tk25)) return false;
        ResDea_Tk25 other = (ResDea_Tk25) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arrDea_Tk25==null && other.getArrDea_Tk25()==null) || 
             (this.arrDea_Tk25!=null &&
              java.util.Arrays.equals(this.arrDea_Tk25, other.getArrDea_Tk25())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getArrDea_Tk25() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrDea_Tk25());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrDea_Tk25(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResDea_Tk25.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.inka.tipi.lds.nrw.de", "ResDea_Tk25"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrDea_Tk25");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrDea_Tk25"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://inka.tipi.lds.nrw.de", "Dea_Tk25"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
