
/**
 * DoadorBOMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package br.com.fiap.bo;

        /**
        *  DoadorBOMessageReceiverInOut message receiver
        */

        public class DoadorBOMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        DoadorBOSkeleton skel = (DoadorBOSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("findById".equals(methodName)){
                
                br.com.fiap.bo.FindByIdResponse findByIdResponse29 = null;
	                        br.com.fiap.bo.FindById wrappedParam =
                                                             (br.com.fiap.bo.FindById)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.com.fiap.bo.FindById.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               findByIdResponse29 =
                                                   
                                                   
                                                         skel.findById(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), findByIdResponse29, false, new javax.xml.namespace.QName("http://bo.fiap.com.br",
                                                    "findById"));
                                    } else 

            if("logar".equals(methodName)){
                
                br.com.fiap.bo.LogarResponse logarResponse31 = null;
	                        br.com.fiap.bo.Logar wrappedParam =
                                                             (br.com.fiap.bo.Logar)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.com.fiap.bo.Logar.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               logarResponse31 =
                                                   
                                                   
                                                         skel.logar(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), logarResponse31, false, new javax.xml.namespace.QName("http://bo.fiap.com.br",
                                                    "logar"));
                                    } else 

            if("delete".equals(methodName)){
                
                br.com.fiap.bo.DeleteResponse deleteResponse33 = null;
	                        br.com.fiap.bo.Delete wrappedParam =
                                                             (br.com.fiap.bo.Delete)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.com.fiap.bo.Delete.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteResponse33 =
                                                   
                                                   
                                                         skel.delete(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteResponse33, false, new javax.xml.namespace.QName("http://bo.fiap.com.br",
                                                    "delete"));
                                    } else 

            if("findAll".equals(methodName)){
                
                br.com.fiap.bo.FindAllResponse findAllResponse35 = null;
	                        br.com.fiap.bo.FindAll wrappedParam =
                                                             (br.com.fiap.bo.FindAll)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.com.fiap.bo.FindAll.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               findAllResponse35 =
                                                   
                                                   
                                                         skel.findAll(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), findAllResponse35, false, new javax.xml.namespace.QName("http://bo.fiap.com.br",
                                                    "findAll"));
                                    } else 

            if("update".equals(methodName)){
                
                br.com.fiap.bo.UpdateResponse updateResponse37 = null;
	                        br.com.fiap.bo.Update wrappedParam =
                                                             (br.com.fiap.bo.Update)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.com.fiap.bo.Update.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateResponse37 =
                                                   
                                                   
                                                         skel.update(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateResponse37, false, new javax.xml.namespace.QName("http://bo.fiap.com.br",
                                                    "update"));
                                    } else 

            if("create".equals(methodName)){
                
                br.com.fiap.bo.CreateResponse createResponse39 = null;
	                        br.com.fiap.bo.Create wrappedParam =
                                                             (br.com.fiap.bo.Create)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.com.fiap.bo.Create.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createResponse39 =
                                                   
                                                   
                                                         skel.create(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createResponse39, false, new javax.xml.namespace.QName("http://bo.fiap.com.br",
                                                    "create"));
                                    } else 

            if("searchByEmail".equals(methodName)){
                
                br.com.fiap.bo.SearchByEmailResponse searchByEmailResponse41 = null;
	                        br.com.fiap.bo.SearchByEmail wrappedParam =
                                                             (br.com.fiap.bo.SearchByEmail)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    br.com.fiap.bo.SearchByEmail.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               searchByEmailResponse41 =
                                                   
                                                   
                                                         skel.searchByEmail(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), searchByEmailResponse41, false, new javax.xml.namespace.QName("http://bo.fiap.com.br",
                                                    "searchByEmail"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (DoadorBOExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DoadorBOException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (DoadorBOIdNotFoundExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DoadorBOIdNotFoundException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (DoadorBODBCommitExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DoadorBODBCommitException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (DoadorBOPasswordCheckException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DoadorBOPasswordCheck");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.FindById param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.FindById.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.FindByIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.FindByIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.Logar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.Logar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.LogarResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.LogarResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.DoadorBOException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.DoadorBOException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.Delete param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.Delete.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.DeleteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.DeleteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.DoadorBOIdNotFoundException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.DoadorBOIdNotFoundException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.DoadorBODBCommitException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.DoadorBODBCommitException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.FindAll param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.FindAll.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.FindAllResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.FindAllResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.Update param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.Update.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.UpdateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.UpdateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.Create param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.Create.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.CreateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.CreateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.DoadorBOPasswordCheck param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.DoadorBOPasswordCheck.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.SearchByEmail param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.SearchByEmail.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.fiap.bo.SearchByEmailResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.fiap.bo.SearchByEmailResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.fiap.bo.FindByIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.com.fiap.bo.FindByIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.com.fiap.bo.FindByIdResponse wrapfindById(){
                                br.com.fiap.bo.FindByIdResponse wrappedElement = new br.com.fiap.bo.FindByIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.fiap.bo.LogarResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.com.fiap.bo.LogarResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.com.fiap.bo.LogarResponse wraplogar(){
                                br.com.fiap.bo.LogarResponse wrappedElement = new br.com.fiap.bo.LogarResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.fiap.bo.DeleteResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.com.fiap.bo.DeleteResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.com.fiap.bo.DeleteResponse wrapdelete(){
                                br.com.fiap.bo.DeleteResponse wrappedElement = new br.com.fiap.bo.DeleteResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.fiap.bo.FindAllResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.com.fiap.bo.FindAllResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.com.fiap.bo.FindAllResponse wrapfindAll(){
                                br.com.fiap.bo.FindAllResponse wrappedElement = new br.com.fiap.bo.FindAllResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.fiap.bo.UpdateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.com.fiap.bo.UpdateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.com.fiap.bo.UpdateResponse wrapupdate(){
                                br.com.fiap.bo.UpdateResponse wrappedElement = new br.com.fiap.bo.UpdateResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.fiap.bo.CreateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.com.fiap.bo.CreateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.com.fiap.bo.CreateResponse wrapcreate(){
                                br.com.fiap.bo.CreateResponse wrappedElement = new br.com.fiap.bo.CreateResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.fiap.bo.SearchByEmailResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(br.com.fiap.bo.SearchByEmailResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private br.com.fiap.bo.SearchByEmailResponse wrapsearchByEmail(){
                                br.com.fiap.bo.SearchByEmailResponse wrappedElement = new br.com.fiap.bo.SearchByEmailResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (br.com.fiap.bo.FindById.class.equals(type)){
                
                           return br.com.fiap.bo.FindById.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.FindByIdResponse.class.equals(type)){
                
                           return br.com.fiap.bo.FindByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.Logar.class.equals(type)){
                
                           return br.com.fiap.bo.Logar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.LogarResponse.class.equals(type)){
                
                           return br.com.fiap.bo.LogarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.DoadorBOException.class.equals(type)){
                
                           return br.com.fiap.bo.DoadorBOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.Delete.class.equals(type)){
                
                           return br.com.fiap.bo.Delete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.DeleteResponse.class.equals(type)){
                
                           return br.com.fiap.bo.DeleteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.DoadorBOIdNotFoundException.class.equals(type)){
                
                           return br.com.fiap.bo.DoadorBOIdNotFoundException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.DoadorBODBCommitException.class.equals(type)){
                
                           return br.com.fiap.bo.DoadorBODBCommitException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.FindAll.class.equals(type)){
                
                           return br.com.fiap.bo.FindAll.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.FindAllResponse.class.equals(type)){
                
                           return br.com.fiap.bo.FindAllResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.Update.class.equals(type)){
                
                           return br.com.fiap.bo.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.UpdateResponse.class.equals(type)){
                
                           return br.com.fiap.bo.UpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.DoadorBODBCommitException.class.equals(type)){
                
                           return br.com.fiap.bo.DoadorBODBCommitException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.Create.class.equals(type)){
                
                           return br.com.fiap.bo.Create.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.CreateResponse.class.equals(type)){
                
                           return br.com.fiap.bo.CreateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.DoadorBODBCommitException.class.equals(type)){
                
                           return br.com.fiap.bo.DoadorBODBCommitException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.DoadorBOPasswordCheck.class.equals(type)){
                
                           return br.com.fiap.bo.DoadorBOPasswordCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.SearchByEmail.class.equals(type)){
                
                           return br.com.fiap.bo.SearchByEmail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (br.com.fiap.bo.SearchByEmailResponse.class.equals(type)){
                
                           return br.com.fiap.bo.SearchByEmailResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    