
/**
 * DoadorBOPasswordExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.fiap.bo;

public class DoadorBOPasswordExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1430310570726L;
    
    private br.com.fiap.bo.DoadorBOPasswordException faultMessage;

    
        public DoadorBOPasswordExceptionException() {
            super("DoadorBOPasswordExceptionException");
        }

        public DoadorBOPasswordExceptionException(java.lang.String s) {
           super(s);
        }

        public DoadorBOPasswordExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DoadorBOPasswordExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.fiap.bo.DoadorBOPasswordException msg){
       faultMessage = msg;
    }
    
    public br.com.fiap.bo.DoadorBOPasswordException getFaultMessage(){
       return faultMessage;
    }
}
    