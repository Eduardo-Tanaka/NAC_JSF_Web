
/**
 * DoadorBOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.fiap.bo;

public class DoadorBOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1429642552262L;
    
    private br.com.fiap.bo.DoadorBOException faultMessage;

    
        public DoadorBOExceptionException() {
            super("DoadorBOExceptionException");
        }

        public DoadorBOExceptionException(java.lang.String s) {
           super(s);
        }

        public DoadorBOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DoadorBOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.fiap.bo.DoadorBOException msg){
       faultMessage = msg;
    }
    
    public br.com.fiap.bo.DoadorBOException getFaultMessage(){
       return faultMessage;
    }
}
    