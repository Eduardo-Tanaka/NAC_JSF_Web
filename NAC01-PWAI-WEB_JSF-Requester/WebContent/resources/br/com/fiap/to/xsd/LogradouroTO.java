
/**
 * LogradouroTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package br.com.fiap.to.xsd;
            

            /**
            *  LogradouroTO bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LogradouroTO
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LogradouroTO
                Namespace URI = http://to.fiap.com.br/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Bairro
                        */

                        
                                    protected br.com.fiap.to.xsd.BairroTO localBairro ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBairroTracker = false ;

                           public boolean isBairroSpecified(){
                               return localBairroTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return br.com.fiap.to.xsd.BairroTO
                           */
                           public  br.com.fiap.to.xsd.BairroTO getBairro(){
                               return localBairro;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Bairro
                               */
                               public void setBairro(br.com.fiap.to.xsd.BairroTO param){
                            localBairroTracker = true;
                                   
                                            this.localBairro=param;
                                    

                               }
                            

                        /**
                        * field for Cep
                        */

                        
                                    protected int localCep ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCepTracker = false ;

                           public boolean isCepSpecified(){
                               return localCepTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCep(){
                               return localCep;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cep
                               */
                               public void setCep(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCepTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCep=param;
                                    

                               }
                            

                        /**
                        * field for Doadores
                        */

                        
                                    protected java.lang.Object localDoadores ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoadoresTracker = false ;

                           public boolean isDoadoresSpecified(){
                               return localDoadoresTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getDoadores(){
                               return localDoadores;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Doadores
                               */
                               public void setDoadores(java.lang.Object param){
                            localDoadoresTracker = true;
                                   
                                            this.localDoadores=param;
                                    

                               }
                            

                        /**
                        * field for Logradouro
                        */

                        
                                    protected java.lang.String localLogradouro ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogradouroTracker = false ;

                           public boolean isLogradouroSpecified(){
                               return localLogradouroTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogradouro(){
                               return localLogradouro;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Logradouro
                               */
                               public void setLogradouro(java.lang.String param){
                            localLogradouroTracker = true;
                                   
                                            this.localLogradouro=param;
                                    

                               }
                            

                        /**
                        * field for TipoLogradouro
                        */

                        
                                    protected br.com.fiap.to.xsd.TipoLogradouroTO localTipoLogradouro ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTipoLogradouroTracker = false ;

                           public boolean isTipoLogradouroSpecified(){
                               return localTipoLogradouroTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return br.com.fiap.to.xsd.TipoLogradouroTO
                           */
                           public  br.com.fiap.to.xsd.TipoLogradouroTO getTipoLogradouro(){
                               return localTipoLogradouro;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TipoLogradouro
                               */
                               public void setTipoLogradouro(br.com.fiap.to.xsd.TipoLogradouroTO param){
                            localTipoLogradouroTracker = true;
                                   
                                            this.localTipoLogradouro=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://to.fiap.com.br/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":LogradouroTO",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "LogradouroTO",
                           xmlWriter);
                   }

               
                   }
                if (localBairroTracker){
                                    if (localBairro==null){

                                        writeStartElement(null, "http://to.fiap.com.br/xsd", "bairro", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBairro.serialize(new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","bairro"),
                                        xmlWriter);
                                    }
                                } if (localCepTracker){
                                    namespace = "http://to.fiap.com.br/xsd";
                                    writeStartElement(null, namespace, "cep", xmlWriter);
                             
                                               if (localCep==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cep cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCep));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoadoresTracker){
                            
                            if (localDoadores!=null){
                                if (localDoadores instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localDoadores).serialize(
                                               new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","doadores"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://to.fiap.com.br/xsd", "doadores", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localDoadores, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://to.fiap.com.br/xsd", "doadores", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localLogradouroTracker){
                                    namespace = "http://to.fiap.com.br/xsd";
                                    writeStartElement(null, namespace, "logradouro", xmlWriter);
                             

                                          if (localLogradouro==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogradouro);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTipoLogradouroTracker){
                                    if (localTipoLogradouro==null){

                                        writeStartElement(null, "http://to.fiap.com.br/xsd", "tipoLogradouro", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTipoLogradouro.serialize(new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","tipoLogradouro"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://to.fiap.com.br/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localBairroTracker){
                            elementList.add(new javax.xml.namespace.QName("http://to.fiap.com.br/xsd",
                                                                      "bairro"));
                            
                            
                                    elementList.add(localBairro==null?null:
                                    localBairro);
                                } if (localCepTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://to.fiap.com.br/xsd",
                                                                      "cep"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCep));
                            } if (localDoadoresTracker){
                            elementList.add(new javax.xml.namespace.QName("http://to.fiap.com.br/xsd",
                                                                      "doadores"));
                            
                            
                                    elementList.add(localDoadores==null?null:
                                    localDoadores);
                                } if (localLogradouroTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://to.fiap.com.br/xsd",
                                                                      "logradouro"));
                                 
                                         elementList.add(localLogradouro==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogradouro));
                                    } if (localTipoLogradouroTracker){
                            elementList.add(new javax.xml.namespace.QName("http://to.fiap.com.br/xsd",
                                                                      "tipoLogradouro"));
                            
                            
                                    elementList.add(localTipoLogradouro==null?null:
                                    localTipoLogradouro);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LogradouroTO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LogradouroTO object =
                new LogradouroTO();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LogradouroTO".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LogradouroTO)br.com.fiap.to.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","bairro").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBairro(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBairro(br.com.fiap.to.xsd.BairroTO.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","cep").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cep" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCep(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCep(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","doadores").equals(reader.getName())){
                                
                                     object.setDoadores(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                br.com.fiap.to.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","logradouro").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogradouro(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://to.fiap.com.br/xsd","tipoLogradouro").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTipoLogradouro(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTipoLogradouro(br.com.fiap.to.xsd.TipoLogradouroTO.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    