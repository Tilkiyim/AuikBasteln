/**
 * ResDea_Wz_Code.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.nrw.lds.tipi.inka.response;

public class ResDea_Wz_Code  extends de.nrw.lds.tipi.inka.general.ResKatalog  implements java.io.Serializable {
    private de.nrw.lds.tipi.inka.Dea_Wz_Code[] arrDea_Wz_Code;

    public ResDea_Wz_Code() {
    }

    public ResDea_Wz_Code(
           de.nrw.lds.tipi.inka.general.ResError errorObject,
           java.util.Calendar serverTimestamp,
           java.lang.Integer numberOfAllObjects,
           java.lang.Integer numberOfObjects,
           java.lang.Integer startsFromObject,
           de.nrw.lds.tipi.inka.Dea_Wz_Code[] arrDea_Wz_Code) {
        super(
            errorObject,
            serverTimestamp,
            numberOfAllObjects,
            numberOfObjects,
            startsFromObject);
        this.arrDea_Wz_Code = arrDea_Wz_Code;
    }


    /**
     * Gets the arrDea_Wz_Code value for this ResDea_Wz_Code.
     * 
     * @return arrDea_Wz_Code
     */
    public de.nrw.lds.tipi.inka.Dea_Wz_Code[] getArrDea_Wz_Code() {
        return arrDea_Wz_Code;
    }


    /**
     * Sets the arrDea_Wz_Code value for this ResDea_Wz_Code.
     * 
     * @param arrDea_Wz_Code
     */
    public void setArrDea_Wz_Code(de.nrw.lds.tipi.inka.Dea_Wz_Code[] arrDea_Wz_Code) {
        this.arrDea_Wz_Code = arrDea_Wz_Code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResDea_Wz_Code)) return false;
        ResDea_Wz_Code other = (ResDea_Wz_Code) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arrDea_Wz_Code==null && other.getArrDea_Wz_Code()==null) || 
             (this.arrDea_Wz_Code!=null &&
              java.util.Arrays.equals(this.arrDea_Wz_Code, other.getArrDea_Wz_Code())));
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
        if (getArrDea_Wz_Code() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrDea_Wz_Code());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrDea_Wz_Code(), i);
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
        new org.apache.axis.description.TypeDesc(ResDea_Wz_Code.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.inka.tipi.lds.nrw.de", "ResDea_Wz_Code"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrDea_Wz_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrDea_Wz_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://inka.tipi.lds.nrw.de", "Dea_Wz_Code"));
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
