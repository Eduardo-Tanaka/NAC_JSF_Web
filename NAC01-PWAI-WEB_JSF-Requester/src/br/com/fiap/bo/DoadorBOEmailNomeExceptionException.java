
/**
 * DoadorBOEmailNomeExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.fiap.bo;

public class DoadorBOEmailNomeExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1430310570742L;
    
    private br.com.fiap.bo.DoadorBOEmailNomeException faultMessage;

    
        public DoadorBOEmailNomeExceptionException() {
            super("DoadorBOEmailNomeExceptionException");
        }

        public DoadorBOEmailNomeExceptionException(java.lang.String s) {
           super(s);
        }

        public DoadorBOEmailNomeExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DoadorBOEmailNomeExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.fiap.bo.DoadorBOEmailNomeException msg){
       faultMessage = msg;
    }
    
    public br.com.fiap.bo.DoadorBOEmailNomeException getFaultMessage(){
       return faultMessage;
    }
}
    