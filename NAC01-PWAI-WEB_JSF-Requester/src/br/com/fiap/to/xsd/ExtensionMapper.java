
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package br.com.fiap.to.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://exceptions.fiap.com.br/xsd".equals(namespaceURI) &&
                  "TipoDoadorException".equals(typeName)){
                   
                            return  br.com.fiap.exceptions.xsd.TipoDoadorException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://to.fiap.com.br/xsd".equals(namespaceURI) &&
                  "DoadorTO".equals(typeName)){
                   
                            return  br.com.fiap.to.xsd.DoadorTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.fiap.com.br/xsd".equals(namespaceURI) &&
                  "PasswordException".equals(typeName)){
                   
                            return  br.com.fiap.exceptions.xsd.PasswordException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.fiap.com.br/xsd".equals(namespaceURI) &&
                  "EmailNomeException".equals(typeName)){
                   
                            return  br.com.fiap.exceptions.xsd.EmailNomeException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bo.fiap.com.br".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  br.com.fiap.bo.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.fiap.com.br/xsd".equals(namespaceURI) &&
                  "IdNotFoundException".equals(typeName)){
                   
                            return  br.com.fiap.exceptions.xsd.IdNotFoundException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.fiap.com.br/xsd".equals(namespaceURI) &&
                  "DBCommitException".equals(typeName)){
                   
                            return  br.com.fiap.exceptions.xsd.DBCommitException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    