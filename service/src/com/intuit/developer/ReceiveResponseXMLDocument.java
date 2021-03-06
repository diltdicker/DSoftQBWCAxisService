/*
 * An XML document type.
 * Localname: receiveResponseXML
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ReceiveResponseXMLDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer;


/**
 * A document containing one receiveResponseXML(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public interface ReceiveResponseXMLDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReceiveResponseXMLDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("receiveresponsexml13e9doctype");
    
    /**
     * Gets the "receiveResponseXML" element
     */
    com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML getReceiveResponseXML();
    
    /**
     * Sets the "receiveResponseXML" element
     */
    void setReceiveResponseXML(com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML receiveResponseXML);
    
    /**
     * Appends and returns a new empty "receiveResponseXML" element
     */
    com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML addNewReceiveResponseXML();
    
    /**
     * An XML receiveResponseXML(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public interface ReceiveResponseXML extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReceiveResponseXML.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("receiveresponsexml59f8elemtype");
        
        /**
         * Gets the "ticket" element
         */
        java.lang.String getTicket();
        
        /**
         * Gets (as xml) the "ticket" element
         */
        org.apache.xmlbeans.XmlString xgetTicket();
        
        /**
         * True if has "ticket" element
         */
        boolean isSetTicket();
        
        /**
         * Sets the "ticket" element
         */
        void setTicket(java.lang.String ticket);
        
        /**
         * Sets (as xml) the "ticket" element
         */
        void xsetTicket(org.apache.xmlbeans.XmlString ticket);
        
        /**
         * Unsets the "ticket" element
         */
        void unsetTicket();
        
        /**
         * Gets the "response" element
         */
        java.lang.String getResponse();
        
        /**
         * Gets (as xml) the "response" element
         */
        org.apache.xmlbeans.XmlString xgetResponse();
        
        /**
         * True if has "response" element
         */
        boolean isSetResponse();
        
        /**
         * Sets the "response" element
         */
        void setResponse(java.lang.String response);
        
        /**
         * Sets (as xml) the "response" element
         */
        void xsetResponse(org.apache.xmlbeans.XmlString response);
        
        /**
         * Unsets the "response" element
         */
        void unsetResponse();
        
        /**
         * Gets the "hresult" element
         */
        java.lang.String getHresult();
        
        /**
         * Gets (as xml) the "hresult" element
         */
        org.apache.xmlbeans.XmlString xgetHresult();
        
        /**
         * True if has "hresult" element
         */
        boolean isSetHresult();
        
        /**
         * Sets the "hresult" element
         */
        void setHresult(java.lang.String hresult);
        
        /**
         * Sets (as xml) the "hresult" element
         */
        void xsetHresult(org.apache.xmlbeans.XmlString hresult);
        
        /**
         * Unsets the "hresult" element
         */
        void unsetHresult();
        
        /**
         * Gets the "message" element
         */
        java.lang.String getMessage();
        
        /**
         * Gets (as xml) the "message" element
         */
        org.apache.xmlbeans.XmlString xgetMessage();
        
        /**
         * True if has "message" element
         */
        boolean isSetMessage();
        
        /**
         * Sets the "message" element
         */
        void setMessage(java.lang.String message);
        
        /**
         * Sets (as xml) the "message" element
         */
        void xsetMessage(org.apache.xmlbeans.XmlString message);
        
        /**
         * Unsets the "message" element
         */
        void unsetMessage();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML newInstance() {
              return (com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intuit.developer.ReceiveResponseXMLDocument.ReceiveResponseXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intuit.developer.ReceiveResponseXMLDocument newInstance() {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.ReceiveResponseXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.ReceiveResponseXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
