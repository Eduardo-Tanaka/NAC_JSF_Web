
/**
 * DoadorBODBCommitExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.fiap.bo;

public class DoadorBODBCommitExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1430310570742L;
    
    private br.com.fiap.bo.DoadorBODBCommitException faultMessage;

    
        public DoadorBODBCommitExceptionException() {
            super("DoadorBODBCommitExceptionException");
        }

        public DoadorBODBCommitExceptionException(java.lang.String s) {
           super(s);
        }

        public DoadorBODBCommitExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DoadorBODBCommitExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.fiap.bo.DoadorBODBCommitException msg){
       faultMessage = msg;
    }
    
    public br.com.fiap.bo.DoadorBODBCommitException getFaultMessage(){
       return faultMessage;
    }
}
    