
/**
 * DoadorBOIdNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.fiap.bo;

public class DoadorBOIdNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1429642552268L;
    
    private br.com.fiap.bo.DoadorBOIdNotFoundException faultMessage;

    
        public DoadorBOIdNotFoundExceptionException() {
            super("DoadorBOIdNotFoundExceptionException");
        }

        public DoadorBOIdNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public DoadorBOIdNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DoadorBOIdNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.fiap.bo.DoadorBOIdNotFoundException msg){
       faultMessage = msg;
    }
    
    public br.com.fiap.bo.DoadorBOIdNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    